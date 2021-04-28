package com.theoxao.iota.handler.groovy.ast

import com.theoxao.iota.handler.groovy.annotations.Main
import groovy.transform.Field
import org.codehaus.groovy.ast.ClassHelper.make
import org.codehaus.groovy.ast.ClassNode

object JavaNodes {
    val stringNode = make(String::class.java)!!
    val metaApiNode = make(MetaApi::class.java)!!
    val listNode = make(List::class.java)!!
    val anyNode = make(Any::class.java)!!
    val exceptionNode = make(Exception::class.java)!!
    val fieldAnnotationNode = make(Field::class.java)
    val mainNode = make(Main::class.java)

    val tsNode: ClassNode? = try {
        make(Class.forName("org.springframework.transaction.TransactionStatus"))
    } catch (ignore: ClassNotFoundException) {
        null
    }
    val tmNode: ClassNode? = try {
        make(Class.forName("org.springframework.transaction.PlatformTransactionManager"))
    } catch (ignore: ClassNotFoundException) {
        null
    }
    val transactionDefinitionNode: ClassNode? = try {
        make(Class.forName("org.springframework.transaction.support.DefaultTransactionDefinition"))
    } catch (ignore: ClassNotFoundException) {
        null
    }
}
