package com.theoxao.iota.base.model

import com.theoxao.iota.base.aggron.ScriptLoader
import com.theoxao.iota.base.common.IotakiConfig

/**
 * @author theoxao
 * @date 2019/5/28
 */
class ScriptModel(
    var scriptSource: ScriptSource,
    var content: String,
    var extension: String,
    var loader: ScriptLoader,
    var config: IotakiConfig?,
    var shouldBean: Boolean = false
) {

    override fun toString(): String {
        return this.extension + "(" + this.scriptSource.url.toString() + ")"
    }
}
