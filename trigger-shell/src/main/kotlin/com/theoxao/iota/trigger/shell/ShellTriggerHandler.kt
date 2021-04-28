package com.theoxao.iota.trigger.shell

import com.theoxao.iota.base.lileep.TriggerHandler
import com.theoxao.iota.base.model.ScriptModel
import org.springframework.core.ParameterNameDiscoverer
import org.springframework.shell.Shell
import org.springframework.stereotype.Component
import java.lang.reflect.Method

/**
 * @author theo
 * @date 19-8-13
 */
@Component
class ShellTriggerHandler(private val shell: Shell) : TriggerHandler() {


    override suspend fun unregister(hash: Int) {
        if (shell is IotaShell)
            shell.unregister(hash)
    }

    init {
        name = "shell"
    }

    override suspend fun register(
        scriptModel: ScriptModel,
        invokeScript: suspend (parameter: suspend (Method, ParameterNameDiscoverer) -> Array<*>?) -> Any?
    ) {
        if (shell is IotaShell)
            shell.register(scriptModel, invokeScript)
    }
}