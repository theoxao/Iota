package com.theoxao.iota.handler.groovy.ast

import com.theoxao.iota.handler.groovy.ast.JavaNodes.anyNode
import com.theoxao.iota.handler.groovy.ast.JavaNodes.exceptionNode
import com.theoxao.iota.handler.groovy.ast.JavaNodes.tmNode
import com.theoxao.iota.handler.groovy.ast.JavaNodes.transactionDefinitionNode
import com.theoxao.iota.handler.groovy.ast.JavaNodes.tsNode
import org.codehaus.groovy.GroovyBugError
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.*
import org.codehaus.groovy.ast.stmt.*
import org.codehaus.groovy.ast.tools.GenericsUtils
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.syntax.Token
import org.codehaus.groovy.syntax.Types
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation
import org.slf4j.LoggerFactory


/**
 * @author theo
 * @date 2019/6/26
 */
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
open class TransactionASTTransform : ASTTransformation, ClassCodeExpressionTransformer() {

    private var sourceUnit: SourceUnit? = null

    companion object {
        const val TRANSACTION_BEAN_NAME = "\$transactionBeanName"
        const val TRANSACTION_METHOD_SUFFIX = "\$transaction"
        const val TRANSACTION_MANGER_NAME = "tm"
        const val TRANSACTION_STATUS_NAME = "ts"
        val log = LoggerFactory.getLogger(this::class.java.name)
    }

    override fun visit(nodes: Array<out ASTNode>, source: SourceUnit) {
        if (tsNode == null || tmNode == null || transactionDefinitionNode == null) {
            log.info("PlatformTransactionManager.class not found, make sure you have dependency on spring-tx ")
            log.info("skip transaction ast transform since TransactionManager is not supplied")
            return
        }
        sourceUnit = source
        if (nodes.size != 2 || nodes[0] !is AnnotationNode || nodes[1] !is AnnotatedNode) {
            throw GroovyBugError("Internal error: expecting [AnnotationNode, AnnotatedNode] but got: " + listOf(*nodes))
        }
        val annotationNode = nodes[0] as AnnotationNode
        val parent = nodes[1]
        if (parent is MethodNode) {
            val dc = parent.declaringClass
            val renamedMethod = MethodNode(
                parent.name + TRANSACTION_METHOD_SUFFIX,
                parent.modifiers,
                parent.returnType,
                parent.parameters,
                parent.exceptions,
                parent.code
            )
            dc.addMethod(renamedMethod)

            val method =
                if (dc.hasMethod(AutowiredASTTransform.AUTOWIRE_BEAN, arrayOf())) {
                    dc.getMethod(AutowiredASTTransform.AUTOWIRE_BEAN, arrayOf())
                } else {
                    val listNode = GenericsUtils.makeClassSafeWithGenerics(
                        JavaNodes.listNode, GenericsType(
                            JavaNodes.stringNode
                        )
                    )
                    val returnStatement = ReturnStatement(
                        ArrayExpression(JavaNodes.stringNode, null)
                    )
                    val block = BlockStatement()
                    block.addStatement(returnStatement)
                    val method = MethodNode(
                        AutowiredASTTransform.AUTOWIRE_BEAN,
                        dc.modifiers,
                        listNode,
                        arrayOf(),
                        arrayOf(),
                        block
                    )
                    method.declaringClass = dc.declaringClass
                    dc.addMethod(method)
                    method
                }
            val returnStatement = ((method.code as BlockStatement).statements[0] as ReturnStatement)
            val list = arrayListOf<Expression>(ConstantExpression(TRANSACTION_BEAN_NAME))
            list.addAll((returnStatement.expression as ArrayExpression).expressions)
            returnStatement.expression = ArrayExpression(JavaNodes.stringNode, list)

            val tmFieldNode =
                FieldNode(TRANSACTION_MANGER_NAME, 1, tmNode, null, null)
            dc.addField(tmFieldNode)
            val parameters = parent.parameters
            val wrapTransaction = wrapTransaction(parent)
            parent.code = wrapTransaction
        }
    }

    private fun wrapTransaction(originMethod: MethodNode): Statement? {
        val methodBody = BlockStatement()
        //add code TransactionStatus ts = tm.getTransaction(new DefaultTransactionDefinition())
        methodBody.addStatement(
            ExpressionStatement(
                DeclarationExpression(
                    VariableExpression(TRANSACTION_STATUS_NAME, tsNode),
                    Token(Types.EQUAL, "=", -1, -1),
                    MethodCallExpression(
                        VariableExpression(TRANSACTION_MANGER_NAME, tmNode),
                        ConstantExpression("getTransaction"),
                        ArgumentListExpression(
                            arrayOf(
                                ConstructorCallExpression(
                                    transactionDefinitionNode,
                                    ArgumentListExpression(
                                        arrayOf(
                                            ConstantExpression(6)
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )
        val tryStatements = BlockStatement()
        //add code def result = this.#originMethod$Suffix()

        val callActualMethod = MethodCallExpression(
            VariableExpression("this", anyNode),
            ConstantExpression(originMethod.name + TRANSACTION_METHOD_SUFFIX),
            ArgumentListExpression(originMethod.parameters)
        )


        tryStatements.addStatement(
            ExpressionStatement(
                if (originMethod.returnType.name != "void")
                    DeclarationExpression(
                        VariableExpression("result", anyNode),
                        Token(Types.EQUAL, "=", -1, -1),
                        callActualMethod
                    )
                else callActualMethod
            )
        )
        //add code tm.commit(ts)
        tryStatements.addStatement(
            ExpressionStatement(
                MethodCallExpression(
                    VariableExpression(TRANSACTION_MANGER_NAME, tmNode),
                    ConstantExpression("commit"),
                    ArgumentListExpression(
                        arrayOf(
                            VariableExpression(
                                TRANSACTION_STATUS_NAME,
                                tsNode
                            )
                        )
                    )
                )
            )
        )
        //add code  return result
        if (originMethod.returnType.name != "void")
            tryStatements.addStatement(
                ReturnStatement(
                    VariableExpression("result", anyNode)
                )
            )
        val tryCatchStatement = TryCatchStatement(
            tryStatements, EmptyStatement.INSTANCE
        )
        val catchBlock = BlockStatement()

        //add code tm.rollback(ts)
        catchBlock.addStatement(
            ExpressionStatement(
                MethodCallExpression(
                    VariableExpression(TRANSACTION_MANGER_NAME, tmNode),
                    ConstantExpression("rollback"),
                    VariableExpression(TRANSACTION_STATUS_NAME, tsNode)
                )
            )
        )
        //add code throw e
        catchBlock.addStatement(ThrowStatement(VariableExpression("e", exceptionNode)))
        val catchStatement = CatchStatement(
            Parameter(exceptionNode, "e"),
            catchBlock
        )
        tryCatchStatement.addCatch(catchStatement)
        methodBody.addStatement(tryCatchStatement)
        return methodBody
    }

    override fun getSourceUnit(): SourceUnit? {
        return sourceUnit
    }

}
