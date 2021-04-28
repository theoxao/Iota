package com.theoxao.iota.handler.groovy.annotations


/**
 * create by theoxao on 2019/7/9
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE)
annotation class PreParse(val type: String)