package com.theoxao.iota.handler.groovy

import groovy.lang.*
import groovy.util.DelegatingScript
import org.codehaus.groovy.runtime.InvokerHelper
import org.codehaus.groovy.runtime.InvokerInvocationException
import java.util.Map

/**
 * @author theo
 * @date 19-8-23
 */
class IotaInvokeHelper : InvokerHelper() {
    companion object {
        private val EMPTY_MAIN_ARGS = arrayOf<Any>(arrayOfNulls<String>(0))
        val MAIN_METHOD_NAME = "main"

        fun createScript(scriptClass: Class<*>?, context: Binding): Script {
            val script: Script

            if (scriptClass == null) {
                script = NullScript(context)
            } else {
                try {
                    if (Script::class.java.isAssignableFrom(scriptClass)) {
                        script = newScript(scriptClass, context)
                    } else {
                        val `object` = scriptClass.newInstance() as GroovyObject
                        // it could just be a class, so let's wrap it in a Script
                        // wrapper; though the bindings will be ignored
                        script = object : DelegatingScript(context) {
                            override fun run(): Any? {
                                return null
                            }
                        }
                        script.delegate = `object`
                        val variables = context.variables
                        val mc = getMetaClass(`object`)
                        for (o in variables.entries) {
                            val entry = o as Map.Entry<*, *>
                            val key = entry.key.toString()
                            // assume underscore variables are for the wrapper script
                            setPropertySafe(if (key.startsWith("_")) script else `object`, mc, key, entry.value)
                        }
                    }
                } catch (e: Exception) {
                    throw GroovyRuntimeException(
                        "Failed to create Script instance for class: "
                                + scriptClass + ". Reason: " + e, e
                    )
                }
            }
            return script
        }

        private fun setPropertySafe(`object`: Any, mc: MetaClass, key: String, value: Any) {
            try {
                mc.setProperty(`object`, key, value)
            } catch (mpe: MissingPropertyException) {
                // Ignore
            } catch (iie: InvokerInvocationException) {
                // GROOVY-5802 IAE for missing properties with classes that extend List
                val cause = iie.cause as? IllegalArgumentException ?: throw iie
            }

        }
    }

    internal class NullScript @JvmOverloads constructor(context: Binding = Binding()) : Script(context) {
        override fun run(): Any? {
            return null
        }
    }
}