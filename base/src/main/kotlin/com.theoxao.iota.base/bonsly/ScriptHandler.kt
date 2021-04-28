package com.theoxao.iota.base.bonsly

import com.theoxao.iota.base.lileep.TriggerHandler
import com.theoxao.iota.base.model.BeanInfo
import com.theoxao.iota.base.model.ScriptModel


abstract class ScriptHandler {

    lateinit var supportedFileExtension: Array<String>

    lateinit var triggers: Map<String, TriggerHandler>

    abstract suspend fun handle(target: List<ScriptModel>)

    abstract fun getBean(scriptModel: ScriptModel): BeanInfo
}