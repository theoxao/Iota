package com.theoxao.iota.handler.groovy

import com.theoxao.iota.base.bonsly.GroovyScriptHandler
import com.theoxao.iota.base.model.BeanInfo
import com.theoxao.iota.base.model.Dependency
import com.theoxao.iota.base.model.ScriptModel
import groovy.lang.MetaClass
import groovy.util.DelegatingScript
import org.codehaus.groovy.runtime.InvokerHelper
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component


@Component
class DefaultGroovyScriptHandler(
    applicationContext: ApplicationContext,
    private val groovyScriptParser: DefaultGroovyScriptParser
) : GroovyScriptHandler(applicationContext) {

    companion object {
        val log: Logger = LoggerFactory.getLogger(this::class.java.name)

    }

    init {
        supportedFileExtension = arrayOf("groovy", "java")
    }

    override suspend fun handle(target: List<ScriptModel>) {
        target.forEach {
            //FIXME if not config , try to use exist handler instead of fixed one
            val triggerName = it.config?.trigger?.get("name")
            val triggerHandler = if (triggerName != null) triggers[triggerName] else triggers.values.firstOrNull()
            if (triggerHandler == null) {
                log.debug("trigger named \"$triggerName\" does not exist , ignore script ${it.scriptSource.url.path}")
                return@forEach
            }
            val parsed = groovyScriptParser.parse(it.content)
            val obj: Any
            val metaClass: MetaClass
            if (parsed is DelegatingScript) {
                obj = parsed.delegate
                metaClass = InvokerHelper.getMetaClass(obj)
            } else {
                obj = parsed
                metaClass = parsed.metaClass
            }
            val methodName = groovyScriptParser.methodName(metaClass, obj)
            val method = metaClass.theClass.methods.firstOrNull { ce -> ce.name == methodName }
                ?: throw RuntimeException("method $methodName not found exception")
            groovyScriptParser.autowired(metaClass, obj)
            triggerHandler.register(it) { parameter ->
                metaClass.invokeMethod(
                    obj,
                    methodName,
                    parameter.invoke(method, ScriptParamNameDiscoverer(metaClass, obj))
                )
            }
        }
    }

    override fun getBean(scriptModel: ScriptModel): BeanInfo {
        val parsed = groovyScriptParser.parse(scriptModel.content)
        val obj: Any
        val metaClass: MetaClass
        if (parsed is DelegatingScript) {
            obj = parsed.delegate
            metaClass = InvokerHelper.getMetaClass(obj)
        } else {
            obj = parsed
            metaClass = parsed.metaClass
        }
        val beanNames = groovyScriptParser.autowiredBeans(metaClass, obj)
        return BeanInfo("bean", metaClass.theClass, beanNames.map { Dependency(it) })
    }

}

