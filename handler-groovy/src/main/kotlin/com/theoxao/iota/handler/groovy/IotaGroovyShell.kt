package com.theoxao.iota.handler.groovy

import groovy.lang.*
import org.codehaus.groovy.control.CompilationFailedException
import org.codehaus.groovy.control.CompilerConfiguration
import java.security.AccessController
import java.security.PrivilegedAction

/**
 * @author theo
 * @date 19-8-23
 */
class IotaGroovyShell() : GroovyShell() {

    private lateinit var loader: GroovyClassLoader
    private lateinit var bonslyContext: Binding
    private lateinit var config: CompilerConfiguration

    init {
        GroovyShell(null, Binding(), CompilerConfiguration.DEFAULT)
    }


    fun GroovyShell(parent: ClassLoader?, binding: Binding?, config: CompilerConfiguration?) {
        if (binding == null) {
            throw IllegalArgumentException("Binding must not be null.")
        }
        if (config == null) {
            throw IllegalArgumentException("Compiler configuration must not be null.")
        }
        val parentLoader = parent ?: GroovyShell::class.java.classLoader
        this.loader = AccessController.doPrivileged(PrivilegedAction { GroovyClassLoader(parentLoader, config) })
        this.bonslyContext = binding
        this.config = config
    }

    override fun parse(codeSource: GroovyCodeSource?): Script {
        return IotaInvokeHelper.createScript(parseClass(codeSource), bonslyContext)
    }

    @Throws(CompilationFailedException::class)
    private fun parseClass(codeSource: GroovyCodeSource?): Class<*> {
        // Don't cache scripts
        return loader.parseClass(codeSource, false)
    }

}