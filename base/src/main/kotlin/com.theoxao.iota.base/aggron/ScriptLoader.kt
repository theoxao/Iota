package com.theoxao.iota.base.aggron

import com.theoxao.iota.base.model.ScriptModel

/**
 * @author theoxao
 * @date 2019/5/28
 */
abstract class ScriptLoader {
    companion object {
        const val iotakiFileName = "iotaki.yaml"
    }

    var scriptCache = mutableListOf<ScriptModel>()

    var autoLoad = false

    var basePath: String? = null

    abstract fun refreshAll()

    abstract suspend fun notifyChanged()

    abstract suspend fun load(): List<ScriptModel>

    fun whenDelete(listener: (ScriptModel) -> Unit) {

    }

    fun whenCreate(listener: (ScriptModel) -> Unit) {

    }

    fun whenUpdate(listener: (ScriptModel) -> Unit) {

    }

}
