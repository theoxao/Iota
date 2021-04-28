package com.theoxao.iota.handler.groovy.ast

import org.codehaus.groovy.GroovyBugError
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.AnnotatedNode
import org.codehaus.groovy.ast.AnnotationNode
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation

/**
 * @author theo
 * @date 19-9-6
 */
class MainMethodASTTransform : ASTTransformation {

    override fun visit(nodes: Array<out ASTNode>, source: SourceUnit) {

        if (nodes.size != 2 || nodes[0] !is AnnotationNode || nodes[1] !is AnnotatedNode) {
            throw GroovyBugError("Internal error: expecting [AnnotationNode, AnnotatedNode] but got: " + listOf(*nodes))
        }

    }
}
