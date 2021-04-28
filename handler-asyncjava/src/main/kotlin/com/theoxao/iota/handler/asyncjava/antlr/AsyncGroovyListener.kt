package com.theoxao.iota.handler.asyncjava.antlr

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.TokenStream
import org.antlr.v4.runtime.TokenStreamRewriter

/**
 * @author theo
 * @date 2019/7/8
 */
class AsyncGroovyListener(private val tokenStream: TokenStream) : JavaParserBaseListener() {
    var writer: TokenStreamRewriter = TokenStreamRewriter(tokenStream)
    var awaitVariableMap = mutableMapOf<String, ParserRuleContext>()
    var hasReturn: Boolean = false
    var awaitable: Boolean = false
    var hasClass: Boolean = false

    override fun enterAwaitExpression(ctx: JavaParser.AwaitExpressionContext) {
        awaitable = true
        ctx.AWAIT().let {
            writer.delete(it.symbol)
        }

        val unknown = ctx.parent.parent
        when (unknown) {
            is JavaParser.VariableInitializerContext -> {
                val vd = unknown.parent as JavaParser.VariableDeclaratorContext
                val variableName = vd.variableDeclaratorId().text
                writer.insertAfter(vd.variableDeclaratorId().stop, "Future")
                awaitVariableMap[vd.variableDeclaratorId().text] = ctx

                val lvd = vd.parent.parent as JavaParser.LocalVariableDeclarationContext
                writer.insertBefore(lvd.typeType().start, "CompletableFuture<")
                writer.insertAfter(lvd.typeType().stop, ">")
                val bs = lvd.parent as JavaParser.BlockStatementContext
                val block = lvd.parent.parent as JavaParser.BlockContext
                val md = block.parent.parent as JavaParser.MethodDeclarationContext
                if (md.typeTypeOrVoid().text != "void") {
                    hasReturn = true
                    writer.insertBefore(md.typeTypeOrVoid().start, "CompletableFuture<")
                    writer.insertAfter(md.typeTypeOrVoid().stop, ">")
                }

                writer.insertAfter(
                    bs.stop,
                    "\n ${if (hasReturn) "return " else ""}${variableName}Future.thenApply{ $variableName->\n"
                )
                writer.insertAfter(block.stop, "\n}")
            }
            is JavaParser.StatementContext -> {
                val md = unknown.parent.parent.parent.parent as JavaParser.MethodDeclarationContext
                if (md.typeTypeOrVoid().text != "void") {
                    hasReturn = true
                    writer.insertBefore(md.typeTypeOrVoid().start, "CompletableFuture<")
                    writer.insertAfter(md.typeTypeOrVoid().stop, ">")
                }
            }
        }
    }

    override fun enterPackageDeclaration(ctx: JavaParser.PackageDeclarationContext) {
        writer.insertAfter(ctx.stop, "import java.util.concurrent.CompletableFuture; \n")
    }

    override fun exitMethodBody(ctx: JavaParser.MethodBodyContext?) {
        awaitable = false
    }

    fun whatDidYouHear(): String {
        return writer.text
    }

}
