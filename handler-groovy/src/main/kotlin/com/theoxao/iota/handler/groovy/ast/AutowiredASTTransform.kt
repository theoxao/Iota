package com.theoxao.iota.handler.groovy.ast

import ch.qos.logback.classic.util.StatusViaSLF4JLoggerFactory.addError
import com.theoxao.iota.handler.groovy.ast.JavaNodes.fieldAnnotationNode
import org.codehaus.groovy.GroovyBugError
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.ArrayExpression
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.DeclarationExpression
import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.ast.tools.GenericsUtils
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.FieldASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation


/**
 * @author theo
 * @date 2019/6/26
 */
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class AutowiredASTTransform : ASTTransformation {

    companion object {
        const val AUTOWIRE_BEAN = "\$autowireBeans"
    }


    override fun visit(nodes: Array<out ASTNode>, source: SourceUnit) {
        if (nodes.size != 2 || nodes[0] !is AnnotationNode || nodes[1] !is AnnotatedNode) {
            throw GroovyBugError("Internal error: expecting [AnnotationNode, AnnotatedNode] but got: " + listOf(*nodes))
        }
        val annotationNode = nodes[0]
        val de = nodes[1]

        if (de is DeclarationExpression) {
            val cNode = de.declaringClass
            if (de.isMultipleAssignmentDeclaration) {
                addError("Annotation @Autowired not supported with multiple assignment notation.", de)
                return
            }
            val ve = de.variableExpression
            val variableName = ve.name
            val method =
                if (cNode.hasMethod(AUTOWIRE_BEAN, arrayOf())) {
                    cNode.getMethod(AUTOWIRE_BEAN, arrayOf())
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
                    val method = MethodNode(AUTOWIRE_BEAN, ve.modifiers, listNode, arrayOf(), arrayOf(), block)
                    method.declaringClass = ve.declaringClass
                    cNode.addMethod(method)
                    method
                }
            val returnStatement = ((method.code as BlockStatement).statements[0] as ReturnStatement)
            val list = arrayListOf<Expression>(ConstantExpression(ve.name))
            list.addAll((returnStatement.expression as ArrayExpression).expressions)
            returnStatement.expression = ArrayExpression(JavaNodes.stringNode, list)
            val myNodes = arrayOf(AnnotationNode(fieldAnnotationNode), nodes[1])
            FieldASTTransformation().visit(myNodes, source)
        }
        if (de is FieldNode) {
            val cNode = de.declaringClass
            val method: MethodNode =
                if (cNode.hasMethod(AUTOWIRE_BEAN, arrayOf())) {
                    cNode.getMethod(AUTOWIRE_BEAN, arrayOf())
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
                    val method = MethodNode(AUTOWIRE_BEAN, de.modifiers, listNode, arrayOf(), arrayOf(), block)
                    method.declaringClass = de.declaringClass
                    cNode.addMethod(method)
                    method
                }
            val returnStatement = ((method.code as BlockStatement).statements[0] as ReturnStatement)
            val list = arrayListOf<Expression>(
                *(returnStatement.expression as ArrayExpression).expressions.toTypedArray(),
                ConstantExpression(de.name)
            )
            returnStatement.expression = ArrayExpression(JavaNodes.stringNode, list)
        }
    }
}
