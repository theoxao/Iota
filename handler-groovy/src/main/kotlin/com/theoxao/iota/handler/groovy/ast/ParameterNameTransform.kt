package com.theoxao.iota.handler.groovy.ast

import com.theoxao.iota.handler.groovy.ast.JavaNodes.listNode
import com.theoxao.iota.handler.groovy.ast.JavaNodes.mainNode
import com.theoxao.iota.handler.groovy.ast.JavaNodes.stringNode
import org.codehaus.groovy.GroovyException
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.ArrayExpression
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.ast.tools.GenericsUtils
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation


/**
 * @author theo
 * @date 2019/7/1
 */
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class ParameterNameTransform : ASTTransformation {

    companion object {
        const val PARAMETER_NAMES_FIELD_SUFFIX = "\$parameterNames"
        const val METHOD_NAMES = "\$methodNames\$"
    }

    override fun visit(nodes: Array<out ASTNode>?, source: SourceUnit?) {
        if (nodes == null || nodes.size > 1 || nodes[0] !is ModuleNode) {
            throw GroovyException("something wrong")
        }
        val mn = nodes[0] as ModuleNode
        val firstClass = mn.classes[0]
        var methods = mn.methods
        if (methods.isEmpty()) {
            methods = firstClass.methods
        }
        val addMethod = mutableListOf<MethodNode>()
        methods.forEach {

            val listNode = GenericsUtils.makeClassSafeWithGenerics(listNode, GenericsType(stringNode))
            val returnStatement = ReturnStatement(
                ArrayExpression(stringNode, it.parameterNames().map { that -> ConstantExpression(that) })
            )
            val block = BlockStatement()
            block.addStatement(returnStatement)
            val method = MethodNode(
                "${it.name}$PARAMETER_NAMES_FIELD_SUFFIX",
                it.modifiers,
                listNode,
                arrayOf(),
                arrayOf(),
                block
            )
            method.declaringClass = firstClass
            method.toString()
            addMethod.add(method)
        }
        val block = BlockStatement()
        val mainMethod = methods.firstOrNull { it.annotations.map { an -> an.classNode }.contains(mainNode) }
        block.addStatement(ReturnStatement(ArrayExpression(stringNode,
            if (mainMethod == null) methods.map { ConstantExpression(it.name) }
            else arrayListOf(ConstantExpression(mainMethod.name))
        )))
        val listNode = GenericsUtils.makeClassSafeWithGenerics(listNode, GenericsType(stringNode))
        val methodNames = MethodNode(METHOD_NAMES, 1, listNode, arrayOf(), arrayOf(), block)
        methodNames.declaringClass = firstClass
        firstClass.addMethod(methodNames)
        addMethod.forEach(firstClass::addMethod)
    }

    private fun MethodNode.parameterNames(): List<String> {
        return this.parameters.map { it.name }
    }

    private fun ClassNode.setGenerics(node: GenericsType): ClassNode {
        this.genericsTypes = arrayOf(node)
        return this
    }

}
