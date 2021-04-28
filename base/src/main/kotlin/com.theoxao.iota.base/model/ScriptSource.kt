package com.theoxao.iota.base.model

import java.net.URI

/**
 * @author theoxao
 * @date 2019/5/28
 */
class ScriptSource {

    lateinit var url: URI
    lateinit var content: String

    companion object {
        fun bkdrHash(str: String): Int {
            val seed = 131
            var hash = 0
            str.toCharArray().forEach {
                hash = (hash * seed) + it.toInt()
            }
            return hash.and(0x7FFFFFFF)
        }
    }

    constructor(url: URI, content: String) : this(url, content, content)

    constructor(url: URI, content: String, hash: Int) {
        this.url = url
        this.content = content
        this.hash = hash
    }

    constructor(url: URI, content: String, sha: String) : this(url, content, bkdrHash(sha))


    var hash: Int = 0

}