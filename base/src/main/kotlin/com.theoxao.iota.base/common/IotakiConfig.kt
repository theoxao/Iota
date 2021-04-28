package com.theoxao.iota.base.common

class IotakiConfig {

    lateinit var ignore: List<String>

    var trigger: Map<String, String> = mutableMapOf()

    lateinit var bean: List<String>

    lateinit var except: List<Except>
}

class Except {
    lateinit var name: String
    lateinit var trigger: String
}
