package com.theoxao.iota.trigger.http

import com.theoxao.configuration.handlerParam
import com.theoxao.iota.base.lileep.TriggerHandler
import com.theoxao.iota.base.model.ScriptModel
import io.ktor.application.call
import io.ktor.http.HttpMethod
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.response.respond
import io.ktor.routing.*
import io.ktor.server.engine.ApplicationEngine
import io.ktor.util.AttributeKey
import io.ktor.util.Attributes
import io.ktor.util.pipeline.ContextDsl
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.future.await
import org.slf4j.LoggerFactory
import org.springframework.core.ParameterNameDiscoverer
import org.springframework.stereotype.Component
import java.lang.reflect.Method
import java.util.concurrent.CompletableFuture
import javax.annotation.Resource
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.jvm.javaField

/**
 * @author theoxao
 * @date 2019/5/28
 */
@Component
class HttpTriggerHandler(
    private val applicationEngine: ApplicationEngine
) : TriggerHandler() {

    @Resource
    lateinit var httpTriggerConfiguration: HttpTriggerConfiguration

    private val log = LoggerFactory.getLogger(this::class.java)

    companion object {
        const val triggerTypeKey = "type"
        const val ROUTE_DATA_REDIS_PREFIX: String = "route_data_"
    }

    private var baseRoute: Routing? = null

    init {
        name = "http"
        val attributes = applicationEngine.application.attributes
        val attribute = attributes.attribute("ApplicationFeatureRegistry") as Attributes
        val route: Any? = attribute.attribute("Routing")
        baseRoute = route as? Routing
    }

    @KtorExperimentalLocationsAPI
    override suspend fun register(
        scriptModel: ScriptModel,
        invokeScript: suspend (parameter: suspend (Method, ParameterNameDiscoverer) -> Array<*>?) -> Any?
    ) {
        val triggerConfig = scriptModel.config?.trigger
        val type = triggerConfig?.get(triggerTypeKey) ?: "path"
        if (type != "path") throw RuntimeException("currently, uri definition only support path type")
        var uri = scriptModel.scriptSource.url.path.removePrefix(scriptModel.loader.basePath ?: "")
        if (httpTriggerConfiguration.ignoreSuffix) uri = uri.replace(".${scriptModel.extension}", "")

        applicationEngine.application.routing {
            markedRoute(uri, HttpMethod.Get, scriptModel.scriptSource.hash.toString()) {
                log.info("add route {} , method:{}", uri, "GET")
                handle {
                    val result = invokeScript { method, discoverer ->
                        handlerParam(method, discoverer).params.map { it.value }.toTypedArray()
                    }
                    call.respond(
                        when (result) {
                            is Unit -> ""
                            is CompletableFuture<*> -> result.nestedAwait()
                            is Deferred<*> -> result.await() ?: ""
                            null -> "null"
                            else -> result
                        }
                    )
                }
            }
        }
    }

    override suspend fun unregister(hash: Int) {
        unregister(hash.toString())
    }

    @ContextDsl
    inline fun Route.markedRoute(path: String, method: HttpMethod, value: String, build: Route.() -> Unit): Route {
        val selector = HttpMethodRouteSelector(method)
        val createRouteFromPath = createRouteFromPath(path)
        val child = createRouteFromPath.createChild(selector)
        child.attributes.put(AttributeKey(value), ROUTE_DATA_REDIS_PREFIX + value)
        return child.apply(build)
    }

    private suspend fun CompletableFuture<*>.nestedAwait(): Any {
        val await = this.await()
        if (await is CompletableFuture<*>) {
            return await.nestedAwait()
        }
        return await
    }

    private fun unregister(id: String) {
        baseRoute?.childList()!!.forEach { parent ->
            val grandChildList = parent.childList()
            grandChildList.removeIf {
                val keys = it.attributes.allKeys.filter { ti -> ti.name == id }
                if (keys.isNotEmpty()) {
                    val key = keys[0] as? AttributeKey<String>
                    return@removeIf if (key != null) it.attributes.getOrNull(key) == id else false
                }
                false
            }
        }
    }

}

private fun Route.childList(): MutableList<Route> {
    val field =
        Route::class.declaredMemberProperties.stream().filter { it.name == "childList" }.findAny().get().javaField
    field?.isAccessible = true
    return field?.get(this) as MutableList<Route>
}

private fun Attributes.attribute(key: String): Any? {
    val keys = this.allKeys.filter { it.name == key }
    if (keys.isNotEmpty()) {
        return this.getOrNull(keys[0] as AttributeKey<Attributes>)
    }
    return null
}
