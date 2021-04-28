package com.theoxao.iota.base.model

/**
 * @author theo
 * @date 19-8-30
 */
class BeanInfo(var name: String, var bean: Class<*>, dependencies: List<Dependency>)


class Dependency(var name: String, var injected: Boolean = false)