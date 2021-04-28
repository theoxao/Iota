package com.theoxao.iota.base.model

import com.theoxao.iota.base.lileep.TriggerHandler

/**
 * @author theoxao
 * @date 2019/5/28
 */
class Trigger {

    lateinit var type: String

    lateinit var handler: Class<in TriggerHandler>

}