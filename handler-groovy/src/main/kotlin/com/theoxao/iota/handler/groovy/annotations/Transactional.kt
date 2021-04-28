package com.theoxao.iota.handler.groovy.annotations

import org.codehaus.groovy.transform.GroovyASTTransformationClass


/**
 * @author theo
 * @date 2019/6/26
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.TYPE)
@GroovyASTTransformationClass("com.theoxao.iota.handler.groovy.ast.TransactionASTTransform")
annotation class Transactional
