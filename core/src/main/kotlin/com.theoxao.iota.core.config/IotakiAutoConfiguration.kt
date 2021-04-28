package com.theoxao.iota.core.config

import com.theoxao.iota.base.aggron.ScriptLoader
import com.theoxao.iota.base.bonsly.ScriptHandler
import com.theoxao.iota.base.lileep.TriggerHandler
import com.theoxao.iota.base.model.BeanInfo
import com.theoxao.iota.base.model.ScriptModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Configuration

@Configuration
open class IotakiAutoConfiguration(
    private val applicationContext: ApplicationContext,
    private val beanHelper: BeanHelper
) {

    companion object {
        val log = LoggerFactory.getLogger(this::class.java.name)
    }

    private val scriptLoaders =
        applicationContext.getBeansOfType(ScriptLoader::class.java)

    private val scriptHandlers =
        applicationContext.getBeansOfType(ScriptHandler::class.java).values.associateBy { it.supportedFileExtension }

    private val triggerHandlers =
        applicationContext.getBeansOfType(TriggerHandler::class.java).values.associateBy { it.name }

    private val scriptHandlerCache: MutableMap<String, ScriptHandler> = mutableMapOf()

    init {
        GlobalScope.launch {
            val scripts = loadScript()?.groupBy({ it.extension }, { it })
            scripts?.forEach { ext, ss ->
                val handler = findHandler(ext)
                if (handler == null) {
                    log.debug("script handler which support \"$ext\" does not exist, skip all script with that extension")
                    return@forEach
                }
                ss.filter { it.shouldBean }.forEach {
                    val beanInfo: BeanInfo = handler.getBean(it)
                    beanHelper.registerBean(beanInfo)
                }
                this.launch {
                    handler.triggers = triggerHandlers
                    handler.handle(ss.filter { !it.shouldBean })
                }
            }
            //resolve dependencies
            beanHelper.resolveDependency()
        }
    }

    private fun findHandler(ext: String): ScriptHandler? {
        for (it in scriptHandlers) {
            if (it.key.contains(ext)) return it.value
        }
        return null
    }

    private suspend fun loadScript(): List<ScriptModel>? {
        return scriptLoaders.flatMap {
            it.value.load()
        }
    }

}
