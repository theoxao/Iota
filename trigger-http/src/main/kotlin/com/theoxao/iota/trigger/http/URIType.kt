package com.theoxao.lileep.http

/**
 * @author theoxao
 * @date 2019/5/28
 */
enum class URIType {

    PATH,
    ANNOTATION;

    companion object {
        fun from(name: String): URIType {
            for (value in values()) {
                if (value.name == name.toUpperCase()) return value
            }
            return PATH
        }
    }

}