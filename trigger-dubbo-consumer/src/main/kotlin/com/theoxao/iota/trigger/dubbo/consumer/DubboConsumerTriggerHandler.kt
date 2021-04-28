package com.theoxao.iota.trigger.dubbo.consumer

import com.theoxao.iota.base.lileep.TriggerHandler
import com.theoxao.iota.base.model.ScriptModel
import org.springframework.core.ParameterNameDiscoverer
import org.springframework.stereotype.Component
import java.lang.reflect.Method

@Component
class DubboConsumerTriggerHandler : TriggerHandler() {

    override suspend fun register(
        scriptModel: ScriptModel,
        invokeScript: suspend (parameter: suspend (Method, ParameterNameDiscoverer) -> Array<*>?) -> Any?
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun unregister(hash: Int) {
        TODO("Not yet implemented")
    }
}