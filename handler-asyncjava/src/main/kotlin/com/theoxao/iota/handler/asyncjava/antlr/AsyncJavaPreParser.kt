package com.theoxao.bonsly.aj.antlr

import com.theoxao.iota.handler.asyncjava.PreParser
import com.theoxao.iota.handler.asyncjava.antlr.AsyncGroovyListener
import com.theoxao.iota.handler.asyncjava.antlr.JavaLexer
import com.theoxao.iota.handler.asyncjava.antlr.JavaParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.springframework.stereotype.Component


/**
 * create by theoxao on 2019/7/9
 */
@Component
class AsyncJavaPreParser : PreParser {

    override fun preParse(text: String): String {
        val stream = ANTLRInputStream(text)
        val lexer = JavaLexer(stream)
        val tokenStream = CommonTokenStream(lexer)
        val javaParser = JavaParser(tokenStream)
        javaParser.removeErrorListeners()
        javaParser.errorHandler = DefaultErrorStrategy()
        val compilationUnit = javaParser.compilationUnit()
        val listener = AsyncGroovyListener(tokenStream)
        ParseTreeWalker.DEFAULT.walk(listener, compilationUnit)
        return listener.whatDidYouHear()
    }
}