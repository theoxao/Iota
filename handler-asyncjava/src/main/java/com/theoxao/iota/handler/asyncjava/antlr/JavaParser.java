package com.theoxao.iota.handler.asyncjava.antlr;
// Generated from JavaParser.g4 by ANTLR 4.6

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
    public static final int
            ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, CATCH = 7, CHAR = 8,
            CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, DO = 13, DOUBLE = 14, ELSE = 15,
            ENUM = 16, EXTENDS = 17, FINAL = 18, FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23,
            IMPLEMENTS = 24, IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29,
            NATIVE = 30, NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36,
            SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42,
            THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, VOLATILE = 49,
            WHILE = 50, ASYNC = 51, AWAIT = 52, DECIMAL_LITERAL = 53, HEX_LITERAL = 54, OCT_LITERAL = 55,
            BINARY_LITERAL = 56, FLOAT_LITERAL = 57, HEX_FLOAT_LITERAL = 58, BOOL_LITERAL = 59,
            CHAR_LITERAL = 60, STRING_LITERAL = 61, NULL_LITERAL = 62, LPAREN = 63, RPAREN = 64,
            LBRACE = 65, RBRACE = 66, LBRACK = 67, RBRACK = 68, SEMI = 69, COMMA = 70, DOT = 71,
            ASSIGN = 72, GT = 73, LT = 74, BANG = 75, TILDE = 76, QUESTION = 77, COLON = 78, EQUAL = 79,
            LE = 80, GE = 81, NOTEQUAL = 82, AND = 83, OR = 84, INC = 85, DEC = 86, ADD = 87, SUB = 88,
            MUL = 89, DIV = 90, BITAND = 91, BITOR = 92, CARET = 93, MOD = 94, ADD_ASSIGN = 95,
            SUB_ASSIGN = 96, MUL_ASSIGN = 97, DIV_ASSIGN = 98, AND_ASSIGN = 99, OR_ASSIGN = 100,
            XOR_ASSIGN = 101, MOD_ASSIGN = 102, LSHIFT_ASSIGN = 103, RSHIFT_ASSIGN = 104,
            URSHIFT_ASSIGN = 105, ARROW = 106, COLONCOLON = 107, AT = 108, ELLIPSIS = 109, WS = 110,
            COMMENT = 111, LINE_COMMENT = 112, IDENTIFIER = 113;
    public static final int
            RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2,
            RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5,
            RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8,
            RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11,
            RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14,
            RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17,
            RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20,
            RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23,
            RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25,
            RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28,
            RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31,
            RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33,
            RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36,
            RULE_variableInitializer = 37, RULE_arrayInitializer = 38, RULE_classOrInterfaceType = 39,
            RULE_typeArgument = 40, RULE_qualifiedNameList = 41, RULE_formalParameters = 42,
            RULE_formalParameterList = 43, RULE_formalParameter = 44, RULE_lastFormalParameter = 45,
            RULE_qualifiedName = 46, RULE_literal = 47, RULE_integerLiteral = 48,
            RULE_floatLiteral = 49, RULE_annotation = 50, RULE_elementValuePairs = 51,
            RULE_elementValuePair = 52, RULE_elementValue = 53, RULE_elementValueArrayInitializer = 54,
            RULE_annotationTypeDeclaration = 55, RULE_annotationTypeBody = 56, RULE_annotationTypeElementDeclaration = 57,
            RULE_annotationTypeElementRest = 58, RULE_annotationMethodOrConstantRest = 59,
            RULE_annotationMethodRest = 60, RULE_annotationConstantRest = 61, RULE_defaultValue = 62,
            RULE_block = 63, RULE_blockStatement = 64, RULE_localVariableDeclaration = 65,
            RULE_localTypeDeclaration = 66, RULE_statement = 67, RULE_catchClause = 68,
            RULE_catchType = 69, RULE_finallyBlock = 70, RULE_resourceSpecification = 71,
            RULE_resources = 72, RULE_resource = 73, RULE_switchBlockStatementGroup = 74,
            RULE_switchLabel = 75, RULE_forControl = 76, RULE_forInit = 77, RULE_enhancedForControl = 78,
            RULE_parExpression = 79, RULE_expressionList = 80, RULE_methodCall = 81,
            RULE_expression = 82, RULE_awaitExpression = 83, RULE_lambdaExpression = 84,
            RULE_lambdaParameters = 85, RULE_lambdaBody = 86, RULE_primary = 87, RULE_classType = 88,
            RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, RULE_arrayCreatorRest = 92,
            RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94, RULE_typeArgumentsOrDiamond = 95,
            RULE_nonWildcardTypeArgumentsOrDiamond = 96, RULE_nonWildcardTypeArguments = 97,
            RULE_typeList = 98, RULE_typeType = 99, RULE_primitiveType = 100, RULE_typeArguments = 101,
            RULE_superSuffix = 102, RULE_explicitGenericInvocationSuffix = 103, RULE_arguments = 104;
    public static final String[] ruleNames = {
            "compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration",
            "modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration",
            "typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants",
            "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody",
            "interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration",
            "methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration",
            "constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration",
            "interfaceMemberDeclaration", "constDeclaration", "constantDeclarator",
            "interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration",
            "variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer",
            "arrayInitializer", "classOrInterfaceType", "typeArgument", "qualifiedNameList",
            "formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter",
            "qualifiedName", "literal", "integerLiteral", "floatLiteral", "annotation",
            "elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer",
            "annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration",
            "annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest",
            "annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclaration",
            "localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock",
            "resourceSpecification", "resources", "resource", "switchBlockStatementGroup",
            "switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression",
            "expressionList", "methodCall", "expression", "awaitExpression", "lambdaExpression",
            "lambdaParameters", "lambdaBody", "primary", "classType", "creator", "createdName",
            "innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation",
            "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments",
            "typeList", "typeType", "primitiveType", "typeArguments", "superSuffix",
            "explicitGenericInvocationSuffix", "arguments"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3s\u0572\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\5" +
                    "\2\u00d6\n\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2\3\2\7\2\u00df\n\2\f" +
                    "\2\16\2\u00e2\13\2\3\2\3\2\3\3\7\3\u00e7\n\3\f\3\16\3\u00ea\13\3\3\3\3" +
                    "\3\3\3\3\3\3\4\3\4\5\4\u00f2\n\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3\4\3\5" +
                    "\7\5\u00fc\n\5\f\5\16\5\u00ff\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0106\n\5\3" +
                    "\5\5\5\u0109\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0110\n\6\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\5\7\u011a\n\7\3\b\3\b\5\b\u011e\n\b\3\t\3\t\3\t\5\t\u0123" +
                    "\n\t\3\t\3\t\5\t\u0127\n\t\3\t\3\t\5\t\u012b\n\t\3\t\3\t\3\n\3\n\3\n\3" +
                    "\n\7\n\u0133\n\n\f\n\16\n\u0136\13\n\3\n\3\n\3\13\7\13\u013b\n\13\f\13" +
                    "\16\13\u013e\13\13\3\13\3\13\3\13\5\13\u0143\n\13\3\f\3\f\3\f\7\f\u0148" +
                    "\n\f\f\f\16\f\u014b\13\f\3\r\3\r\3\r\3\r\5\r\u0151\n\r\3\r\3\r\5\r\u0155" +
                    "\n\r\3\r\5\r\u0158\n\r\3\r\5\r\u015b\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0162" +
                    "\n\16\f\16\16\16\u0165\13\16\3\17\7\17\u0168\n\17\f\17\16\17\u016b\13" +
                    "\17\3\17\3\17\5\17\u016f\n\17\3\17\5\17\u0172\n\17\3\20\3\20\7\20\u0176" +
                    "\n\20\f\20\16\20\u0179\13\20\3\21\3\21\3\21\5\21\u017e\n\21\3\21\3\21" +
                    "\5\21\u0182\n\21\3\21\3\21\3\22\3\22\7\22\u0188\n\22\f\22\16\22\u018b" +
                    "\13\22\3\22\3\22\3\23\3\23\7\23\u0191\n\23\f\23\16\23\u0194\13\23\3\23" +
                    "\3\23\3\24\3\24\5\24\u019a\n\24\3\24\3\24\7\24\u019e\n\24\f\24\16\24\u01a1" +
                    "\13\24\3\24\5\24\u01a4\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3" +
                    "\25\5\25\u01af\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01b6\n\26\f\26\16\26" +
                    "\u01b9\13\26\3\26\3\26\5\26\u01bd\n\26\3\26\3\26\3\27\5\27\u01c2\n\27" +
                    "\3\27\3\27\5\27\u01c6\n\27\3\30\3\30\5\30\u01ca\n\30\3\31\3\31\3\31\3" +
                    "\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u01d6\n\33\3\33\3\33\3\34\3\34" +
                    "\3\34\3\34\3\35\7\35\u01df\n\35\f\35\16\35\u01e2\13\35\3\35\3\35\5\35" +
                    "\u01e6\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ef\n\36\3\37\3" +
                    "\37\3\37\3\37\7\37\u01f5\n\37\f\37\16\37\u01f8\13\37\3\37\3\37\3 \3 \3" +
                    " \7 \u01ff\n \f \16 \u0202\13 \3 \3 \3 \3!\7!\u0208\n!\f!\16!\u020b\13" +
                    "!\3!\3!\3!\7!\u0210\n!\f!\16!\u0213\13!\3!\3!\5!\u0217\n!\3!\3!\3!\3!" +
                    "\7!\u021d\n!\f!\16!\u0220\13!\3!\3!\5!\u0224\n!\3!\3!\3\"\3\"\3\"\3\"" +
                    "\3\"\3\"\5\"\u022e\n\"\3#\3#\3#\3$\3$\3$\7$\u0236\n$\f$\16$\u0239\13$" +
                    "\3%\3%\3%\5%\u023e\n%\3&\3&\3&\7&\u0243\n&\f&\16&\u0246\13&\3\'\3\'\5" +
                    "\'\u024a\n\'\3(\3(\3(\3(\7(\u0250\n(\f(\16(\u0253\13(\3(\5(\u0256\n(\5" +
                    "(\u0258\n(\3(\3(\3)\3)\5)\u025e\n)\3)\3)\3)\5)\u0263\n)\7)\u0265\n)\f" +
                    ")\16)\u0268\13)\3*\3*\3*\3*\5*\u026e\n*\5*\u0270\n*\3+\3+\3+\7+\u0275" +
                    "\n+\f+\16+\u0278\13+\3,\3,\5,\u027c\n,\3,\3,\3-\3-\3-\7-\u0283\n-\f-\16" +
                    "-\u0286\13-\3-\3-\5-\u028a\n-\3-\5-\u028d\n-\3.\7.\u0290\n.\f.\16.\u0293" +
                    "\13.\3.\3.\3.\3/\7/\u0299\n/\f/\16/\u029c\13/\3/\3/\3/\3/\3\60\3\60\3" +
                    "\60\7\60\u02a5\n\60\f\60\16\60\u02a8\13\60\3\61\3\61\3\61\3\61\3\61\3" +
                    "\61\5\61\u02b0\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64" +
                    "\u02bb\n\64\3\64\5\64\u02be\n\64\3\65\3\65\3\65\7\65\u02c3\n\65\f\65\16" +
                    "\65\u02c6\13\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u02cf\n\67\38" +
                    "\38\38\38\78\u02d5\n8\f8\168\u02d8\138\58\u02da\n8\38\58\u02dd\n8\38\3" +
                    "8\39\39\39\39\39\3:\3:\7:\u02e8\n:\f:\16:\u02eb\13:\3:\3:\3;\7;\u02f0" +
                    "\n;\f;\16;\u02f3\13;\3;\3;\5;\u02f7\n;\3<\3<\3<\3<\3<\3<\5<\u02ff\n<\3" +
                    "<\3<\5<\u0303\n<\3<\3<\5<\u0307\n<\3<\3<\5<\u030b\n<\5<\u030d\n<\3=\3" +
                    "=\5=\u0311\n=\3>\3>\3>\3>\5>\u0317\n>\3?\3?\3@\3@\3@\3A\3A\7A\u0320\n" +
                    "A\fA\16A\u0323\13A\3A\3A\3B\3B\3B\3B\3B\5B\u032c\nB\3C\7C\u032f\nC\fC" +
                    "\16C\u0332\13C\3C\3C\3C\3D\7D\u0338\nD\fD\16D\u033b\13D\3D\3D\5D\u033f" +
                    "\nD\3D\5D\u0342\nD\3E\3E\3E\3E\3E\5E\u0349\nE\3E\3E\3E\3E\3E\3E\3E\5E" +
                    "\u0352\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\6E" +
                    "\u0367\nE\rE\16E\u0368\3E\5E\u036c\nE\3E\5E\u036f\nE\3E\3E\3E\3E\7E\u0375" +
                    "\nE\fE\16E\u0378\13E\3E\5E\u037b\nE\3E\3E\3E\3E\7E\u0381\nE\fE\16E\u0384" +
                    "\13E\3E\7E\u0387\nE\fE\16E\u038a\13E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0394" +
                    "\nE\3E\3E\3E\3E\3E\3E\3E\5E\u039d\nE\3E\3E\3E\5E\u03a2\nE\3E\3E\3E\3E" +
                    "\3E\3E\3E\3E\5E\u03ac\nE\3F\3F\3F\7F\u03b1\nF\fF\16F\u03b4\13F\3F\3F\3" +
                    "F\3F\3F\3G\3G\3G\7G\u03be\nG\fG\16G\u03c1\13G\3H\3H\3H\3I\3I\3I\5I\u03c9" +
                    "\nI\3I\3I\3J\3J\3J\7J\u03d0\nJ\fJ\16J\u03d3\13J\3K\7K\u03d6\nK\fK\16K" +
                    "\u03d9\13K\3K\3K\3K\3K\3K\3L\6L\u03e1\nL\rL\16L\u03e2\3L\6L\u03e6\nL\r" +
                    "L\16L\u03e7\3M\3M\3M\5M\u03ed\nM\3M\3M\3M\5M\u03f2\nM\3N\3N\5N\u03f6\n" +
                    "N\3N\3N\5N\u03fa\nN\3N\3N\5N\u03fe\nN\5N\u0400\nN\3O\3O\5O\u0404\nO\3" +
                    "P\7P\u0407\nP\fP\16P\u040a\13P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\7R" +
                    "\u0418\nR\fR\16R\u041b\13R\3S\3S\3S\5S\u0420\nS\3S\3S\3S\3S\5S\u0426\n" +
                    "S\3S\3S\3S\3S\5S\u042c\nS\3S\5S\u042f\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\3" +
                    "T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0443\nT\3T\3T\5T\u0447\nT\3T\3T\3T\5T\u044c" +
                    "\nT\3T\3T\3T\5T\u0451\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T" +
                    "\u0461\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T" +
                    "\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0489\nT\3T" +
                    "\3T\3T\3T\5T\u048f\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u049e" +
                    "\nT\3T\7T\u04a1\nT\fT\16T\u04a4\13T\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\5W\u04b0" +
                    "\nW\3W\3W\3W\3W\3W\7W\u04b7\nW\fW\16W\u04ba\13W\3W\5W\u04bd\nW\3X\3X\5" +
                    "X\u04c1\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04d3\n" +
                    "Y\5Y\u04d5\nY\3Z\3Z\3Z\5Z\u04da\nZ\3Z\7Z\u04dd\nZ\fZ\16Z\u04e0\13Z\3Z" +
                    "\3Z\5Z\u04e4\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u04ed\n[\5[\u04ef\n[\3\\\3\\\5" +
                    "\\\u04f3\n\\\3\\\3\\\3\\\5\\\u04f8\n\\\7\\\u04fa\n\\\f\\\16\\\u04fd\13" +
                    "\\\3\\\5\\\u0500\n\\\3]\3]\5]\u0504\n]\3]\3]\3^\3^\3^\3^\7^\u050c\n^\f" +
                    "^\16^\u050f\13^\3^\3^\3^\3^\3^\3^\3^\7^\u0518\n^\f^\16^\u051b\13^\3^\3" +
                    "^\7^\u051f\n^\f^\16^\u0522\13^\5^\u0524\n^\3_\3_\5_\u0528\n_\3`\3`\3`" +
                    "\3a\3a\3a\5a\u0530\na\3b\3b\3b\5b\u0535\nb\3c\3c\3c\3c\3d\3d\3d\7d\u053e" +
                    "\nd\fd\16d\u0541\13d\3e\5e\u0544\ne\3e\3e\5e\u0548\ne\3e\3e\7e\u054c\n" +
                    "e\fe\16e\u054f\13e\3f\3f\3g\3g\3g\3g\7g\u0557\ng\fg\16g\u055a\13g\3g\3" +
                    "g\3h\3h\3h\3h\5h\u0562\nh\5h\u0564\nh\3i\3i\3i\3i\5i\u056a\ni\3j\3j\5" +
                    "j\u056e\nj\3j\3j\3j\2\3\u00a6k\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
                    " \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" +
                    "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a" +
                    "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2" +
                    "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca" +
                    "\u00cc\u00ce\u00d0\u00d2\2\16\4\2\23\23**\3\2\67:\3\2;<\3\2WZ\3\2MN\4" +
                    "\2[\\``\3\2YZ\4\2KLRS\4\2QQTT\4\2JJak\3\2WX\n\2\5\5\7\7\n\n\20\20\26\26" +
                    "\35\35\37\37\'\'\u060d\2\u00d5\3\2\2\2\4\u00e8\3\2\2\2\6\u00ef\3\2\2\2" +
                    "\b\u0108\3\2\2\2\n\u010f\3\2\2\2\f\u0119\3\2\2\2\16\u011d\3\2\2\2\20\u011f" +
                    "\3\2\2\2\22\u012e\3\2\2\2\24\u013c\3\2\2\2\26\u0144\3\2\2\2\30\u014c\3" +
                    "\2\2\2\32\u015e\3\2\2\2\34\u0169\3\2\2\2\36\u0173\3\2\2\2 \u017a\3\2\2" +
                    "\2\"\u0185\3\2\2\2$\u018e\3\2\2\2&\u01a3\3\2\2\2(\u01ae\3\2\2\2*\u01b0" +
                    "\3\2\2\2,\u01c5\3\2\2\2.\u01c9\3\2\2\2\60\u01cb\3\2\2\2\62\u01ce\3\2\2" +
                    "\2\64\u01d1\3\2\2\2\66\u01d9\3\2\2\28\u01e5\3\2\2\2:\u01ee\3\2\2\2<\u01f0" +
                    "\3\2\2\2>\u01fb\3\2\2\2@\u0209\3\2\2\2B\u022d\3\2\2\2D\u022f\3\2\2\2F" +
                    "\u0232\3\2\2\2H\u023a\3\2\2\2J\u023f\3\2\2\2L\u0249\3\2\2\2N\u024b\3\2" +
                    "\2\2P\u025b\3\2\2\2R\u026f\3\2\2\2T\u0271\3\2\2\2V\u0279\3\2\2\2X\u028c" +
                    "\3\2\2\2Z\u0291\3\2\2\2\\\u029a\3\2\2\2^\u02a1\3\2\2\2`\u02af\3\2\2\2" +
                    "b\u02b1\3\2\2\2d\u02b3\3\2\2\2f\u02b5\3\2\2\2h\u02bf\3\2\2\2j\u02c7\3" +
                    "\2\2\2l\u02ce\3\2\2\2n\u02d0\3\2\2\2p\u02e0\3\2\2\2r\u02e5\3\2\2\2t\u02f6" +
                    "\3\2\2\2v\u030c\3\2\2\2x\u0310\3\2\2\2z\u0312\3\2\2\2|\u0318\3\2\2\2~" +
                    "\u031a\3\2\2\2\u0080\u031d\3\2\2\2\u0082\u032b\3\2\2\2\u0084\u0330\3\2" +
                    "\2\2\u0086\u0341\3\2\2\2\u0088\u03ab\3\2\2\2\u008a\u03ad\3\2\2\2\u008c" +
                    "\u03ba\3\2\2\2\u008e\u03c2\3\2\2\2\u0090\u03c5\3\2\2\2\u0092\u03cc\3\2" +
                    "\2\2\u0094\u03d7\3\2\2\2\u0096\u03e0\3\2\2\2\u0098\u03f1\3\2\2\2\u009a" +
                    "\u03ff\3\2\2\2\u009c\u0403\3\2\2\2\u009e\u0408\3\2\2\2\u00a0\u0410\3\2" +
                    "\2\2\u00a2\u0414\3\2\2\2\u00a4\u042e\3\2\2\2\u00a6\u0450\3\2\2\2\u00a8" +
                    "\u04a5\3\2\2\2\u00aa\u04a8\3\2\2\2\u00ac\u04bc\3\2\2\2\u00ae\u04c0\3\2" +
                    "\2\2\u00b0\u04d4\3\2\2\2\u00b2\u04d9\3\2\2\2\u00b4\u04ee\3\2\2\2\u00b6" +
                    "\u04ff\3\2\2\2\u00b8\u0501\3\2\2\2\u00ba\u0507\3\2\2\2\u00bc\u0525\3\2" +
                    "\2\2\u00be\u0529\3\2\2\2\u00c0\u052f\3\2\2\2\u00c2\u0534\3\2\2\2\u00c4" +
                    "\u0536\3\2\2\2\u00c6\u053a\3\2\2\2\u00c8\u0543\3\2\2\2\u00ca\u0550\3\2" +
                    "\2\2\u00cc\u0552\3\2\2\2\u00ce\u0563\3\2\2\2\u00d0\u0569\3\2\2\2\u00d2" +
                    "\u056b\3\2\2\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2" +
                    "\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\5\6\4\2\u00d8\u00d7\3\2\2\2\u00d9" +
                    "\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\3\2" +
                    "\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\b\5\2\u00de\u00dd\3\2\2\2\u00df" +
                    "\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2" +
                    "\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\2\2\3\u00e4\3\3\2\2\2\u00e5\u00e7" +
                    "\5f\64\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8" +
                    "\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\"" +
                    "\2\2\u00ec\u00ed\5^\60\2\u00ed\u00ee\7G\2\2\u00ee\5\3\2\2\2\u00ef\u00f1" +
                    "\7\33\2\2\u00f0\u00f2\7(\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2" +
                    "\u00f3\3\2\2\2\u00f3\u00f6\5^\60\2\u00f4\u00f5\7I\2\2\u00f5\u00f7\7[\2" +
                    "\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9" +
                    "\7G\2\2\u00f9\7\3\2\2\2\u00fa\u00fc\5\f\7\2\u00fb\u00fa\3\2\2\2\u00fc" +
                    "\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0105\3\2" +
                    "\2\2\u00ff\u00fd\3\2\2\2\u0100\u0106\5\20\t\2\u0101\u0106\5\30\r\2\u0102" +
                    "\u0106\5 \21\2\u0103\u0106\5p9\2\u0104\u0106\5*\26\2\u0105\u0100\3\2\2" +
                    "\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104" +
                    "\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0109\7G\2\2\u0108\u00fd\3\2\2\2\u0108" +
                    "\u0107\3\2\2\2\u0109\t\3\2\2\2\u010a\u0110\5\f\7\2\u010b\u0110\7 \2\2" +
                    "\u010c\u0110\7,\2\2\u010d\u0110\7\60\2\2\u010e\u0110\7\63\2\2\u010f\u010a" +
                    "\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f" +
                    "\u010e\3\2\2\2\u0110\13\3\2\2\2\u0111\u011a\5f\64\2\u0112\u011a\7%\2\2" +
                    "\u0113\u011a\7$\2\2\u0114\u011a\7#\2\2\u0115\u011a\7(\2\2\u0116\u011a" +
                    "\7\3\2\2\u0117\u011a\7\24\2\2\u0118\u011a\7)\2\2\u0119\u0111\3\2\2\2\u0119" +
                    "\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2" +
                    "\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a" +
                    "\r\3\2\2\2\u011b\u011e\7\24\2\2\u011c\u011e\5f\64\2\u011d\u011b\3\2\2" +
                    "\2\u011d\u011c\3\2\2\2\u011e\17\3\2\2\2\u011f\u0120\7\13\2\2\u0120\u0122" +
                    "\7s\2\2\u0121\u0123\5\22\n\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123" +
                    "\u0126\3\2\2\2\u0124\u0125\7\23\2\2\u0125\u0127\5\u00c8e\2\u0126\u0124" +
                    "\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\7\32\2\2" +
                    "\u0129\u012b\5\u00c6d\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b" +
                    "\u012c\3\2\2\2\u012c\u012d\5\"\22\2\u012d\21\3\2\2\2\u012e\u012f\7L\2" +
                    "\2\u012f\u0134\5\24\13\2\u0130\u0131\7H\2\2\u0131\u0133\5\24\13\2\u0132" +
                    "\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2" +
                    "\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7K\2\2\u0138" +
                    "\23\3\2\2\2\u0139\u013b\5f\64\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2" +
                    "\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c" +
                    "\3\2\2\2\u013f\u0142\7s\2\2\u0140\u0141\7\23\2\2\u0141\u0143\5\26\f\2" +
                    "\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\25\3\2\2\2\u0144\u0149" +
                    "\5\u00c8e\2\u0145\u0146\7]\2\2\u0146\u0148\5\u00c8e\2\u0147\u0145\3\2" +
                    "\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a" +
                    "\27\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\22\2\2\u014d\u0150\7s\2" +
                    "\2\u014e\u014f\7\32\2\2\u014f\u0151\5\u00c6d\2\u0150\u014e\3\2\2\2\u0150" +
                    "\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\7C\2\2\u0153\u0155\5\32" +
                    "\16\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156" +
                    "\u0158\7H\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2" +
                    "\2\2\u0159\u015b\5\36\20\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b" +
                    "\u015c\3\2\2\2\u015c\u015d\7D\2\2\u015d\31\3\2\2\2\u015e\u0163\5\34\17" +
                    "\2\u015f\u0160\7H\2\2\u0160\u0162\5\34\17\2\u0161\u015f\3\2\2\2\u0162" +
                    "\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\33\3\2\2" +
                    "\2\u0165\u0163\3\2\2\2\u0166\u0168\5f\64\2\u0167\u0166\3\2\2\2\u0168\u016b" +
                    "\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b" +
                    "\u0169\3\2\2\2\u016c\u016e\7s\2\2\u016d\u016f\5\u00d2j\2\u016e\u016d\3" +
                    "\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5\"\22\2\u0171" +
                    "\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\35\3\2\2\2\u0173\u0177\7G\2\2" +
                    "\u0174\u0176\5&\24\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175" +
                    "\3\2\2\2\u0177\u0178\3\2\2\2\u0178\37\3\2\2\2\u0179\u0177\3\2\2\2\u017a" +
                    "\u017b\7\36\2\2\u017b\u017d\7s\2\2\u017c\u017e\5\22\n\2\u017d\u017c\3" +
                    "\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0180\7\23\2\2\u0180" +
                    "\u0182\5\u00c6d\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183" +
                    "\3\2\2\2\u0183\u0184\5$\23\2\u0184!\3\2\2\2\u0185\u0189\7C\2\2\u0186\u0188" +
                    "\5&\24\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189" +
                    "\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7D" +
                    "\2\2\u018d#\3\2\2\2\u018e\u0192\7C\2\2\u018f\u0191\58\35\2\u0190\u018f" +
                    "\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193" +
                    "\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7D\2\2\u0196%\3\2\2\2\u0197" +
                    "\u01a4\7G\2\2\u0198\u019a\7(\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2" +
                    "\2\u019a\u019b\3\2\2\2\u019b\u01a4\5\u0080A\2\u019c\u019e\5\n\6\2\u019d" +
                    "\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2" +
                    "\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\5(\25\2\u01a3" +
                    "\u0197\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4\'\3\2\2\2" +
                    "\u01a5\u01af\5*\26\2\u01a6\u01af\5\60\31\2\u01a7\u01af\5\66\34\2\u01a8" +
                    "\u01af\5\64\33\2\u01a9\u01af\5\62\32\2\u01aa\u01af\5 \21\2\u01ab\u01af" +
                    "\5p9\2\u01ac\u01af\5\20\t\2\u01ad\u01af\5\30\r\2\u01ae\u01a5\3\2\2\2\u01ae" +
                    "\u01a6\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01a9\3\2" +
                    "\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae" +
                    "\u01ad\3\2\2\2\u01af)\3\2\2\2\u01b0\u01b1\5.\30\2\u01b1\u01b2\7s\2\2\u01b2" +
                    "\u01b7\5V,\2\u01b3\u01b4\7E\2\2\u01b4\u01b6\7F\2\2\u01b5\u01b3\3\2\2\2" +
                    "\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bc" +
                    "\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7/\2\2\u01bb\u01bd\5T+\2\u01bc" +
                    "\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5," +
                    "\27\2\u01bf+\3\2\2\2\u01c0\u01c2\7\65\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2" +
                    "\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\5\u0080A\2\u01c4\u01c6\7G\2\2" +
                    "\u01c5\u01c1\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6-\3\2\2\2\u01c7\u01ca\5" +
                    "\u00c8e\2\u01c8\u01ca\7\62\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2" +
                    "\u01ca/\3\2\2\2\u01cb\u01cc\5\22\n\2\u01cc\u01cd\5*\26\2\u01cd\61\3\2" +
                    "\2\2\u01ce\u01cf\5\22\n\2\u01cf\u01d0\5\64\33\2\u01d0\63\3\2\2\2\u01d1" +
                    "\u01d2\7s\2\2\u01d2\u01d5\5V,\2\u01d3\u01d4\7/\2\2\u01d4\u01d6\5T+\2\u01d5" +
                    "\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5\u0080" +
                    "A\2\u01d8\65\3\2\2\2\u01d9\u01da\5\u00c8e\2\u01da\u01db\5F$\2\u01db\u01dc" +
                    "\7G\2\2\u01dc\67\3\2\2\2\u01dd\u01df\5\n\6\2\u01de\u01dd\3\2\2\2\u01df" +
                    "\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2" +
                    "\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\5:\36\2\u01e4\u01e6\7G\2\2\u01e5" +
                    "\u01e0\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e69\3\2\2\2\u01e7\u01ef\5<\37\2" +
                    "\u01e8\u01ef\5@!\2\u01e9\u01ef\5D#\2\u01ea\u01ef\5 \21\2\u01eb\u01ef\5" +
                    "p9\2\u01ec\u01ef\5\20\t\2\u01ed\u01ef\5\30\r\2\u01ee\u01e7\3\2\2\2\u01ee" +
                    "\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01eb\3\2" +
                    "\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef;\3\2\2\2\u01f0\u01f1" +
                    "\5\u00c8e\2\u01f1\u01f6\5> \2\u01f2\u01f3\7H\2\2\u01f3\u01f5\5> \2\u01f4" +
                    "\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2" +
                    "\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7G\2\2\u01fa" +
                    "=\3\2\2\2\u01fb\u0200\7s\2\2\u01fc\u01fd\7E\2\2\u01fd\u01ff\7F\2\2\u01fe" +
                    "\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2" +
                    "\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7J\2\2\u0204" +
                    "\u0205\5L\'\2\u0205?\3\2\2\2\u0206\u0208\5B\"\2\u0207\u0206\3\2\2\2\u0208" +
                    "\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0216\3\2" +
                    "\2\2\u020b\u0209\3\2\2\2\u020c\u0217\5.\30\2\u020d\u0211\5\22\n\2\u020e" +
                    "\u0210\5f\64\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2" +
                    "\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214" +
                    "\u0215\5.\30\2\u0215\u0217\3\2\2\2\u0216\u020c\3\2\2\2\u0216\u020d\3\2" +
                    "\2\2\u0217\u0218\3\2\2\2\u0218\u0219\7s\2\2\u0219\u021e\5V,\2\u021a\u021b" +
                    "\7E\2\2\u021b\u021d\7F\2\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e" +
                    "\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223\3\2\2\2\u0220\u021e\3\2" +
                    "\2\2\u0221\u0222\7/\2\2\u0222\u0224\5T+\2\u0223\u0221\3\2\2\2\u0223\u0224" +
                    "\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5,\27\2\u0226A\3\2\2\2\u0227" +
                    "\u022e\5f\64\2\u0228\u022e\7%\2\2\u0229\u022e\7\3\2\2\u022a\u022e\7\16" +
                    "\2\2\u022b\u022e\7(\2\2\u022c\u022e\7)\2\2\u022d\u0227\3\2\2\2\u022d\u0228" +
                    "\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022a\3\2\2\2\u022d\u022b\3\2\2\2\u022d" +
                    "\u022c\3\2\2\2\u022eC\3\2\2\2\u022f\u0230\5\22\n\2\u0230\u0231\5@!\2\u0231" +
                    "E\3\2\2\2\u0232\u0237\5H%\2\u0233\u0234\7H\2\2\u0234\u0236\5H%\2\u0235" +
                    "\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2" +
                    "\2\2\u0238G\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023d\5J&\2\u023b\u023c" +
                    "\7J\2\2\u023c\u023e\5L\'\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e" +
                    "I\3\2\2\2\u023f\u0244\7s\2\2\u0240\u0241\7E\2\2\u0241\u0243\7F\2\2\u0242" +
                    "\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2" +
                    "\2\2\u0245K\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024a\5N(\2\u0248\u024a" +
                    "\5\u00a6T\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024aM\3\2\2\2\u024b" +
                    "\u0257\7C\2\2\u024c\u0251\5L\'\2\u024d\u024e\7H\2\2\u024e\u0250\5L\'\2" +
                    "\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252" +
                    "\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\7H\2\2\u0255" +
                    "\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u024c\3\2" +
                    "\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\7D\2\2\u025a" +
                    "O\3\2\2\2\u025b\u025d\7s\2\2\u025c\u025e\5\u00ccg\2\u025d\u025c\3\2\2" +
                    "\2\u025d\u025e\3\2\2\2\u025e\u0266\3\2\2\2\u025f\u0260\7I\2\2\u0260\u0262" +
                    "\7s\2\2\u0261\u0263\5\u00ccg\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2" +
                    "\u0263\u0265\3\2\2\2\u0264\u025f\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264" +
                    "\3\2\2\2\u0266\u0267\3\2\2\2\u0267Q\3\2\2\2\u0268\u0266\3\2\2\2\u0269" +
                    "\u0270\5\u00c8e\2\u026a\u026d\7O\2\2\u026b\u026c\t\2\2\2\u026c\u026e\5" +
                    "\u00c8e\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2" +
                    "\u026f\u0269\3\2\2\2\u026f\u026a\3\2\2\2\u0270S\3\2\2\2\u0271\u0276\5" +
                    "^\60\2\u0272\u0273\7H\2\2\u0273\u0275\5^\60\2\u0274\u0272\3\2\2\2\u0275" +
                    "\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277U\3\2\2\2" +
                    "\u0278\u0276\3\2\2\2\u0279\u027b\7A\2\2\u027a\u027c\5X-\2\u027b\u027a" +
                    "\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7B\2\2\u027e" +
                    "W\3\2\2\2\u027f\u0284\5Z.\2\u0280\u0281\7H\2\2\u0281\u0283\5Z.\2\u0282" +
                    "\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2" +
                    "\2\2\u0285\u0289\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7H\2\2\u0288" +
                    "\u028a\5\\/\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028d\3\2" +
                    "\2\2\u028b\u028d\5\\/\2\u028c\u027f\3\2\2\2\u028c\u028b\3\2\2\2\u028d" +
                    "Y\3\2\2\2\u028e\u0290\5\16\b\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2" +
                    "\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291" +
                    "\3\2\2\2\u0294\u0295\5\u00c8e\2\u0295\u0296\5J&\2\u0296[\3\2\2\2\u0297" +
                    "\u0299\5\16\b\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3" +
                    "\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d" +
                    "\u029e\5\u00c8e\2\u029e\u029f\7o\2\2\u029f\u02a0\5J&\2\u02a0]\3\2\2\2" +
                    "\u02a1\u02a6\7s\2\2\u02a2\u02a3\7I\2\2\u02a3\u02a5\7s\2\2\u02a4\u02a2" +
                    "\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7" +
                    "_\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02b0\5b\62\2\u02aa\u02b0\5d\63\2" +
                    "\u02ab\u02b0\7>\2\2\u02ac\u02b0\7?\2\2\u02ad\u02b0\7=\2\2\u02ae\u02b0" +
                    "\7@\2\2\u02af\u02a9\3\2\2\2\u02af\u02aa\3\2\2\2\u02af\u02ab\3\2\2\2\u02af" +
                    "\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0a\3\2\2\2" +
                    "\u02b1\u02b2\t\3\2\2\u02b2c\3\2\2\2\u02b3\u02b4\t\4\2\2\u02b4e\3\2\2\2" +
                    "\u02b5\u02b6\7n\2\2\u02b6\u02bd\5^\60\2\u02b7\u02ba\7A\2\2\u02b8\u02bb" +
                    "\5h\65\2\u02b9\u02bb\5l\67\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02ba" +
                    "\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\7B\2\2\u02bd\u02b7\3\2" +
                    "\2\2\u02bd\u02be\3\2\2\2\u02beg\3\2\2\2\u02bf\u02c4\5j\66\2\u02c0\u02c1" +
                    "\7H\2\2\u02c1\u02c3\5j\66\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4" +
                    "\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5i\3\2\2\2\u02c6\u02c4\3\2\2\2" +
                    "\u02c7\u02c8\7s\2\2\u02c8\u02c9\7J\2\2\u02c9\u02ca\5l\67\2\u02cak\3\2" +
                    "\2\2\u02cb\u02cf\5\u00a6T\2\u02cc\u02cf\5f\64\2\u02cd\u02cf\5n8\2\u02ce" +
                    "\u02cb\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cfm\3\2\2\2" +
                    "\u02d0\u02d9\7C\2\2\u02d1\u02d6\5l\67\2\u02d2\u02d3\7H\2\2\u02d3\u02d5" +
                    "\5l\67\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6" +
                    "\u02d7\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02d1\3\2" +
                    "\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02dd\7H\2\2\u02dc" +
                    "\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7D" +
                    "\2\2\u02dfo\3\2\2\2\u02e0\u02e1\7n\2\2\u02e1\u02e2\7\36\2\2\u02e2\u02e3" +
                    "\7s\2\2\u02e3\u02e4\5r:\2\u02e4q\3\2\2\2\u02e5\u02e9\7C\2\2\u02e6\u02e8" +
                    "\5t;\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9" +
                    "\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7D" +
                    "\2\2\u02eds\3\2\2\2\u02ee\u02f0\5\n\6\2\u02ef\u02ee\3\2\2\2\u02f0\u02f3" +
                    "\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3" +
                    "\u02f1\3\2\2\2\u02f4\u02f7\5v<\2\u02f5\u02f7\7G\2\2\u02f6\u02f1\3\2\2" +
                    "\2\u02f6\u02f5\3\2\2\2\u02f7u\3\2\2\2\u02f8\u02f9\5\u00c8e\2\u02f9\u02fa" +
                    "\5x=\2\u02fa\u02fb\7G\2\2\u02fb\u030d\3\2\2\2\u02fc\u02fe\5\20\t\2\u02fd" +
                    "\u02ff\7G\2\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u030d\3\2" +
                    "\2\2\u0300\u0302\5 \21\2\u0301\u0303\7G\2\2\u0302\u0301\3\2\2\2\u0302" +
                    "\u0303\3\2\2\2\u0303\u030d\3\2\2\2\u0304\u0306\5\30\r\2\u0305\u0307\7" +
                    "G\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030d\3\2\2\2\u0308" +
                    "\u030a\5p9\2\u0309\u030b\7G\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2" +
                    "\2\u030b\u030d\3\2\2\2\u030c\u02f8\3\2\2\2\u030c\u02fc\3\2\2\2\u030c\u0300" +
                    "\3\2\2\2\u030c\u0304\3\2\2\2\u030c\u0308\3\2\2\2\u030dw\3\2\2\2\u030e" +
                    "\u0311\5z>\2\u030f\u0311\5|?\2\u0310\u030e\3\2\2\2\u0310\u030f\3\2\2\2" +
                    "\u0311y\3\2\2\2\u0312\u0313\7s\2\2\u0313\u0314\7A\2\2\u0314\u0316\7B\2" +
                    "\2\u0315\u0317\5~@\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317{\3" +
                    "\2\2\2\u0318\u0319\5F$\2\u0319}\3\2\2\2\u031a\u031b\7\16\2\2\u031b\u031c" +
                    "\5l\67\2\u031c\177\3\2\2\2\u031d\u0321\7C\2\2\u031e\u0320\5\u0082B\2\u031f" +
                    "\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2" +
                    "\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0325\7D\2\2\u0325" +
                    "\u0081\3\2\2\2\u0326\u0327\5\u0084C\2\u0327\u0328\7G\2\2\u0328\u032c\3" +
                    "\2\2\2\u0329\u032c\5\u0088E\2\u032a\u032c\5\u0086D\2\u032b\u0326\3\2\2" +
                    "\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u0083\3\2\2\2\u032d\u032f" +
                    "\5\16\b\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2" +
                    "\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334" +
                    "\5\u00c8e\2\u0334\u0335\5F$\2\u0335\u0085\3\2\2\2\u0336\u0338\5\f\7\2" +
                    "\u0337\u0336\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a" +
                    "\3\2\2\2\u033a\u033e\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033f\5\20\t\2" +
                    "\u033d\u033f\5 \21\2\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u0342" +
                    "\3\2\2\2\u0340\u0342\7G\2\2\u0341\u0339\3\2\2\2\u0341\u0340\3\2\2\2\u0342" +
                    "\u0087\3\2\2\2\u0343\u03ac\5\u0080A\2\u0344\u0345\7\4\2\2\u0345\u0348" +
                    "\5\u00a6T\2\u0346\u0347\7P\2\2\u0347\u0349\5\u00a6T\2\u0348\u0346\3\2" +
                    "\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\7G\2\2\u034b" +
                    "\u03ac\3\2\2\2\u034c\u034d\7\30\2\2\u034d\u034e\5\u00a0Q\2\u034e\u0351" +
                    "\5\u0088E\2\u034f\u0350\7\21\2\2\u0350\u0352\5\u0088E\2\u0351\u034f\3" +
                    "\2\2\2\u0351\u0352\3\2\2\2\u0352\u03ac\3\2\2\2\u0353\u0354\7\27\2\2\u0354" +
                    "\u0355\7A\2\2\u0355\u0356\5\u009aN\2\u0356\u0357\7B\2\2\u0357\u0358\5" +
                    "\u0088E\2\u0358\u03ac\3\2\2\2\u0359\u035a\7\64\2\2\u035a\u035b\5\u00a0" +
                    "Q\2\u035b\u035c\5\u0088E\2\u035c\u03ac\3\2\2\2\u035d\u035e\7\17\2\2\u035e" +
                    "\u035f\5\u0088E\2\u035f\u0360\7\64\2\2\u0360\u0361\5\u00a0Q\2\u0361\u0362" +
                    "\7G\2\2\u0362\u03ac\3\2\2\2\u0363\u0364\7\61\2\2\u0364\u036e\5\u0080A" +
                    "\2\u0365\u0367\5\u008aF\2\u0366\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368" +
                    "\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u036c\5\u008e" +
                    "H\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036f\3\2\2\2\u036d" +
                    "\u036f\5\u008eH\2\u036e\u0366\3\2\2\2\u036e\u036d\3\2\2\2\u036f\u03ac" +
                    "\3\2\2\2\u0370\u0371\7\61\2\2\u0371\u0372\5\u0090I\2\u0372\u0376\5\u0080" +
                    "A\2\u0373\u0375\5\u008aF\2\u0374\u0373\3\2\2\2\u0375\u0378\3\2\2\2\u0376" +
                    "\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2" +
                    "\2\2\u0379\u037b\5\u008eH\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b" +
                    "\u03ac\3\2\2\2\u037c\u037d\7+\2\2\u037d\u037e\5\u00a0Q\2\u037e\u0382\7" +
                    "C\2\2\u037f\u0381\5\u0096L\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382" +
                    "\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0388\3\2\2\2\u0384\u0382\3\2" +
                    "\2\2\u0385\u0387\5\u0098M\2\u0386\u0385\3\2\2\2\u0387\u038a\3\2\2\2\u0388" +
                    "\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u0388\3\2" +
                    "\2\2\u038b\u038c\7D\2\2\u038c\u03ac\3\2\2\2\u038d\u038e\7,\2\2\u038e\u038f" +
                    "\5\u00a0Q\2\u038f\u0390\5\u0080A\2\u0390\u03ac\3\2\2\2\u0391\u0393\7&" +
                    "\2\2\u0392\u0394\5\u00a6T\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394" +
                    "\u0395\3\2\2\2\u0395\u03ac\7G\2\2\u0396\u0397\7.\2\2\u0397\u0398\5\u00a6" +
                    "T\2\u0398\u0399\7G\2\2\u0399\u03ac\3\2\2\2\u039a\u039c\7\6\2\2\u039b\u039d" +
                    "\7s\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e" +
                    "\u03ac\7G\2\2\u039f\u03a1\7\r\2\2\u03a0\u03a2\7s\2\2\u03a1\u03a0\3\2\2" +
                    "\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03ac\7G\2\2\u03a4\u03ac" +
                    "\7G\2\2\u03a5\u03a6\5\u00a6T\2\u03a6\u03a7\7G\2\2\u03a7\u03ac\3\2\2\2" +
                    "\u03a8\u03a9\7s\2\2\u03a9\u03aa\7P\2\2\u03aa\u03ac\5\u0088E\2\u03ab\u0343" +
                    "\3\2\2\2\u03ab\u0344\3\2\2\2\u03ab\u034c\3\2\2\2\u03ab\u0353\3\2\2\2\u03ab" +
                    "\u0359\3\2\2\2\u03ab\u035d\3\2\2\2\u03ab\u0363\3\2\2\2\u03ab\u0370\3\2" +
                    "\2\2\u03ab\u037c\3\2\2\2\u03ab\u038d\3\2\2\2\u03ab\u0391\3\2\2\2\u03ab" +
                    "\u0396\3\2\2\2\u03ab\u039a\3\2\2\2\u03ab\u039f\3\2\2\2\u03ab\u03a4\3\2" +
                    "\2\2\u03ab\u03a5\3\2\2\2\u03ab\u03a8\3\2\2\2\u03ac\u0089\3\2\2\2\u03ad" +
                    "\u03ae\7\t\2\2\u03ae\u03b2\7A\2\2\u03af\u03b1\5\16\b\2\u03b0\u03af\3\2" +
                    "\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3" +
                    "\u03b5\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\5\u008cG\2\u03b6\u03b7" +
                    "\7s\2\2\u03b7\u03b8\7B\2\2\u03b8\u03b9\5\u0080A\2\u03b9\u008b\3\2\2\2" +
                    "\u03ba\u03bf\5^\60\2\u03bb\u03bc\7^\2\2\u03bc\u03be\5^\60\2\u03bd\u03bb" +
                    "\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0" +
                    "\u008d\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c3\7\25\2\2\u03c3\u03c4\5" +
                    "\u0080A\2\u03c4\u008f\3\2\2\2\u03c5\u03c6\7A\2\2\u03c6\u03c8\5\u0092J" +
                    "\2\u03c7\u03c9\7G\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca" +
                    "\3\2\2\2\u03ca\u03cb\7B\2\2\u03cb\u0091\3\2\2\2\u03cc\u03d1\5\u0094K\2" +
                    "\u03cd\u03ce\7G\2\2\u03ce\u03d0\5\u0094K\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3" +
                    "\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u0093\3\2\2\2\u03d3" +
                    "\u03d1\3\2\2\2\u03d4\u03d6\5\16\b\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3" +
                    "\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9" +
                    "\u03d7\3\2\2\2\u03da\u03db\5P)\2\u03db\u03dc\5J&\2\u03dc\u03dd\7J\2\2" +
                    "\u03dd\u03de\5\u00a6T\2\u03de\u0095\3\2\2\2\u03df\u03e1\5\u0098M\2\u03e0" +
                    "\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2" +
                    "\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e6\5\u0082B\2\u03e5\u03e4\3\2\2\2\u03e6" +
                    "\u03e7\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u0097\3\2" +
                    "\2\2\u03e9\u03ec\7\b\2\2\u03ea\u03ed\5\u00a6T\2\u03eb\u03ed\7s\2\2\u03ec" +
                    "\u03ea\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f2\7P" +
                    "\2\2\u03ef\u03f0\7\16\2\2\u03f0\u03f2\7P\2\2\u03f1\u03e9\3\2\2\2\u03f1" +
                    "\u03ef\3\2\2\2\u03f2\u0099\3\2\2\2\u03f3\u0400\5\u009eP\2\u03f4\u03f6" +
                    "\5\u009cO\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2" +
                    "\2\u03f7\u03f9\7G\2\2\u03f8\u03fa\5\u00a6T\2\u03f9\u03f8\3\2\2\2\u03f9" +
                    "\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd\7G\2\2\u03fc\u03fe\5\u00a2" +
                    "R\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff" +
                    "\u03f3\3\2\2\2\u03ff\u03f5\3\2\2\2\u0400\u009b\3\2\2\2\u0401\u0404\5\u0084" +
                    "C\2\u0402\u0404\5\u00a2R\2\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404" +
                    "\u009d\3\2\2\2\u0405\u0407\5\16\b\2\u0406\u0405\3\2\2\2\u0407\u040a\3" +
                    "\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a" +
                    "\u0408\3\2\2\2\u040b\u040c\5\u00c8e\2\u040c\u040d\5J&\2\u040d\u040e\7" +
                    "P\2\2\u040e\u040f\5\u00a6T\2\u040f\u009f\3\2\2\2\u0410\u0411\7A\2\2\u0411" +
                    "\u0412\5\u00a6T\2\u0412\u0413\7B\2\2\u0413\u00a1\3\2\2\2\u0414\u0419\5" +
                    "\u00a6T\2\u0415\u0416\7H\2\2\u0416\u0418\5\u00a6T\2\u0417\u0415\3\2\2" +
                    "\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u00a3" +
                    "\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\7s\2\2\u041d\u041f\7A\2\2\u041e" +
                    "\u0420\5\u00a2R\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421" +
                    "\3\2\2\2\u0421\u042f\7B\2\2\u0422\u0423\7-\2\2\u0423\u0425\7A\2\2\u0424" +
                    "\u0426\5\u00a2R\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427" +
                    "\3\2\2\2\u0427\u042f\7B\2\2\u0428\u0429\7*\2\2\u0429\u042b\7A\2\2\u042a" +
                    "\u042c\5\u00a2R\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d" +
                    "\3\2\2\2\u042d\u042f\7B\2\2\u042e\u041c\3\2\2\2\u042e\u0422\3\2\2\2\u042e" +
                    "\u0428\3\2\2\2\u042f\u00a5\3\2\2\2\u0430\u0431\bT\1\2\u0431\u0451\5\u00b0" +
                    "Y\2\u0432\u0451\5\u00a4S\2\u0433\u0434\7!\2\2\u0434\u0451\5\u00b4[\2\u0435" +
                    "\u0436\7A\2\2\u0436\u0437\5\u00c8e\2\u0437\u0438\7B\2\2\u0438\u0439\5" +
                    "\u00a6T\30\u0439\u0451\3\2\2\2\u043a\u043b\t\5\2\2\u043b\u0451\5\u00a6" +
                    "T\26\u043c\u043d\t\6\2\2\u043d\u0451\5\u00a6T\25\u043e\u0451\5\u00aaV" +
                    "\2\u043f\u0440\5\u00c8e\2\u0440\u0446\7m\2\2\u0441\u0443\5\u00ccg\2\u0442" +
                    "\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0447\7s" +
                    "\2\2\u0445\u0447\7!\2\2\u0446\u0442\3\2\2\2\u0446\u0445\3\2\2\2\u0447" +
                    "\u0451\3\2\2\2\u0448\u0449\5\u00b2Z\2\u0449\u044b\7m\2\2\u044a\u044c\5" +
                    "\u00ccg\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2" +
                    "\u044d\u044e\7!\2\2\u044e\u0451\3\2\2\2\u044f\u0451\5\u00a8U\2\u0450\u0430" +
                    "\3\2\2\2\u0450\u0432\3\2\2\2\u0450\u0433\3\2\2\2\u0450\u0435\3\2\2\2\u0450" +
                    "\u043a\3\2\2\2\u0450\u043c\3\2\2\2\u0450\u043e\3\2\2\2\u0450\u043f\3\2" +
                    "\2\2\u0450\u0448\3\2\2\2\u0450\u044f\3\2\2\2\u0451\u04a2\3\2\2\2\u0452" +
                    "\u0453\f\24\2\2\u0453\u0454\t\7\2\2\u0454\u04a1\5\u00a6T\25\u0455\u0456" +
                    "\f\23\2\2\u0456\u0457\t\b\2\2\u0457\u04a1\5\u00a6T\24\u0458\u0460\f\22" +
                    "\2\2\u0459\u045a\7L\2\2\u045a\u0461\7L\2\2\u045b\u045c\7K\2\2\u045c\u045d" +
                    "\7K\2\2\u045d\u0461\7K\2\2\u045e\u045f\7K\2\2\u045f\u0461\7K\2\2\u0460" +
                    "\u0459\3\2\2\2\u0460\u045b\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0462\3\2" +
                    "\2\2\u0462\u04a1\5\u00a6T\23\u0463\u0464\f\21\2\2\u0464\u0465\t\t\2\2" +
                    "\u0465\u04a1\5\u00a6T\22\u0466\u0467\f\17\2\2\u0467\u0468\t\n\2\2\u0468" +
                    "\u04a1\5\u00a6T\20\u0469\u046a\f\16\2\2\u046a\u046b\7]\2\2\u046b\u04a1" +
                    "\5\u00a6T\17\u046c\u046d\f\r\2\2\u046d\u046e\7_\2\2\u046e\u04a1\5\u00a6" +
                    "T\16\u046f\u0470\f\f\2\2\u0470\u0471\7^\2\2\u0471\u04a1\5\u00a6T\r\u0472" +
                    "\u0473\f\13\2\2\u0473\u0474\7U\2\2\u0474\u04a1\5\u00a6T\f\u0475\u0476" +
                    "\f\n\2\2\u0476\u0477\7V\2\2\u0477\u04a1\5\u00a6T\13\u0478\u0479\f\t\2" +
                    "\2\u0479\u047a\7O\2\2\u047a\u047b\5\u00a6T\2\u047b\u047c\7P\2\2\u047c" +
                    "\u047d\5\u00a6T\n\u047d\u04a1\3\2\2\2\u047e\u047f\f\b\2\2\u047f\u0480" +
                    "\t\13\2\2\u0480\u04a1\5\u00a6T\b\u0481\u0482\f\34\2\2\u0482\u048e\7I\2" +
                    "\2\u0483\u048f\7s\2\2\u0484\u048f\5\u00a4S\2\u0485\u048f\7-\2\2\u0486" +
                    "\u0488\7!\2\2\u0487\u0489\5\u00c4c\2\u0488\u0487\3\2\2\2\u0488\u0489\3" +
                    "\2\2\2\u0489\u048a\3\2\2\2\u048a\u048f\5\u00b8]\2\u048b\u048c\7*\2\2\u048c" +
                    "\u048f\5\u00ceh\2\u048d\u048f\5\u00be`\2\u048e\u0483\3\2\2\2\u048e\u0484" +
                    "\3\2\2\2\u048e\u0485\3\2\2\2\u048e\u0486\3\2\2\2\u048e\u048b\3\2\2\2\u048e" +
                    "\u048d\3\2\2\2\u048f\u04a1\3\2\2\2\u0490\u0491\f\33\2\2\u0491\u0492\7" +
                    "E\2\2\u0492\u0493\5\u00a6T\2\u0493\u0494\7F\2\2\u0494\u04a1\3\2\2\2\u0495" +
                    "\u0496\f\27\2\2\u0496\u04a1\t\f\2\2\u0497\u0498\f\20\2\2\u0498\u0499\7" +
                    "\34\2\2\u0499\u04a1\5\u00c8e\2\u049a\u049b\f\6\2\2\u049b\u049d\7m\2\2" +
                    "\u049c\u049e\5\u00ccg\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e" +
                    "\u049f\3\2\2\2\u049f\u04a1\7s\2\2\u04a0\u0452\3\2\2\2\u04a0\u0455\3\2" +
                    "\2\2\u04a0\u0458\3\2\2\2\u04a0\u0463\3\2\2\2\u04a0\u0466\3\2\2\2\u04a0" +
                    "\u0469\3\2\2\2\u04a0\u046c\3\2\2\2\u04a0\u046f\3\2\2\2\u04a0\u0472\3\2" +
                    "\2\2\u04a0\u0475\3\2\2\2\u04a0\u0478\3\2\2\2\u04a0\u047e\3\2\2\2\u04a0" +
                    "\u0481\3\2\2\2\u04a0\u0490\3\2\2\2\u04a0\u0495\3\2\2\2\u04a0\u0497\3\2" +
                    "\2\2\u04a0\u049a\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2" +
                    "\u04a3\3\2\2\2\u04a3\u00a7\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a6\7\66" +
                    "\2\2\u04a6\u04a7\5\u00a6T\2\u04a7\u00a9\3\2\2\2\u04a8\u04a9\5\u00acW\2" +
                    "\u04a9\u04aa\7l\2\2\u04aa\u04ab\5\u00aeX\2\u04ab\u00ab\3\2\2\2\u04ac\u04bd" +
                    "\7s\2\2\u04ad\u04af\7A\2\2\u04ae\u04b0\5X-\2\u04af\u04ae\3\2\2\2\u04af" +
                    "\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04bd\7B\2\2\u04b2\u04b3\7A\2" +
                    "\2\u04b3\u04b8\7s\2\2\u04b4\u04b5\7H\2\2\u04b5\u04b7\7s\2\2\u04b6\u04b4" +
                    "\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9" +
                    "\u04bb\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04bd\7B\2\2\u04bc\u04ac\3\2" +
                    "\2\2\u04bc\u04ad\3\2\2\2\u04bc\u04b2\3\2\2\2\u04bd\u00ad\3\2\2\2\u04be" +
                    "\u04c1\5\u00a6T\2\u04bf\u04c1\5\u0080A\2\u04c0\u04be\3\2\2\2\u04c0\u04bf" +
                    "\3\2\2\2\u04c1\u00af\3\2\2\2\u04c2\u04c3\7A\2\2\u04c3\u04c4\5\u00a6T\2" +
                    "\u04c4\u04c5\7B\2\2\u04c5\u04d5\3\2\2\2\u04c6\u04d5\7-\2\2\u04c7\u04d5" +
                    "\7*\2\2\u04c8\u04d5\5`\61\2\u04c9\u04d5\7s\2\2\u04ca\u04cb\5.\30\2\u04cb" +
                    "\u04cc\7I\2\2\u04cc\u04cd\7\13\2\2\u04cd\u04d5\3\2\2\2\u04ce\u04d2\5\u00c4" +
                    "c\2\u04cf\u04d3\5\u00d0i\2\u04d0\u04d1\7-\2\2\u04d1\u04d3\5\u00d2j\2\u04d2" +
                    "\u04cf\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04c2\3\2" +
                    "\2\2\u04d4\u04c6\3\2\2\2\u04d4\u04c7\3\2\2\2\u04d4\u04c8\3\2\2\2\u04d4" +
                    "\u04c9\3\2\2\2\u04d4\u04ca\3\2\2\2\u04d4\u04ce\3\2\2\2\u04d5\u00b1\3\2" +
                    "\2\2\u04d6\u04d7\5P)\2\u04d7\u04d8\7I\2\2\u04d8\u04da\3\2\2\2\u04d9\u04d6" +
                    "\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04de\3\2\2\2\u04db\u04dd\5f\64\2\u04dc" +
                    "\u04db\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2" +
                    "\2\2\u04df\u04e1\3\2\2\2\u04e0\u04de\3\2\2\2\u04e1\u04e3\7s\2\2\u04e2" +
                    "\u04e4\5\u00ccg\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u00b3" +
                    "\3\2\2\2\u04e5\u04e6\5\u00c4c\2\u04e6\u04e7\5\u00b6\\\2\u04e7\u04e8\5" +
                    "\u00bc_\2\u04e8\u04ef\3\2\2\2\u04e9\u04ec\5\u00b6\\\2\u04ea\u04ed\5\u00ba" +
                    "^\2\u04eb\u04ed\5\u00bc_\2\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed" +
                    "\u04ef\3\2\2\2\u04ee\u04e5\3\2\2\2\u04ee\u04e9\3\2\2\2\u04ef\u00b5\3\2" +
                    "\2\2\u04f0\u04f2\7s\2\2\u04f1\u04f3\5\u00c0a\2\u04f2\u04f1\3\2\2\2\u04f2" +
                    "\u04f3\3\2\2\2\u04f3\u04fb\3\2\2\2\u04f4\u04f5\7I\2\2\u04f5\u04f7\7s\2" +
                    "\2\u04f6\u04f8\5\u00c0a\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8" +
                    "\u04fa\3\2\2\2\u04f9\u04f4\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2" +
                    "\2\2\u04fb\u04fc\3\2\2\2\u04fc\u0500\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe" +
                    "\u0500\5\u00caf\2\u04ff\u04f0\3\2\2\2\u04ff\u04fe\3\2\2\2\u0500\u00b7" +
                    "\3\2\2\2\u0501\u0503\7s\2\2\u0502\u0504\5\u00c2b\2\u0503\u0502\3\2\2\2" +
                    "\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\5\u00bc_\2\u0506" +
                    "\u00b9\3\2\2\2\u0507\u0523\7E\2\2\u0508\u050d\7F\2\2\u0509\u050a\7E\2" +
                    "\2\u050a\u050c\7F\2\2\u050b\u0509\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b" +
                    "\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u050d\3\2\2\2\u0510" +
                    "\u0524\5N(\2\u0511\u0512\5\u00a6T\2\u0512\u0519\7F\2\2\u0513\u0514\7E" +
                    "\2\2\u0514\u0515\5\u00a6T\2\u0515\u0516\7F\2\2\u0516\u0518\3\2\2\2\u0517" +
                    "\u0513\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2" +
                    "\2\2\u051a\u0520\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d\7E\2\2\u051d" +
                    "\u051f\7F\2\2\u051e\u051c\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2" +
                    "\2\2\u0520\u0521\3\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0523" +
                    "\u0508\3\2\2\2\u0523\u0511\3\2\2\2\u0524\u00bb\3\2\2\2\u0525\u0527\5\u00d2" +
                    "j\2\u0526\u0528\5\"\22\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528" +
                    "\u00bd\3\2\2\2\u0529\u052a\5\u00c4c\2\u052a\u052b\5\u00d0i\2\u052b\u00bf" +
                    "\3\2\2\2\u052c\u052d\7L\2\2\u052d\u0530\7K\2\2\u052e\u0530\5\u00ccg\2" +
                    "\u052f\u052c\3\2\2\2\u052f\u052e\3\2\2\2\u0530\u00c1\3\2\2\2\u0531\u0532" +
                    "\7L\2\2\u0532\u0535\7K\2\2\u0533\u0535\5\u00c4c\2\u0534\u0531\3\2\2\2" +
                    "\u0534\u0533\3\2\2\2\u0535\u00c3\3\2\2\2\u0536\u0537\7L\2\2\u0537\u0538" +
                    "\5\u00c6d\2\u0538\u0539\7K\2\2\u0539\u00c5\3\2\2\2\u053a\u053f\5\u00c8" +
                    "e\2\u053b\u053c\7H\2\2\u053c\u053e\5\u00c8e\2\u053d\u053b\3\2\2\2\u053e" +
                    "\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u00c7\3\2" +
                    "\2\2\u0541\u053f\3\2\2\2\u0542\u0544\5f\64\2\u0543\u0542\3\2\2\2\u0543" +
                    "\u0544\3\2\2\2\u0544\u0547\3\2\2\2\u0545\u0548\5P)\2\u0546\u0548\5\u00ca" +
                    "f\2\u0547\u0545\3\2\2\2\u0547\u0546\3\2\2\2\u0548\u054d\3\2\2\2\u0549" +
                    "\u054a\7E\2\2\u054a\u054c\7F\2\2\u054b\u0549\3\2\2\2\u054c\u054f\3\2\2" +
                    "\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u00c9\3\2\2\2\u054f\u054d" +
                    "\3\2\2\2\u0550\u0551\t\r\2\2\u0551\u00cb\3\2\2\2\u0552\u0553\7L\2\2\u0553" +
                    "\u0558\5R*\2\u0554\u0555\7H\2\2\u0555\u0557\5R*\2\u0556\u0554\3\2\2\2" +
                    "\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b" +
                    "\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055c\7K\2\2\u055c\u00cd\3\2\2\2\u055d" +
                    "\u0564\5\u00d2j\2\u055e\u055f\7I\2\2\u055f\u0561\7s\2\2\u0560\u0562\5" +
                    "\u00d2j\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2" +
                    "\u0563\u055d\3\2\2\2\u0563\u055e\3\2\2\2\u0564\u00cf\3\2\2\2\u0565\u0566" +
                    "\7*\2\2\u0566\u056a\5\u00ceh\2\u0567\u0568\7s\2\2\u0568\u056a\5\u00d2" +
                    "j\2\u0569\u0565\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u00d1\3\2\2\2\u056b" +
                    "\u056d\7A\2\2\u056c\u056e\5\u00a2R\2\u056d\u056c\3\2\2\2\u056d\u056e\3" +
                    "\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\7B\2\2\u0570\u00d3\3\2\2\2\u00ae" +
                    "\u00d5\u00da\u00e0\u00e8\u00f1\u00f6\u00fd\u0105\u0108\u010f\u0119\u011d" +
                    "\u0122\u0126\u012a\u0134\u013c\u0142\u0149\u0150\u0154\u0157\u015a\u0163" +
                    "\u0169\u016e\u0171\u0177\u017d\u0181\u0189\u0192\u0199\u019f\u01a3\u01ae" +
                    "\u01b7\u01bc\u01c1\u01c5\u01c9\u01d5\u01e0\u01e5\u01ee\u01f6\u0200\u0209" +
                    "\u0211\u0216\u021e\u0223\u022d\u0237\u023d\u0244\u0249\u0251\u0255\u0257" +
                    "\u025d\u0262\u0266\u026d\u026f\u0276\u027b\u0284\u0289\u028c\u0291\u029a" +
                    "\u02a6\u02af\u02ba\u02bd\u02c4\u02ce\u02d6\u02d9\u02dc\u02e9\u02f1\u02f6" +
                    "\u02fe\u0302\u0306\u030a\u030c\u0310\u0316\u0321\u032b\u0330\u0339\u033e" +
                    "\u0341\u0348\u0351\u0368\u036b\u036e\u0376\u037a\u0382\u0388\u0393\u039c" +
                    "\u03a1\u03ab\u03b2\u03bf\u03c8\u03d1\u03d7\u03e2\u03e7\u03ec\u03f1\u03f5" +
                    "\u03f9\u03fd\u03ff\u0403\u0408\u0419\u041f\u0425\u042b\u042e\u0442\u0446" +
                    "\u044b\u0450\u0460\u0488\u048e\u049d\u04a0\u04a2\u04af\u04b8\u04bc\u04c0" +
                    "\u04d2\u04d4\u04d9\u04de\u04e3\u04ec\u04ee\u04f2\u04f7\u04fb\u04ff\u0503" +
                    "\u050d\u0519\u0520\u0523\u0527\u052f\u0534\u053f\u0543\u0547\u054d\u0558" +
                    "\u0561\u0563\u0569\u056d";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();

    private static final String[] _LITERAL_NAMES = {
            null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
            "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
            "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
            "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
            "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
            "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
            "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
            "'transient'", "'try'", "'void'", "'volatile'", "'while'", "'async'",
            "'await'", null, null, null, null, null, null, null, null, null, "'null'",
            "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='",
            "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='",
            "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'",
            "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='",
            "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
            "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
            "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE",
            "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
            "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
            "TRY", "VOID", "VOLATILE", "WHILE", "ASYNC", "AWAIT", "DECIMAL_LITERAL",
            "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL",
            "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN",
            "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT",
            "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE",
            "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV",
            "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN",
            "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN",
            "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS",
            "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public JavaParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "JavaParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(210);
                        packageDeclaration();
                    }
                    break;
                }
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == IMPORT) {
                    {
                        {
                            setState(213);
                            importDeclaration();
                        }
                    }
                    setState(218);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(222);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
                    {
                        {
                            setState(219);
                            typeDeclaration();
                        }
                    }
                    setState(224);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(225);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
        PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_packageDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AT) {
                    {
                        {
                            setState(227);
                            annotation();
                        }
                    }
                    setState(232);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(233);
                match(PACKAGE);
                setState(234);
                qualifiedName();
                setState(235);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ImportDeclarationContext importDeclaration() throws RecognitionException {
        ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_importDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(237);
                match(IMPORT);
                setState(239);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == STATIC) {
                    {
                        setState(238);
                        match(STATIC);
                    }
                }

                setState(241);
                qualifiedName();
                setState(244);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DOT) {
                    {
                        setState(242);
                        match(DOT);
                        setState(243);
                        match(MUL);
                    }
                }

                setState(246);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
        TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_typeDeclaration);
        try {
            int _alt;
            setState(262);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case VOID:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(251);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(248);
                                    classOrInterfaceModifier();
                                }
                            }
                        }
                        setState(253);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                    }
                    setState(259);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                        case 1: {
                            setState(254);
                            classDeclaration();
                        }
                        break;
                        case 2: {
                            setState(255);
                            enumDeclaration();
                        }
                        break;
                        case 3: {
                            setState(256);
                            interfaceDeclaration();
                        }
                        break;
                        case 4: {
                            setState(257);
                            annotationTypeDeclaration();
                        }
                        break;
                        case 5: {
                            setState(258);
                            methodDeclaration();
                        }
                        break;
                    }
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(261);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ModifierContext modifier() throws RecognitionException {
        ModifierContext _localctx = new ModifierContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_modifier);
        try {
            setState(269);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case FINAL:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(264);
                    classOrInterfaceModifier();
                }
                break;
                case NATIVE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(265);
                    match(NATIVE);
                }
                break;
                case SYNCHRONIZED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(266);
                    match(SYNCHRONIZED);
                }
                break;
                case TRANSIENT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(267);
                    match(TRANSIENT);
                }
                break;
                case VOLATILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(268);
                    match(VOLATILE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
        ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
        try {
            setState(279);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(271);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(272);
                    match(PUBLIC);
                }
                break;
                case PROTECTED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(273);
                    match(PROTECTED);
                }
                break;
                case PRIVATE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(274);
                    match(PRIVATE);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(275);
                    match(STATIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(276);
                    match(ABSTRACT);
                }
                break;
                case FINAL:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(277);
                    match(FINAL);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(278);
                    match(STRICTFP);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableModifierContext variableModifier() throws RecognitionException {
        VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_variableModifier);
        try {
            setState(283);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FINAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(281);
                    match(FINAL);
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(282);
                    annotation();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassDeclarationContext classDeclaration() throws RecognitionException {
        ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_classDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(285);
                match(CLASS);
                setState(286);
                match(IDENTIFIER);
                setState(288);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(287);
                        typeParameters();
                    }
                }

                setState(292);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTENDS) {
                    {
                        setState(290);
                        match(EXTENDS);
                        setState(291);
                        typeType();
                    }
                }

                setState(296);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IMPLEMENTS) {
                    {
                        setState(294);
                        match(IMPLEMENTS);
                        setState(295);
                        typeList();
                    }
                }

                setState(298);
                classBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeParametersContext typeParameters() throws RecognitionException {
        TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_typeParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(LT);
                setState(301);
                typeParameter();
                setState(306);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(302);
                            match(COMMA);
                            setState(303);
                            typeParameter();
                        }
                    }
                    setState(308);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(309);
                match(GT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeParameterContext typeParameter() throws RecognitionException {
        TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_typeParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(314);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AT) {
                    {
                        {
                            setState(311);
                            annotation();
                        }
                    }
                    setState(316);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(317);
                match(IDENTIFIER);
                setState(320);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTENDS) {
                    {
                        setState(318);
                        match(EXTENDS);
                        setState(319);
                        typeBound();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeBoundContext typeBound() throws RecognitionException {
        TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_typeBound);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(322);
                typeType();
                setState(327);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == BITAND) {
                    {
                        {
                            setState(323);
                            match(BITAND);
                            setState(324);
                            typeType();
                        }
                    }
                    setState(329);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
        EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_enumDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(ENUM);
                setState(331);
                match(IDENTIFIER);
                setState(334);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IMPLEMENTS) {
                    {
                        setState(332);
                        match(IMPLEMENTS);
                        setState(333);
                        typeList();
                    }
                }

                setState(336);
                match(LBRACE);
                setState(338);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == AT || _la == IDENTIFIER) {
                    {
                        setState(337);
                        enumConstants();
                    }
                }

                setState(341);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(340);
                        match(COMMA);
                    }
                }

                setState(344);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SEMI) {
                    {
                        setState(343);
                        enumBodyDeclarations();
                    }
                }

                setState(346);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EnumConstantsContext enumConstants() throws RecognitionException {
        EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_enumConstants);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(348);
                enumConstant();
                setState(353);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(349);
                                match(COMMA);
                                setState(350);
                                enumConstant();
                            }
                        }
                    }
                    setState(355);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EnumConstantContext enumConstant() throws RecognitionException {
        EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_enumConstant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(359);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AT) {
                    {
                        {
                            setState(356);
                            annotation();
                        }
                    }
                    setState(361);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(362);
                match(IDENTIFIER);
                setState(364);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(363);
                        arguments();
                    }
                }

                setState(367);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LBRACE) {
                    {
                        setState(366);
                        classBody();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
        EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_enumBodyDeclarations);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(369);
                match(SEMI);
                setState(373);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
                    {
                        {
                            setState(370);
                            classBodyDeclaration();
                        }
                    }
                    setState(375);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
        InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_interfaceDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(376);
                match(INTERFACE);
                setState(377);
                match(IDENTIFIER);
                setState(379);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(378);
                        typeParameters();
                    }
                }

                setState(383);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTENDS) {
                    {
                        setState(381);
                        match(EXTENDS);
                        setState(382);
                        typeList();
                    }
                }

                setState(385);
                interfaceBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassBodyContext classBody() throws RecognitionException {
        ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_classBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(387);
                match(LBRACE);
                setState(391);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
                    {
                        {
                            setState(388);
                            classBodyDeclaration();
                        }
                    }
                    setState(393);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(394);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InterfaceBodyContext interfaceBody() throws RecognitionException {
        InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_interfaceBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(396);
                match(LBRACE);
                setState(400);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
                    {
                        {
                            setState(397);
                            interfaceBodyDeclaration();
                        }
                    }
                    setState(402);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(403);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
        ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_classBodyDeclaration);
        int _la;
        try {
            int _alt;
            setState(417);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(405);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(407);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == STATIC) {
                        {
                            setState(406);
                            match(STATIC);
                        }
                    }

                    setState(409);
                    block();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(413);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 33, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(410);
                                    modifier();
                                }
                            }
                        }
                        setState(415);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 33, _ctx);
                    }
                    setState(416);
                    memberDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
        MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_memberDeclaration);
        try {
            setState(428);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(419);
                    methodDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(420);
                    genericMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(421);
                    fieldDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(422);
                    constructorDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(423);
                    genericConstructorDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(424);
                    interfaceDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(425);
                    annotationTypeDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(426);
                    classDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(427);
                    enumDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
        MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_methodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(430);
                typeTypeOrVoid();
                setState(431);
                match(IDENTIFIER);
                setState(432);
                formalParameters();
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(433);
                            match(LBRACK);
                            setState(434);
                            match(RBRACK);
                        }
                    }
                    setState(439);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(442);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == THROWS) {
                    {
                        setState(440);
                        match(THROWS);
                        setState(441);
                        qualifiedNameList();
                    }
                }

                setState(444);
                methodBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MethodBodyContext methodBody() throws RecognitionException {
        MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_methodBody);
        int _la;
        try {
            setState(451);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ASYNC:
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(447);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ASYNC) {
                        {
                            setState(446);
                            match(ASYNC);
                        }
                    }

                    setState(449);
                    block();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(450);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
        TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_typeTypeOrVoid);
        try {
            setState(455);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(453);
                    typeType();
                }
                break;
                case VOID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(454);
                    match(VOID);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
        GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_genericMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(457);
                typeParameters();
                setState(458);
                methodDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
        GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(460);
                typeParameters();
                setState(461);
                constructorDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
        ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_constructorDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(463);
                match(IDENTIFIER);
                setState(464);
                formalParameters();
                setState(467);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == THROWS) {
                    {
                        setState(465);
                        match(THROWS);
                        setState(466);
                        qualifiedNameList();
                    }
                }

                setState(469);
                ((ConstructorDeclarationContext) _localctx).constructorBody = block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
        FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_fieldDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(471);
                typeType();
                setState(472);
                variableDeclarators();
                setState(473);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
        InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
        try {
            int _alt;
            setState(483);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DEFAULT:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case NATIVE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOID:
                case VOLATILE:
                case LT:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(478);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(475);
                                    modifier();
                                }
                            }
                        }
                        setState(480);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
                    }
                    setState(481);
                    interfaceMemberDeclaration();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(482);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
        InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
        try {
            setState(492);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(485);
                    constDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(486);
                    interfaceMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(487);
                    genericInterfaceMethodDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(488);
                    interfaceDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(489);
                    annotationTypeDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(490);
                    classDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(491);
                    enumDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstDeclarationContext constDeclaration() throws RecognitionException {
        ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_constDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(494);
                typeType();
                setState(495);
                constantDeclarator();
                setState(500);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(496);
                            match(COMMA);
                            setState(497);
                            constantDeclarator();
                        }
                    }
                    setState(502);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(503);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
        ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_constantDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(505);
                match(IDENTIFIER);
                setState(510);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(506);
                            match(LBRACK);
                            setState(507);
                            match(RBRACK);
                        }
                    }
                    setState(512);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(513);
                match(ASSIGN);
                setState(514);
                variableInitializer();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
        InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(519);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(516);
                                interfaceMethodModifier();
                            }
                        }
                    }
                    setState(521);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
                }
                setState(532);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                    case VOID:
                    case AT:
                    case IDENTIFIER: {
                        setState(522);
                        typeTypeOrVoid();
                    }
                    break;
                    case LT: {
                        setState(523);
                        typeParameters();
                        setState(527);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(524);
                                        annotation();
                                    }
                                }
                            }
                            setState(529);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                        }
                        setState(530);
                        typeTypeOrVoid();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(534);
                match(IDENTIFIER);
                setState(535);
                formalParameters();
                setState(540);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(536);
                            match(LBRACK);
                            setState(537);
                            match(RBRACK);
                        }
                    }
                    setState(542);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(545);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == THROWS) {
                    {
                        setState(543);
                        match(THROWS);
                        setState(544);
                        qualifiedNameList();
                    }
                }

                setState(547);
                methodBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
        InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_interfaceMethodModifier);
        try {
            setState(555);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(549);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(550);
                    match(PUBLIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(551);
                    match(ABSTRACT);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(552);
                    match(DEFAULT);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(553);
                    match(STATIC);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(554);
                    match(STRICTFP);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
        GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(557);
                typeParameters();
                setState(558);
                interfaceMethodDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
        VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_variableDeclarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(560);
                variableDeclarator();
                setState(565);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(561);
                            match(COMMA);
                            setState(562);
                            variableDeclarator();
                        }
                    }
                    setState(567);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
        VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_variableDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(568);
                variableDeclaratorId();
                setState(571);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASSIGN) {
                    {
                        setState(569);
                        match(ASSIGN);
                        {
                            setState(570);
                            variableInitializer();
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
        VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_variableDeclaratorId);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(573);
                match(IDENTIFIER);
                setState(578);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(574);
                            match(LBRACK);
                            setState(575);
                            match(RBRACK);
                        }
                    }
                    setState(580);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableInitializerContext variableInitializer() throws RecognitionException {
        VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_variableInitializer);
        try {
            setState(583);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(581);
                    arrayInitializer();
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
                case AWAIT:
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                case BOOL_LITERAL:
                case CHAR_LITERAL:
                case STRING_LITERAL:
                case NULL_LITERAL:
                case LPAREN:
                case LT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case ADD:
                case SUB:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(582);
                    expression(0);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
        ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_arrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(585);
                match(LBRACE);
                setState(597);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
                    {
                        setState(586);
                        variableInitializer();
                        setState(591);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(587);
                                        match(COMMA);
                                        setState(588);
                                        variableInitializer();
                                    }
                                }
                            }
                            setState(593);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
                        }
                        setState(595);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA) {
                            {
                                setState(594);
                                match(COMMA);
                            }
                        }

                    }
                }

                setState(599);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
        ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_classOrInterfaceType);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(601);
                match(IDENTIFIER);
                setState(603);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 60, _ctx)) {
                    case 1: {
                        setState(602);
                        typeArguments();
                    }
                    break;
                }
                setState(612);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(605);
                                match(DOT);
                                setState(606);
                                match(IDENTIFIER);
                                setState(608);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
                                    case 1: {
                                        setState(607);
                                        typeArguments();
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    setState(614);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeArgumentContext typeArgument() throws RecognitionException {
        TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_typeArgument);
        int _la;
        try {
            setState(621);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(615);
                    typeType();
                }
                break;
                case QUESTION:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(616);
                    match(QUESTION);
                    setState(619);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == EXTENDS || _la == SUPER) {
                        {
                            setState(617);
                            _la = _input.LA(1);
                            if (!(_la == EXTENDS || _la == SUPER)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(618);
                            typeType();
                        }
                    }

                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
        QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_qualifiedNameList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(623);
                qualifiedName();
                setState(628);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(624);
                            match(COMMA);
                            setState(625);
                            qualifiedName();
                        }
                    }
                    setState(630);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FormalParametersContext formalParameters() throws RecognitionException {
        FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_formalParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(631);
                match(LPAREN);
                setState(633);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la == AT || _la == IDENTIFIER) {
                    {
                        setState(632);
                        formalParameterList();
                    }
                }

                setState(635);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FormalParameterListContext formalParameterList() throws RecognitionException {
        FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_formalParameterList);
        int _la;
        try {
            int _alt;
            setState(650);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(637);
                    formalParameter();
                    setState(642);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 67, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(638);
                                    match(COMMA);
                                    setState(639);
                                    formalParameter();
                                }
                            }
                        }
                        setState(644);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 67, _ctx);
                    }
                    setState(647);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(645);
                            match(COMMA);
                            setState(646);
                            lastFormalParameter();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(649);
                    lastFormalParameter();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FormalParameterContext formalParameter() throws RecognitionException {
        FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_formalParameter);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(655);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 70, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(652);
                                variableModifier();
                            }
                        }
                    }
                    setState(657);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 70, _ctx);
                }
                setState(658);
                typeType();
                setState(659);
                variableDeclaratorId();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
        LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_lastFormalParameter);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(664);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(661);
                                variableModifier();
                            }
                        }
                    }
                    setState(666);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
                }
                setState(667);
                typeType();
                setState(668);
                match(ELLIPSIS);
                setState(669);
                variableDeclaratorId();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException {
        QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(671);
                match(IDENTIFIER);
                setState(676);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(672);
                                match(DOT);
                                setState(673);
                                match(IDENTIFIER);
                            }
                        }
                    }
                    setState(678);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_literal);
        try {
            setState(685);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(679);
                    integerLiteral();
                }
                break;
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(680);
                    floatLiteral();
                }
                break;
                case CHAR_LITERAL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(681);
                    match(CHAR_LITERAL);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(682);
                    match(STRING_LITERAL);
                }
                break;
                case BOOL_LITERAL:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(683);
                    match(BOOL_LITERAL);
                }
                break;
                case NULL_LITERAL:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(684);
                    match(NULL_LITERAL);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IntegerLiteralContext integerLiteral() throws RecognitionException {
        IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_integerLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(687);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FloatLiteralContext floatLiteral() throws RecognitionException {
        FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_floatLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(689);
                _la = _input.LA(1);
                if (!(_la == FLOAT_LITERAL || _la == HEX_FLOAT_LITERAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationContext annotation() throws RecognitionException {
        AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_annotation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(691);
                match(AT);
                setState(692);
                qualifiedName();
                setState(699);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(693);
                        match(LPAREN);
                        setState(696);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
                            case 1: {
                                setState(694);
                                elementValuePairs();
                            }
                            break;
                            case 2: {
                                setState(695);
                                elementValue();
                            }
                            break;
                        }
                        setState(698);
                        match(RPAREN);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
        ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_elementValuePairs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(701);
                elementValuePair();
                setState(706);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(702);
                            match(COMMA);
                            setState(703);
                            elementValuePair();
                        }
                    }
                    setState(708);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElementValuePairContext elementValuePair() throws RecognitionException {
        ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_elementValuePair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(709);
                match(IDENTIFIER);
                setState(710);
                match(ASSIGN);
                setState(711);
                elementValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElementValueContext elementValue() throws RecognitionException {
        ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_elementValue);
        try {
            setState(716);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 77, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(713);
                    expression(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(714);
                    annotation();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(715);
                    elementValueArrayInitializer();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
        ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_elementValueArrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(718);
                match(LBRACE);
                setState(727);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
                    {
                        setState(719);
                        elementValue();
                        setState(724);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 78, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(720);
                                        match(COMMA);
                                        setState(721);
                                        elementValue();
                                    }
                                }
                            }
                            setState(726);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 78, _ctx);
                        }
                    }
                }

                setState(730);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(729);
                        match(COMMA);
                    }
                }

                setState(732);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
        AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_annotationTypeDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(734);
                match(AT);
                setState(735);
                match(INTERFACE);
                setState(736);
                match(IDENTIFIER);
                setState(737);
                annotationTypeBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
        AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_annotationTypeBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(739);
                match(LBRACE);
                setState(743);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
                    {
                        {
                            setState(740);
                            annotationTypeElementDeclaration();
                        }
                    }
                    setState(745);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(746);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
        AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_annotationTypeElementDeclaration);
        try {
            int _alt;
            setState(756);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case NATIVE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOLATILE:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(751);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 82, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(748);
                                    modifier();
                                }
                            }
                        }
                        setState(753);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 82, _ctx);
                    }
                    setState(754);
                    annotationTypeElementRest();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(755);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
        AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_annotationTypeElementRest);
        try {
            setState(778);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(758);
                    typeType();
                    setState(759);
                    annotationMethodOrConstantRest();
                    setState(760);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(762);
                    classDeclaration();
                    setState(764);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
                        case 1: {
                            setState(763);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(766);
                    interfaceDeclaration();
                    setState(768);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 85, _ctx)) {
                        case 1: {
                            setState(767);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(770);
                    enumDeclaration();
                    setState(772);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 86, _ctx)) {
                        case 1: {
                            setState(771);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(774);
                    annotationTypeDeclaration();
                    setState(776);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
                        case 1: {
                            setState(775);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
        AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_annotationMethodOrConstantRest);
        try {
            setState(782);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(780);
                    annotationMethodRest();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(781);
                    annotationConstantRest();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
        AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_annotationMethodRest);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(784);
                match(IDENTIFIER);
                setState(785);
                match(LPAREN);
                setState(786);
                match(RPAREN);
                setState(788);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DEFAULT) {
                    {
                        setState(787);
                        defaultValue();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
        AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_annotationConstantRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(790);
                variableDeclarators();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DefaultValueContext defaultValue() throws RecognitionException {
        DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_defaultValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(792);
                match(DEFAULT);
                setState(793);
                elementValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(795);
                match(LBRACE);
                setState(799);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
                    {
                        {
                            setState(796);
                            blockStatement();
                        }
                    }
                    setState(801);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(802);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockStatementContext blockStatement() throws RecognitionException {
        BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_blockStatement);
        try {
            setState(809);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 92, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(804);
                    localVariableDeclaration();
                    setState(805);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(807);
                    statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(808);
                    localTypeDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
        LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_localVariableDeclaration);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(814);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(811);
                                variableModifier();
                            }
                        }
                    }
                    setState(816);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
                }
                setState(817);
                typeType();
                setState(818);
                variableDeclarators();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
        LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_localTypeDeclaration);
        int _la;
        try {
            setState(831);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case CLASS:
                case FINAL:
                case INTERFACE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(823);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
                        {
                            {
                                setState(820);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(825);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(828);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS: {
                            setState(826);
                            classDeclaration();
                        }
                        break;
                        case INTERFACE: {
                            setState(827);
                            interfaceDeclaration();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(830);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(937);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 109, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(833);
                    ((StatementContext) _localctx).blockLabel = block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(834);
                    match(ASSERT);
                    setState(835);
                    expression(0);
                    setState(838);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COLON) {
                        {
                            setState(836);
                            match(COLON);
                            setState(837);
                            expression(0);
                        }
                    }

                    setState(840);
                    match(SEMI);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(842);
                    match(IF);
                    setState(843);
                    parExpression();
                    setState(844);
                    statement();
                    setState(847);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
                        case 1: {
                            setState(845);
                            match(ELSE);
                            setState(846);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(849);
                    match(FOR);
                    setState(850);
                    match(LPAREN);
                    setState(851);
                    forControl();
                    setState(852);
                    match(RPAREN);
                    setState(853);
                    statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(855);
                    match(WHILE);
                    setState(856);
                    parExpression();
                    setState(857);
                    statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(859);
                    match(DO);
                    setState(860);
                    statement();
                    setState(861);
                    match(WHILE);
                    setState(862);
                    parExpression();
                    setState(863);
                    match(SEMI);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(865);
                    match(TRY);
                    setState(866);
                    block();
                    setState(876);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CATCH: {
                            setState(868);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(867);
                                        catchClause();
                                    }
                                }
                                setState(870);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == CATCH);
                            setState(873);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == FINALLY) {
                                {
                                    setState(872);
                                    finallyBlock();
                                }
                            }

                        }
                        break;
                        case FINALLY: {
                            setState(875);
                            finallyBlock();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(878);
                    match(TRY);
                    setState(879);
                    resourceSpecification();
                    setState(880);
                    block();
                    setState(884);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == CATCH) {
                        {
                            {
                                setState(881);
                                catchClause();
                            }
                        }
                        setState(886);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(888);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == FINALLY) {
                        {
                            setState(887);
                            finallyBlock();
                        }
                    }

                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(890);
                    match(SWITCH);
                    setState(891);
                    parExpression();
                    setState(892);
                    match(LBRACE);
                    setState(896);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(893);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(898);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
                    }
                    setState(902);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == CASE || _la == DEFAULT) {
                        {
                            {
                                setState(899);
                                switchLabel();
                            }
                        }
                        setState(904);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(905);
                    match(RBRACE);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(907);
                    match(SYNCHRONIZED);
                    setState(908);
                    parExpression();
                    setState(909);
                    block();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(911);
                    match(RETURN);
                    setState(913);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(912);
                            expression(0);
                        }
                    }

                    setState(915);
                    match(SEMI);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(916);
                    match(THROW);
                    setState(917);
                    expression(0);
                    setState(918);
                    match(SEMI);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(920);
                    match(BREAK);
                    setState(922);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IDENTIFIER) {
                        {
                            setState(921);
                            match(IDENTIFIER);
                        }
                    }

                    setState(924);
                    match(SEMI);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(925);
                    match(CONTINUE);
                    setState(927);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IDENTIFIER) {
                        {
                            setState(926);
                            match(IDENTIFIER);
                        }
                    }

                    setState(929);
                    match(SEMI);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(930);
                    match(SEMI);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(931);
                    ((StatementContext) _localctx).statementExpression = expression(0);
                    setState(932);
                    match(SEMI);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(934);
                    ((StatementContext) _localctx).identifierLabel = match(IDENTIFIER);
                    setState(935);
                    match(COLON);
                    setState(936);
                    statement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CatchClauseContext catchClause() throws RecognitionException {
        CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_catchClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(939);
                match(CATCH);
                setState(940);
                match(LPAREN);
                setState(944);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(941);
                            variableModifier();
                        }
                    }
                    setState(946);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(947);
                catchType();
                setState(948);
                match(IDENTIFIER);
                setState(949);
                match(RPAREN);
                setState(950);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CatchTypeContext catchType() throws RecognitionException {
        CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_catchType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(952);
                qualifiedName();
                setState(957);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == BITOR) {
                    {
                        {
                            setState(953);
                            match(BITOR);
                            setState(954);
                            qualifiedName();
                        }
                    }
                    setState(959);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FinallyBlockContext finallyBlock() throws RecognitionException {
        FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_finallyBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(960);
                match(FINALLY);
                setState(961);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
        ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_resourceSpecification);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(963);
                match(LPAREN);
                setState(964);
                resources();
                setState(966);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SEMI) {
                    {
                        setState(965);
                        match(SEMI);
                    }
                }

                setState(968);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ResourcesContext resources() throws RecognitionException {
        ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_resources);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(970);
                resource();
                setState(975);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 113, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(971);
                                match(SEMI);
                                setState(972);
                                resource();
                            }
                        }
                    }
                    setState(977);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 113, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ResourceContext resource() throws RecognitionException {
        ResourceContext _localctx = new ResourceContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_resource);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(981);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(978);
                            variableModifier();
                        }
                    }
                    setState(983);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(984);
                classOrInterfaceType();
                setState(985);
                variableDeclaratorId();
                setState(986);
                match(ASSIGN);
                setState(987);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
        SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_switchBlockStatementGroup);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(990);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(989);
                            switchLabel();
                        }
                    }
                    setState(992);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == CASE || _la == DEFAULT);
                setState(995);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(994);
                            blockStatement();
                        }
                    }
                    setState(997);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SwitchLabelContext switchLabel() throws RecognitionException {
        SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_switchLabel);
        try {
            setState(1007);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CASE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(999);
                    match(CASE);
                    setState(1002);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 117, _ctx)) {
                        case 1: {
                            setState(1000);
                            ((SwitchLabelContext) _localctx).constantExpression = expression(0);
                        }
                        break;
                        case 2: {
                            setState(1001);
                            ((SwitchLabelContext) _localctx).enumConstantName = match(IDENTIFIER);
                        }
                        break;
                    }
                    setState(1004);
                    match(COLON);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1005);
                    match(DEFAULT);
                    setState(1006);
                    match(COLON);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForControlContext forControl() throws RecognitionException {
        ForControlContext _localctx = new ForControlContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_forControl);
        int _la;
        try {
            setState(1021);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 122, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1009);
                    enhancedForControl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1011);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(1010);
                            forInit();
                        }
                    }

                    setState(1013);
                    match(SEMI);
                    setState(1015);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(1014);
                            expression(0);
                        }
                    }

                    setState(1017);
                    match(SEMI);
                    setState(1019);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(1018);
                            ((ForControlContext) _localctx).forUpdate = expressionList();
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForInitContext forInit() throws RecognitionException {
        ForInitContext _localctx = new ForInitContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_forInit);
        try {
            setState(1025);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 123, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1023);
                    localVariableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1024);
                    expressionList();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
        EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_enhancedForControl);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1030);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 124, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1027);
                                variableModifier();
                            }
                        }
                    }
                    setState(1032);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 124, _ctx);
                }
                setState(1033);
                typeType();
                setState(1034);
                variableDeclaratorId();
                setState(1035);
                match(COLON);
                setState(1036);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParExpressionContext parExpression() throws RecognitionException {
        ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_parExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1038);
                match(LPAREN);
                setState(1039);
                expression(0);
                setState(1040);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionListContext expressionList() throws RecognitionException {
        ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_expressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1042);
                expression(0);
                setState(1047);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1043);
                            match(COMMA);
                            setState(1044);
                            expression(0);
                        }
                    }
                    setState(1049);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MethodCallContext methodCall() throws RecognitionException {
        MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_methodCall);
        int _la;
        try {
            setState(1068);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1050);
                    match(IDENTIFIER);
                    setState(1051);
                    match(LPAREN);
                    setState(1053);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(1052);
                            expressionList();
                        }
                    }

                    setState(1055);
                    match(RPAREN);
                }
                break;
                case THIS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1056);
                    match(THIS);
                    setState(1057);
                    match(LPAREN);
                    setState(1059);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(1058);
                            expressionList();
                        }
                    }

                    setState(1061);
                    match(RPAREN);
                }
                break;
                case SUPER:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1062);
                    match(SUPER);
                    setState(1063);
                    match(LPAREN);
                    setState(1065);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                        {
                            setState(1064);
                            expressionList();
                        }
                    }

                    setState(1067);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 164;
        enterRecursionRule(_localctx, 164, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1102);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 133, _ctx)) {
                    case 1: {
                        setState(1071);
                        primary();
                    }
                    break;
                    case 2: {
                        setState(1072);
                        methodCall();
                    }
                    break;
                    case 3: {
                        setState(1073);
                        match(NEW);
                        setState(1074);
                        creator();
                    }
                    break;
                    case 4: {
                        setState(1075);
                        match(LPAREN);
                        setState(1076);
                        typeType();
                        setState(1077);
                        match(RPAREN);
                        setState(1078);
                        expression(22);
                    }
                    break;
                    case 5: {
                        setState(1080);
                        ((ExpressionContext) _localctx).prefix = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INC - 85)) | (1L << (DEC - 85)) | (1L << (ADD - 85)) | (1L << (SUB - 85)))) != 0))) {
                            ((ExpressionContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1081);
                        expression(20);
                    }
                    break;
                    case 6: {
                        setState(1082);
                        ((ExpressionContext) _localctx).prefix = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == BANG || _la == TILDE)) {
                            ((ExpressionContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1083);
                        expression(19);
                    }
                    break;
                    case 7: {
                        setState(1084);
                        lambdaExpression();
                    }
                    break;
                    case 8: {
                        setState(1085);
                        typeType();
                        setState(1086);
                        match(COLONCOLON);
                        setState(1092);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LT:
                            case IDENTIFIER: {
                                setState(1088);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LT) {
                                    {
                                        setState(1087);
                                        typeArguments();
                                    }
                                }

                                setState(1090);
                                match(IDENTIFIER);
                            }
                            break;
                            case NEW: {
                                setState(1091);
                                match(NEW);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    break;
                    case 9: {
                        setState(1094);
                        classType();
                        setState(1095);
                        match(COLONCOLON);
                        setState(1097);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LT) {
                            {
                                setState(1096);
                                typeArguments();
                            }
                        }

                        setState(1099);
                        match(NEW);
                    }
                    break;
                    case 10: {
                        setState(1101);
                        awaitExpression();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1184);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 139, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1182);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 138, _ctx)) {
                                case 1: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1104);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(1105);
                                    ((ExpressionContext) _localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0))) {
                                        ((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1106);
                                    expression(19);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1107);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(1108);
                                    ((ExpressionContext) _localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1109);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1110);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(1118);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 134, _ctx)) {
                                        case 1: {
                                            setState(1111);
                                            match(LT);
                                            setState(1112);
                                            match(LT);
                                        }
                                        break;
                                        case 2: {
                                            setState(1113);
                                            match(GT);
                                            setState(1114);
                                            match(GT);
                                            setState(1115);
                                            match(GT);
                                        }
                                        break;
                                        case 3: {
                                            setState(1116);
                                            match(GT);
                                            setState(1117);
                                            match(GT);
                                        }
                                        break;
                                    }
                                    setState(1120);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1121);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(1122);
                                    ((ExpressionContext) _localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (GT - 73)) | (1L << (LT - 73)) | (1L << (LE - 73)) | (1L << (GE - 73)))) != 0))) {
                                        ((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1123);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1124);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(1125);
                                    ((ExpressionContext) _localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQUAL || _la == NOTEQUAL)) {
                                        ((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1126);
                                    expression(14);
                                }
                                break;
                                case 6: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1127);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(1128);
                                    ((ExpressionContext) _localctx).bop = match(BITAND);
                                    setState(1129);
                                    expression(13);
                                }
                                break;
                                case 7: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1130);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(1131);
                                    ((ExpressionContext) _localctx).bop = match(CARET);
                                    setState(1132);
                                    expression(12);
                                }
                                break;
                                case 8: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1133);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(1134);
                                    ((ExpressionContext) _localctx).bop = match(BITOR);
                                    setState(1135);
                                    expression(11);
                                }
                                break;
                                case 9: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1136);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(1137);
                                    ((ExpressionContext) _localctx).bop = match(AND);
                                    setState(1138);
                                    expression(10);
                                }
                                break;
                                case 10: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1139);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(1140);
                                    ((ExpressionContext) _localctx).bop = match(OR);
                                    setState(1141);
                                    expression(9);
                                }
                                break;
                                case 11: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1142);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1143);
                                    ((ExpressionContext) _localctx).bop = match(QUESTION);
                                    setState(1144);
                                    expression(0);
                                    setState(1145);
                                    match(COLON);
                                    setState(1146);
                                    expression(8);
                                }
                                break;
                                case 12: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1148);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(1149);
                                    ((ExpressionContext) _localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ADD_ASSIGN - 72)) | (1L << (SUB_ASSIGN - 72)) | (1L << (MUL_ASSIGN - 72)) | (1L << (DIV_ASSIGN - 72)) | (1L << (AND_ASSIGN - 72)) | (1L << (OR_ASSIGN - 72)) | (1L << (XOR_ASSIGN - 72)) | (1L << (MOD_ASSIGN - 72)) | (1L << (LSHIFT_ASSIGN - 72)) | (1L << (RSHIFT_ASSIGN - 72)) | (1L << (URSHIFT_ASSIGN - 72)))) != 0))) {
                                        ((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1150);
                                    expression(6);
                                }
                                break;
                                case 13: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1151);
                                    if (!(precpred(_ctx, 26)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                                    setState(1152);
                                    ((ExpressionContext) _localctx).bop = match(DOT);
                                    setState(1164);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 136, _ctx)) {
                                        case 1: {
                                            setState(1153);
                                            match(IDENTIFIER);
                                        }
                                        break;
                                        case 2: {
                                            setState(1154);
                                            methodCall();
                                        }
                                        break;
                                        case 3: {
                                            setState(1155);
                                            match(THIS);
                                        }
                                        break;
                                        case 4: {
                                            setState(1156);
                                            match(NEW);
                                            setState(1158);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la == LT) {
                                                {
                                                    setState(1157);
                                                    nonWildcardTypeArguments();
                                                }
                                            }

                                            setState(1160);
                                            innerCreator();
                                        }
                                        break;
                                        case 5: {
                                            setState(1161);
                                            match(SUPER);
                                            setState(1162);
                                            superSuffix();
                                        }
                                        break;
                                        case 6: {
                                            setState(1163);
                                            explicitGenericInvocation();
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 14: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1166);
                                    if (!(precpred(_ctx, 25)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(1167);
                                    match(LBRACK);
                                    setState(1168);
                                    expression(0);
                                    setState(1169);
                                    match(RBRACK);
                                }
                                break;
                                case 15: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1171);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(1172);
                                    ((ExpressionContext) _localctx).postfix = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == INC || _la == DEC)) {
                                        ((ExpressionContext) _localctx).postfix = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                                break;
                                case 16: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1173);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(1174);
                                    ((ExpressionContext) _localctx).bop = match(INSTANCEOF);
                                    setState(1175);
                                    typeType();
                                }
                                break;
                                case 17: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1176);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1177);
                                    match(COLONCOLON);
                                    setState(1179);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == LT) {
                                        {
                                            setState(1178);
                                            typeArguments();
                                        }
                                    }

                                    setState(1181);
                                    match(IDENTIFIER);
                                }
                                break;
                            }
                        }
                    }
                    setState(1186);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 139, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final AwaitExpressionContext awaitExpression() throws RecognitionException {
        AwaitExpressionContext _localctx = new AwaitExpressionContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_awaitExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1187);
                match(AWAIT);
                setState(1188);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
        LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_lambdaExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1190);
                lambdaParameters();
                setState(1191);
                match(ARROW);
                setState(1192);
                lambdaBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LambdaParametersContext lambdaParameters() throws RecognitionException {
        LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_lambdaParameters);
        int _la;
        try {
            setState(1210);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 142, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1194);
                    match(IDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1195);
                    match(LPAREN);
                    setState(1197);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la == AT || _la == IDENTIFIER) {
                        {
                            setState(1196);
                            formalParameterList();
                        }
                    }

                    setState(1199);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1200);
                    match(LPAREN);
                    setState(1201);
                    match(IDENTIFIER);
                    setState(1206);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(1202);
                                match(COMMA);
                                setState(1203);
                                match(IDENTIFIER);
                            }
                        }
                        setState(1208);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1209);
                    match(RPAREN);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LambdaBodyContext lambdaBody() throws RecognitionException {
        LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_lambdaBody);
        try {
            setState(1214);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
                case AWAIT:
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                case BOOL_LITERAL:
                case CHAR_LITERAL:
                case STRING_LITERAL:
                case NULL_LITERAL:
                case LPAREN:
                case LT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case ADD:
                case SUB:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1212);
                    expression(0);
                }
                break;
                case LBRACE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1213);
                    block();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrimaryContext primary() throws RecognitionException {
        PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_primary);
        try {
            setState(1234);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 145, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1216);
                    match(LPAREN);
                    setState(1217);
                    expression(0);
                    setState(1218);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1220);
                    match(THIS);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1221);
                    match(SUPER);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1222);
                    literal();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1223);
                    match(IDENTIFIER);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1224);
                    typeTypeOrVoid();
                    setState(1225);
                    match(DOT);
                    setState(1226);
                    match(CLASS);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1228);
                    nonWildcardTypeArguments();
                    setState(1232);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case SUPER:
                        case IDENTIFIER: {
                            setState(1229);
                            explicitGenericInvocationSuffix();
                        }
                        break;
                        case THIS: {
                            setState(1230);
                            match(THIS);
                            setState(1231);
                            arguments();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassTypeContext classType() throws RecognitionException {
        ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_classType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1239);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
                    case 1: {
                        setState(1236);
                        classOrInterfaceType();
                        setState(1237);
                        match(DOT);
                    }
                    break;
                }
                setState(1244);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AT) {
                    {
                        {
                            setState(1241);
                            annotation();
                        }
                    }
                    setState(1246);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1247);
                match(IDENTIFIER);
                setState(1249);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(1248);
                        typeArguments();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CreatorContext creator() throws RecognitionException {
        CreatorContext _localctx = new CreatorContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_creator);
        try {
            setState(1260);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1251);
                    nonWildcardTypeArguments();
                    setState(1252);
                    createdName();
                    setState(1253);
                    classCreatorRest();
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1255);
                    createdName();
                    setState(1258);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LBRACK: {
                            setState(1256);
                            arrayCreatorRest();
                        }
                        break;
                        case LPAREN: {
                            setState(1257);
                            classCreatorRest();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CreatedNameContext createdName() throws RecognitionException {
        CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_createdName);
        int _la;
        try {
            setState(1277);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1262);
                    match(IDENTIFIER);
                    setState(1264);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == LT) {
                        {
                            setState(1263);
                            typeArgumentsOrDiamond();
                        }
                    }

                    setState(1273);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == DOT) {
                        {
                            {
                                setState(1266);
                                match(DOT);
                                setState(1267);
                                match(IDENTIFIER);
                                setState(1269);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LT) {
                                    {
                                        setState(1268);
                                        typeArgumentsOrDiamond();
                                    }
                                }

                            }
                        }
                        setState(1275);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1276);
                    primitiveType();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InnerCreatorContext innerCreator() throws RecognitionException {
        InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_innerCreator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1279);
                match(IDENTIFIER);
                setState(1281);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(1280);
                        nonWildcardTypeArgumentsOrDiamond();
                    }
                }

                setState(1283);
                classCreatorRest();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
        ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_arrayCreatorRest);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1285);
                match(LBRACK);
                setState(1313);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RBRACK: {
                        setState(1286);
                        match(RBRACK);
                        setState(1291);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == LBRACK) {
                            {
                                {
                                    setState(1287);
                                    match(LBRACK);
                                    setState(1288);
                                    match(RBRACK);
                                }
                            }
                            setState(1293);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1294);
                        arrayInitializer();
                    }
                    break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case NEW:
                    case SHORT:
                    case SUPER:
                    case THIS:
                    case VOID:
                    case AWAIT:
                    case DECIMAL_LITERAL:
                    case HEX_LITERAL:
                    case OCT_LITERAL:
                    case BINARY_LITERAL:
                    case FLOAT_LITERAL:
                    case HEX_FLOAT_LITERAL:
                    case BOOL_LITERAL:
                    case CHAR_LITERAL:
                    case STRING_LITERAL:
                    case NULL_LITERAL:
                    case LPAREN:
                    case LT:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case AT:
                    case IDENTIFIER: {
                        setState(1295);
                        expression(0);
                        setState(1296);
                        match(RBRACK);
                        setState(1303);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 157, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1297);
                                        match(LBRACK);
                                        setState(1298);
                                        expression(0);
                                        setState(1299);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1305);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 157, _ctx);
                        }
                        setState(1310);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 158, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1306);
                                        match(LBRACK);
                                        setState(1307);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1312);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 158, _ctx);
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
        ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_classCreatorRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1315);
                arguments();
                setState(1317);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 160, _ctx)) {
                    case 1: {
                        setState(1316);
                        classBody();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
        ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_explicitGenericInvocation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1319);
                nonWildcardTypeArguments();
                setState(1320);
                explicitGenericInvocationSuffix();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
        TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_typeArgumentsOrDiamond);
        try {
            setState(1325);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 161, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1322);
                    match(LT);
                    setState(1323);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1324);
                    typeArguments();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
        NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_nonWildcardTypeArgumentsOrDiamond);
        try {
            setState(1330);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 162, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1327);
                    match(LT);
                    setState(1328);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1329);
                    nonWildcardTypeArguments();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
        NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_nonWildcardTypeArguments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1332);
                match(LT);
                setState(1333);
                typeList();
                setState(1334);
                match(GT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeListContext typeList() throws RecognitionException {
        TypeListContext _localctx = new TypeListContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_typeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1336);
                typeType();
                setState(1341);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1337);
                            match(COMMA);
                            setState(1338);
                            typeType();
                        }
                    }
                    setState(1343);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeTypeContext typeType() throws RecognitionException {
        TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_typeType);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1345);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == AT) {
                    {
                        setState(1344);
                        annotation();
                    }
                }

                setState(1349);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case IDENTIFIER: {
                        setState(1347);
                        classOrInterfaceType();
                    }
                    break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT: {
                        setState(1348);
                        primitiveType();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(1355);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 166, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1351);
                                match(LBRACK);
                                setState(1352);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(1357);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 166, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrimitiveTypeContext primitiveType() throws RecognitionException {
        PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_primitiveType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1358);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeArgumentsContext typeArguments() throws RecognitionException {
        TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_typeArguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1360);
                match(LT);
                setState(1361);
                typeArgument();
                setState(1366);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1362);
                            match(COMMA);
                            setState(1363);
                            typeArgument();
                        }
                    }
                    setState(1368);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1369);
                match(GT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SuperSuffixContext superSuffix() throws RecognitionException {
        SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_superSuffix);
        try {
            setState(1377);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LPAREN:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1371);
                    arguments();
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1372);
                    match(DOT);
                    setState(1373);
                    match(IDENTIFIER);
                    setState(1375);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 168, _ctx)) {
                        case 1: {
                            setState(1374);
                            arguments();
                        }
                        break;
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
        ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_explicitGenericInvocationSuffix);
        try {
            setState(1383);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SUPER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1379);
                    match(SUPER);
                    setState(1380);
                    superSuffix();
                }
                break;
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1381);
                    match(IDENTIFIER);
                    setState(1382);
                    arguments();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1385);
                match(LPAREN);
                setState(1387);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << AWAIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
                    {
                        setState(1386);
                        expressionList();
                    }
                }

                setState(1389);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 82:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 18);
            case 1:
                return precpred(_ctx, 17);
            case 2:
                return precpred(_ctx, 16);
            case 3:
                return precpred(_ctx, 15);
            case 4:
                return precpred(_ctx, 13);
            case 5:
                return precpred(_ctx, 12);
            case 6:
                return precpred(_ctx, 11);
            case 7:
                return precpred(_ctx, 10);
            case 8:
                return precpred(_ctx, 9);
            case 9:
                return precpred(_ctx, 8);
            case 10:
                return precpred(_ctx, 7);
            case 11:
                return precpred(_ctx, 6);
            case 12:
                return precpred(_ctx, 26);
            case 13:
                return precpred(_ctx, 25);
            case 14:
                return precpred(_ctx, 21);
            case 15:
                return precpred(_ctx, 14);
            case 16:
                return precpred(_ctx, 4);
        }
        return true;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(JavaParser.EOF, 0);
        }

        public PackageDeclarationContext packageDeclaration() {
            return getRuleContext(PackageDeclarationContext.class, 0);
        }

        public List<ImportDeclarationContext> importDeclaration() {
            return getRuleContexts(ImportDeclarationContext.class);
        }

        public ImportDeclarationContext importDeclaration(int i) {
            return getRuleContext(ImportDeclarationContext.class, i);
        }

        public List<TypeDeclarationContext> typeDeclaration() {
            return getRuleContexts(TypeDeclarationContext.class);
        }

        public TypeDeclarationContext typeDeclaration(int i) {
            return getRuleContext(TypeDeclarationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCompilationUnit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCompilationUnit(this);
        }
    }

    public static class PackageDeclarationContext extends ParserRuleContext {
        public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PACKAGE() {
            return getToken(JavaParser.PACKAGE, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_packageDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterPackageDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitPackageDeclaration(this);
        }
    }

    public static class ImportDeclarationContext extends ParserRuleContext {
        public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IMPORT() {
            return getToken(JavaParser.IMPORT, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode STATIC() {
            return getToken(JavaParser.STATIC, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterImportDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitImportDeclaration(this);
        }
    }

    public static class TypeDeclarationContext extends ParserRuleContext {
        public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
            return getRuleContexts(ClassOrInterfaceModifierContext.class);
        }

        public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
            return getRuleContext(ClassOrInterfaceModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeDeclaration(this);
        }
    }

    public static class ModifierContext extends ParserRuleContext {
        public ModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
            return getRuleContext(ClassOrInterfaceModifierContext.class, 0);
        }

        public TerminalNode NATIVE() {
            return getToken(JavaParser.NATIVE, 0);
        }

        public TerminalNode SYNCHRONIZED() {
            return getToken(JavaParser.SYNCHRONIZED, 0);
        }

        public TerminalNode TRANSIENT() {
            return getToken(JavaParser.TRANSIENT, 0);
        }

        public TerminalNode VOLATILE() {
            return getToken(JavaParser.VOLATILE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitModifier(this);
        }
    }

    public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
        public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        public TerminalNode PUBLIC() {
            return getToken(JavaParser.PUBLIC, 0);
        }

        public TerminalNode PROTECTED() {
            return getToken(JavaParser.PROTECTED, 0);
        }

        public TerminalNode PRIVATE() {
            return getToken(JavaParser.PRIVATE, 0);
        }

        public TerminalNode STATIC() {
            return getToken(JavaParser.STATIC, 0);
        }

        public TerminalNode ABSTRACT() {
            return getToken(JavaParser.ABSTRACT, 0);
        }

        public TerminalNode FINAL() {
            return getToken(JavaParser.FINAL, 0);
        }

        public TerminalNode STRICTFP() {
            return getToken(JavaParser.STRICTFP, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classOrInterfaceModifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterClassOrInterfaceModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitClassOrInterfaceModifier(this);
        }
    }

    public static class VariableModifierContext extends ParserRuleContext {
        public VariableModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FINAL() {
            return getToken(JavaParser.FINAL, 0);
        }

        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableModifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableModifier(this);
        }
    }

    public static class ClassDeclarationContext extends ParserRuleContext {
        public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CLASS() {
            return getToken(JavaParser.CLASS, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public TerminalNode EXTENDS() {
            return getToken(JavaParser.EXTENDS, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public TerminalNode IMPLEMENTS() {
            return getToken(JavaParser.IMPLEMENTS, 0);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassDeclaration(this);
        }
    }

    public static class TypeParametersContext extends ParserRuleContext {
        public TypeParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TypeParameterContext> typeParameter() {
            return getRuleContexts(TypeParameterContext.class);
        }

        public TypeParameterContext typeParameter(int i) {
            return getRuleContext(TypeParameterContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeParameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeParameters(this);
        }
    }

    public static class TypeParameterContext extends ParserRuleContext {
        public TypeParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        public TerminalNode EXTENDS() {
            return getToken(JavaParser.EXTENDS, 0);
        }

        public TypeBoundContext typeBound() {
            return getRuleContext(TypeBoundContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeParameter(this);
        }
    }

    public static class TypeBoundContext extends ParserRuleContext {
        public TypeBoundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TypeTypeContext> typeType() {
            return getRuleContexts(TypeTypeContext.class);
        }

        public TypeTypeContext typeType(int i) {
            return getRuleContext(TypeTypeContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeBound;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeBound(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeBound(this);
        }
    }

    public static class EnumDeclarationContext extends ParserRuleContext {
        public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ENUM() {
            return getToken(JavaParser.ENUM, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public TerminalNode IMPLEMENTS() {
            return getToken(JavaParser.IMPLEMENTS, 0);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        public EnumConstantsContext enumConstants() {
            return getRuleContext(EnumConstantsContext.class, 0);
        }

        public EnumBodyDeclarationsContext enumBodyDeclarations() {
            return getRuleContext(EnumBodyDeclarationsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumDeclaration(this);
        }
    }

    public static class EnumConstantsContext extends ParserRuleContext {
        public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<EnumConstantContext> enumConstant() {
            return getRuleContexts(EnumConstantContext.class);
        }

        public EnumConstantContext enumConstant(int i) {
            return getRuleContext(EnumConstantContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumConstants;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumConstants(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumConstants(this);
        }
    }

    public static class EnumConstantContext extends ParserRuleContext {
        public EnumConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumConstant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumConstant(this);
        }
    }

    public static class EnumBodyDeclarationsContext extends ParserRuleContext {
        public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }

        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumBodyDeclarations;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumBodyDeclarations(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumBodyDeclarations(this);
        }
    }

    public static class InterfaceDeclarationContext extends ParserRuleContext {
        public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INTERFACE() {
            return getToken(JavaParser.INTERFACE, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public InterfaceBodyContext interfaceBody() {
            return getRuleContext(InterfaceBodyContext.class, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public TerminalNode EXTENDS() {
            return getToken(JavaParser.EXTENDS, 0);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterInterfaceDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitInterfaceDeclaration(this);
        }
    }

    public static class ClassBodyContext extends ParserRuleContext {
        public ClassBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }

        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassBody(this);
        }
    }

    public static class InterfaceBodyContext extends ParserRuleContext {
        public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
            return getRuleContexts(InterfaceBodyDeclarationContext.class);
        }

        public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
            return getRuleContext(InterfaceBodyDeclarationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterInterfaceBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitInterfaceBody(this);
        }
    }

    public static class ClassBodyDeclarationContext extends ParserRuleContext {
        public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode STATIC() {
            return getToken(JavaParser.STATIC, 0);
        }

        public MemberDeclarationContext memberDeclaration() {
            return getRuleContext(MemberDeclarationContext.class, 0);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classBodyDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassBodyDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassBodyDeclaration(this);
        }
    }

    public static class MemberDeclarationContext extends ParserRuleContext {
        public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        public GenericMethodDeclarationContext genericMethodDeclaration() {
            return getRuleContext(GenericMethodDeclarationContext.class, 0);
        }

        public FieldDeclarationContext fieldDeclaration() {
            return getRuleContext(FieldDeclarationContext.class, 0);
        }

        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class, 0);
        }

        public GenericConstructorDeclarationContext genericConstructorDeclaration() {
            return getRuleContext(GenericConstructorDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_memberDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMemberDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMemberDeclaration(this);
        }
    }

    public static class MethodDeclarationContext extends ParserRuleContext {
        public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeOrVoidContext typeTypeOrVoid() {
            return getRuleContext(TypeTypeOrVoidContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public MethodBodyContext methodBody() {
            return getRuleContext(MethodBodyContext.class, 0);
        }

        public TerminalNode THROWS() {
            return getToken(JavaParser.THROWS, 0);
        }

        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMethodDeclaration(this);
        }
    }

    public static class MethodBodyContext extends ParserRuleContext {
        public MethodBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode ASYNC() {
            return getToken(JavaParser.ASYNC, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMethodBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMethodBody(this);
        }
    }

    public static class TypeTypeOrVoidContext extends ParserRuleContext {
        public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public TerminalNode VOID() {
            return getToken(JavaParser.VOID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeTypeOrVoid;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeTypeOrVoid(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeTypeOrVoid(this);
        }
    }

    public static class GenericMethodDeclarationContext extends ParserRuleContext {
        public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericMethodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterGenericMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitGenericMethodDeclaration(this);
        }
    }

    public static class GenericConstructorDeclarationContext extends ParserRuleContext {
        public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericConstructorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterGenericConstructorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitGenericConstructorDeclaration(this);
        }
    }

    public static class ConstructorDeclarationContext extends ParserRuleContext {
        public BlockContext constructorBody;

        public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode THROWS() {
            return getToken(JavaParser.THROWS, 0);
        }

        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterConstructorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitConstructorDeclaration(this);
        }
    }

    public static class FieldDeclarationContext extends ParserRuleContext {
        public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFieldDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFieldDeclaration(this);
        }
    }

    public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
        public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
            return getRuleContext(InterfaceMemberDeclarationContext.class, 0);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceBodyDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterInterfaceBodyDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitInterfaceBodyDeclaration(this);
        }
    }

    public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
        public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ConstDeclarationContext constDeclaration() {
            return getRuleContext(ConstDeclarationContext.class, 0);
        }

        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
        }

        public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
            return getRuleContext(GenericInterfaceMethodDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceMemberDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterInterfaceMemberDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitInterfaceMemberDeclaration(this);
        }
    }

    public static class ConstDeclarationContext extends ParserRuleContext {
        public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public List<ConstantDeclaratorContext> constantDeclarator() {
            return getRuleContexts(ConstantDeclaratorContext.class);
        }

        public ConstantDeclaratorContext constantDeclarator(int i) {
            return getRuleContext(ConstantDeclaratorContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterConstDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitConstDeclaration(this);
        }
    }

    public static class ConstantDeclaratorContext extends ParserRuleContext {
        public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterConstantDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitConstantDeclarator(this);
        }
    }

    public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
        public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public MethodBodyContext methodBody() {
            return getRuleContext(MethodBodyContext.class, 0);
        }

        public TypeTypeOrVoidContext typeTypeOrVoid() {
            return getRuleContext(TypeTypeOrVoidContext.class, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
            return getRuleContexts(InterfaceMethodModifierContext.class);
        }

        public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
            return getRuleContext(InterfaceMethodModifierContext.class, i);
        }

        public TerminalNode THROWS() {
            return getToken(JavaParser.THROWS, 0);
        }

        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class, 0);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceMethodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterInterfaceMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitInterfaceMethodDeclaration(this);
        }
    }

    public static class InterfaceMethodModifierContext extends ParserRuleContext {
        public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        public TerminalNode PUBLIC() {
            return getToken(JavaParser.PUBLIC, 0);
        }

        public TerminalNode ABSTRACT() {
            return getToken(JavaParser.ABSTRACT, 0);
        }

        public TerminalNode DEFAULT() {
            return getToken(JavaParser.DEFAULT, 0);
        }

        public TerminalNode STATIC() {
            return getToken(JavaParser.STATIC, 0);
        }

        public TerminalNode STRICTFP() {
            return getToken(JavaParser.STRICTFP, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceMethodModifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterInterfaceMethodModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitInterfaceMethodModifier(this);
        }
    }

    public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
        public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericInterfaceMethodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterGenericInterfaceMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitGenericInterfaceMethodDeclaration(this);
        }
    }

    public static class VariableDeclaratorsContext extends ParserRuleContext {
        public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<VariableDeclaratorContext> variableDeclarator() {
            return getRuleContexts(VariableDeclaratorContext.class);
        }

        public VariableDeclaratorContext variableDeclarator(int i) {
            return getRuleContext(VariableDeclaratorContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableDeclarators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableDeclarators(this);
        }
    }

    public static class VariableDeclaratorContext extends ParserRuleContext {
        public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableDeclarator(this);
        }
    }

    public static class VariableDeclaratorIdContext extends ParserRuleContext {
        public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaratorId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableDeclaratorId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableDeclaratorId(this);
        }
    }

    public static class VariableInitializerContext extends ParserRuleContext {
        public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableInitializer(this);
        }
    }

    public static class ArrayInitializerContext extends ParserRuleContext {
        public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<VariableInitializerContext> variableInitializer() {
            return getRuleContexts(VariableInitializerContext.class);
        }

        public VariableInitializerContext variableInitializer(int i) {
            return getRuleContext(VariableInitializerContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterArrayInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitArrayInitializer(this);
        }
    }

    public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
        public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(JavaParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }

        public List<TypeArgumentsContext> typeArguments() {
            return getRuleContexts(TypeArgumentsContext.class);
        }

        public TypeArgumentsContext typeArguments(int i) {
            return getRuleContext(TypeArgumentsContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classOrInterfaceType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassOrInterfaceType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassOrInterfaceType(this);
        }
    }

    public static class TypeArgumentContext extends ParserRuleContext {
        public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public TerminalNode EXTENDS() {
            return getToken(JavaParser.EXTENDS, 0);
        }

        public TerminalNode SUPER() {
            return getToken(JavaParser.SUPER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeArgument;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeArgument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeArgument(this);
        }
    }

    public static class QualifiedNameListContext extends ParserRuleContext {
        public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<QualifiedNameContext> qualifiedName() {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i) {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedNameList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterQualifiedNameList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitQualifiedNameList(this);
        }
    }

    public static class FormalParametersContext extends ParserRuleContext {
        public FormalParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFormalParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFormalParameters(this);
        }
    }

    public static class FormalParameterListContext extends ParserRuleContext {
        public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }

        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class, i);
        }

        public LastFormalParameterContext lastFormalParameter() {
            return getRuleContext(LastFormalParameterContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameterList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFormalParameterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFormalParameterList(this);
        }
    }

    public static class FormalParameterContext extends ParserRuleContext {
        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFormalParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFormalParameter(this);
        }
    }

    public static class LastFormalParameterContext extends ParserRuleContext {
        public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lastFormalParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLastFormalParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLastFormalParameter(this);
        }
    }

    public static class QualifiedNameContext extends ParserRuleContext {
        public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(JavaParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterQualifiedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitQualifiedName(this);
        }
    }

    public static class LiteralContext extends ParserRuleContext {
        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IntegerLiteralContext integerLiteral() {
            return getRuleContext(IntegerLiteralContext.class, 0);
        }

        public FloatLiteralContext floatLiteral() {
            return getRuleContext(FloatLiteralContext.class, 0);
        }

        public TerminalNode CHAR_LITERAL() {
            return getToken(JavaParser.CHAR_LITERAL, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(JavaParser.STRING_LITERAL, 0);
        }

        public TerminalNode BOOL_LITERAL() {
            return getToken(JavaParser.BOOL_LITERAL, 0);
        }

        public TerminalNode NULL_LITERAL() {
            return getToken(JavaParser.NULL_LITERAL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLiteral(this);
        }
    }

    public static class IntegerLiteralContext extends ParserRuleContext {
        public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(JavaParser.DECIMAL_LITERAL, 0);
        }

        public TerminalNode HEX_LITERAL() {
            return getToken(JavaParser.HEX_LITERAL, 0);
        }

        public TerminalNode OCT_LITERAL() {
            return getToken(JavaParser.OCT_LITERAL, 0);
        }

        public TerminalNode BINARY_LITERAL() {
            return getToken(JavaParser.BINARY_LITERAL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_integerLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterIntegerLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitIntegerLiteral(this);
        }
    }

    public static class FloatLiteralContext extends ParserRuleContext {
        public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FLOAT_LITERAL() {
            return getToken(JavaParser.FLOAT_LITERAL, 0);
        }

        public TerminalNode HEX_FLOAT_LITERAL() {
            return getToken(JavaParser.HEX_FLOAT_LITERAL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_floatLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFloatLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFloatLiteral(this);
        }
    }

    public static class AnnotationContext extends ParserRuleContext {
        public AnnotationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public ElementValuePairsContext elementValuePairs() {
            return getRuleContext(ElementValuePairsContext.class, 0);
        }

        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterAnnotation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitAnnotation(this);
        }
    }

    public static class ElementValuePairsContext extends ParserRuleContext {
        public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ElementValuePairContext> elementValuePair() {
            return getRuleContexts(ElementValuePairContext.class);
        }

        public ElementValuePairContext elementValuePair(int i) {
            return getRuleContext(ElementValuePairContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValuePairs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterElementValuePairs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitElementValuePairs(this);
        }
    }

    public static class ElementValuePairContext extends ParserRuleContext {
        public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValuePair;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterElementValuePair(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitElementValuePair(this);
        }
    }

    public static class ElementValueContext extends ParserRuleContext {
        public ElementValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        public ElementValueArrayInitializerContext elementValueArrayInitializer() {
            return getRuleContext(ElementValueArrayInitializerContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterElementValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitElementValue(this);
        }
    }

    public static class ElementValueArrayInitializerContext extends ParserRuleContext {
        public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ElementValueContext> elementValue() {
            return getRuleContexts(ElementValueContext.class);
        }

        public ElementValueContext elementValue(int i) {
            return getRuleContext(ElementValueContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValueArrayInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterElementValueArrayInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitElementValueArrayInitializer(this);
        }
    }

    public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
        public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INTERFACE() {
            return getToken(JavaParser.INTERFACE, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public AnnotationTypeBodyContext annotationTypeBody() {
            return getRuleContext(AnnotationTypeBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterAnnotationTypeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitAnnotationTypeDeclaration(this);
        }
    }

    public static class AnnotationTypeBodyContext extends ParserRuleContext {
        public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
            return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
        }

        public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
            return getRuleContext(AnnotationTypeElementDeclarationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterAnnotationTypeBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitAnnotationTypeBody(this);
        }
    }

    public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
        public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AnnotationTypeElementRestContext annotationTypeElementRest() {
            return getRuleContext(AnnotationTypeElementRestContext.class, 0);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeElementDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterAnnotationTypeElementDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitAnnotationTypeElementDeclaration(this);
        }
    }

    public static class AnnotationTypeElementRestContext extends ParserRuleContext {
        public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
            return getRuleContext(AnnotationMethodOrConstantRestContext.class, 0);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeElementRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterAnnotationTypeElementRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitAnnotationTypeElementRest(this);
        }
    }

    public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
        public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AnnotationMethodRestContext annotationMethodRest() {
            return getRuleContext(AnnotationMethodRestContext.class, 0);
        }

        public AnnotationConstantRestContext annotationConstantRest() {
            return getRuleContext(AnnotationConstantRestContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationMethodOrConstantRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterAnnotationMethodOrConstantRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitAnnotationMethodOrConstantRest(this);
        }
    }

    public static class AnnotationMethodRestContext extends ParserRuleContext {
        public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public DefaultValueContext defaultValue() {
            return getRuleContext(DefaultValueContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationMethodRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterAnnotationMethodRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitAnnotationMethodRest(this);
        }
    }

    public static class AnnotationConstantRestContext extends ParserRuleContext {
        public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationConstantRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterAnnotationConstantRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitAnnotationConstantRest(this);
        }
    }

    public static class DefaultValueContext extends ParserRuleContext {
        public DefaultValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DEFAULT() {
            return getToken(JavaParser.DEFAULT, 0);
        }

        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defaultValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterDefaultValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitDefaultValue(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }

        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitBlock(this);
        }
    }

    public static class BlockStatementContext extends ParserRuleContext {
        public BlockStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public LocalTypeDeclarationContext localTypeDeclaration() {
            return getRuleContext(LocalTypeDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_blockStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterBlockStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitBlockStatement(this);
        }
    }

    public static class LocalVariableDeclarationContext extends ParserRuleContext {
        public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_localVariableDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterLocalVariableDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitLocalVariableDeclaration(this);
        }
    }

    public static class LocalTypeDeclarationContext extends ParserRuleContext {
        public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
            return getRuleContexts(ClassOrInterfaceModifierContext.class);
        }

        public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
            return getRuleContext(ClassOrInterfaceModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_localTypeDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLocalTypeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLocalTypeDeclaration(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public BlockContext blockLabel;
        public ExpressionContext statementExpression;
        public Token identifierLabel;

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode ASSERT() {
            return getToken(JavaParser.ASSERT, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode IF() {
            return getToken(JavaParser.IF, 0);
        }

        public ParExpressionContext parExpression() {
            return getRuleContext(ParExpressionContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(JavaParser.ELSE, 0);
        }

        public TerminalNode FOR() {
            return getToken(JavaParser.FOR, 0);
        }

        public ForControlContext forControl() {
            return getRuleContext(ForControlContext.class, 0);
        }

        public TerminalNode WHILE() {
            return getToken(JavaParser.WHILE, 0);
        }

        public TerminalNode DO() {
            return getToken(JavaParser.DO, 0);
        }

        public TerminalNode TRY() {
            return getToken(JavaParser.TRY, 0);
        }

        public FinallyBlockContext finallyBlock() {
            return getRuleContext(FinallyBlockContext.class, 0);
        }

        public List<CatchClauseContext> catchClause() {
            return getRuleContexts(CatchClauseContext.class);
        }

        public CatchClauseContext catchClause(int i) {
            return getRuleContext(CatchClauseContext.class, i);
        }

        public ResourceSpecificationContext resourceSpecification() {
            return getRuleContext(ResourceSpecificationContext.class, 0);
        }

        public TerminalNode SWITCH() {
            return getToken(JavaParser.SWITCH, 0);
        }

        public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
            return getRuleContexts(SwitchBlockStatementGroupContext.class);
        }

        public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
            return getRuleContext(SwitchBlockStatementGroupContext.class, i);
        }

        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }

        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class, i);
        }

        public TerminalNode SYNCHRONIZED() {
            return getToken(JavaParser.SYNCHRONIZED, 0);
        }

        public TerminalNode RETURN() {
            return getToken(JavaParser.RETURN, 0);
        }

        public TerminalNode THROW() {
            return getToken(JavaParser.THROW, 0);
        }

        public TerminalNode BREAK() {
            return getToken(JavaParser.BREAK, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public TerminalNode CONTINUE() {
            return getToken(JavaParser.CONTINUE, 0);
        }

        public TerminalNode SEMI() {
            return getToken(JavaParser.SEMI, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitStatement(this);
        }
    }

    public static class CatchClauseContext extends ParserRuleContext {
        public CatchClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CATCH() {
            return getToken(JavaParser.CATCH, 0);
        }

        public CatchTypeContext catchType() {
            return getRuleContext(CatchTypeContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_catchClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCatchClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCatchClause(this);
        }
    }

    public static class CatchTypeContext extends ParserRuleContext {
        public CatchTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<QualifiedNameContext> qualifiedName() {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i) {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_catchType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCatchType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCatchType(this);
        }
    }

    public static class FinallyBlockContext extends ParserRuleContext {
        public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FINALLY() {
            return getToken(JavaParser.FINALLY, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_finallyBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFinallyBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFinallyBlock(this);
        }
    }

    public static class ResourceSpecificationContext extends ParserRuleContext {
        public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ResourcesContext resources() {
            return getRuleContext(ResourcesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resourceSpecification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterResourceSpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitResourceSpecification(this);
        }
    }

    public static class ResourcesContext extends ParserRuleContext {
        public ResourcesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ResourceContext> resource() {
            return getRuleContexts(ResourceContext.class);
        }

        public ResourceContext resource(int i) {
            return getRuleContext(ResourceContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resources;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterResources(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitResources(this);
        }
    }

    public static class ResourceContext extends ParserRuleContext {
        public ResourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resource;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitResource(this);
        }
    }

    public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
        public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }

        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class, i);
        }

        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }

        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switchBlockStatementGroup;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterSwitchBlockStatementGroup(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitSwitchBlockStatementGroup(this);
        }
    }

    public static class SwitchLabelContext extends ParserRuleContext {
        public ExpressionContext constantExpression;
        public Token enumConstantName;

        public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CASE() {
            return getToken(JavaParser.CASE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public TerminalNode DEFAULT() {
            return getToken(JavaParser.DEFAULT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switchLabel;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterSwitchLabel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitSwitchLabel(this);
        }
    }

    public static class ForControlContext extends ParserRuleContext {
        public ExpressionListContext forUpdate;

        public ForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public EnhancedForControlContext enhancedForControl() {
            return getRuleContext(EnhancedForControlContext.class, 0);
        }

        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forControl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterForControl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitForControl(this);
        }
    }

    public static class ForInitContext extends ParserRuleContext {
        public ForInitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forInit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterForInit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitForInit(this);
        }
    }

    public static class EnhancedForControlContext extends ParserRuleContext {
        public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enhancedForControl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnhancedForControl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnhancedForControl(this);
        }
    }

    public static class ParExpressionContext extends ParserRuleContext {
        public ParExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterParExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitParExpression(this);
        }
    }

    public static class ExpressionListContext extends ParserRuleContext {
        public ExpressionListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterExpressionList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitExpressionList(this);
        }
    }

    public static class MethodCallContext extends ParserRuleContext {
        public MethodCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode THIS() {
            return getToken(JavaParser.THIS, 0);
        }

        public TerminalNode SUPER() {
            return getToken(JavaParser.SUPER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMethodCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMethodCall(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public Token prefix;
        public Token bop;
        public Token postfix;

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class, 0);
        }

        public MethodCallContext methodCall() {
            return getRuleContext(MethodCallContext.class, 0);
        }

        public TerminalNode NEW() {
            return getToken(JavaParser.NEW, 0);
        }

        public CreatorContext creator() {
            return getRuleContext(CreatorContext.class, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public LambdaExpressionContext lambdaExpression() {
            return getRuleContext(LambdaExpressionContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class, 0);
        }

        public ClassTypeContext classType() {
            return getRuleContext(ClassTypeContext.class, 0);
        }

        public AwaitExpressionContext awaitExpression() {
            return getRuleContext(AwaitExpressionContext.class, 0);
        }

        public TerminalNode THIS() {
            return getToken(JavaParser.THIS, 0);
        }

        public InnerCreatorContext innerCreator() {
            return getRuleContext(InnerCreatorContext.class, 0);
        }

        public TerminalNode SUPER() {
            return getToken(JavaParser.SUPER, 0);
        }

        public SuperSuffixContext superSuffix() {
            return getRuleContext(SuperSuffixContext.class, 0);
        }

        public ExplicitGenericInvocationContext explicitGenericInvocation() {
            return getRuleContext(ExplicitGenericInvocationContext.class, 0);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public TerminalNode INSTANCEOF() {
            return getToken(JavaParser.INSTANCEOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitExpression(this);
        }
    }

    public static class AwaitExpressionContext extends ParserRuleContext {
        public AwaitExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode AWAIT() {
            return getToken(JavaParser.AWAIT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_awaitExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterAwaitExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitAwaitExpression(this);
        }
    }

    public static class LambdaExpressionContext extends ParserRuleContext {
        public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public LambdaParametersContext lambdaParameters() {
            return getRuleContext(LambdaParametersContext.class, 0);
        }

        public LambdaBodyContext lambdaBody() {
            return getRuleContext(LambdaBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lambdaExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLambdaExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLambdaExpression(this);
        }
    }

    public static class LambdaParametersContext extends ParserRuleContext {
        public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(JavaParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }

        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lambdaParameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLambdaParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLambdaParameters(this);
        }
    }

    public static class LambdaBodyContext extends ParserRuleContext {
        public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lambdaBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLambdaBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLambdaBody(this);
        }
    }

    public static class PrimaryContext extends ParserRuleContext {
        public PrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode THIS() {
            return getToken(JavaParser.THIS, 0);
        }

        public TerminalNode SUPER() {
            return getToken(JavaParser.SUPER, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public TypeTypeOrVoidContext typeTypeOrVoid() {
            return getRuleContext(TypeTypeOrVoidContext.class, 0);
        }

        public TerminalNode CLASS() {
            return getToken(JavaParser.CLASS, 0);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
            return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterPrimary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitPrimary(this);
        }
    }

    public static class ClassTypeContext extends ParserRuleContext {
        public ClassTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassType(this);
        }
    }

    public static class CreatorContext extends ParserRuleContext {
        public CreatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public CreatedNameContext createdName() {
            return getRuleContext(CreatedNameContext.class, 0);
        }

        public ClassCreatorRestContext classCreatorRest() {
            return getRuleContext(ClassCreatorRestContext.class, 0);
        }

        public ArrayCreatorRestContext arrayCreatorRest() {
            return getRuleContext(ArrayCreatorRestContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_creator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCreator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCreator(this);
        }
    }

    public static class CreatedNameContext extends ParserRuleContext {
        public CreatedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(JavaParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }

        public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
            return getRuleContexts(TypeArgumentsOrDiamondContext.class);
        }

        public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
            return getRuleContext(TypeArgumentsOrDiamondContext.class, i);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createdName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCreatedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCreatedName(this);
        }
    }

    public static class InnerCreatorContext extends ParserRuleContext {
        public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public ClassCreatorRestContext classCreatorRest() {
            return getRuleContext(ClassCreatorRestContext.class, 0);
        }

        public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
            return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_innerCreator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterInnerCreator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitInnerCreator(this);
        }
    }

    public static class ArrayCreatorRestContext extends ParserRuleContext {
        public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayCreatorRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterArrayCreatorRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitArrayCreatorRest(this);
        }
    }

    public static class ClassCreatorRestContext extends ParserRuleContext {
        public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classCreatorRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassCreatorRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassCreatorRest(this);
        }
    }

    public static class ExplicitGenericInvocationContext extends ParserRuleContext {
        public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
            return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_explicitGenericInvocation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterExplicitGenericInvocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitExplicitGenericInvocation(this);
        }
    }

    public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
        public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeArgumentsOrDiamond;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterTypeArgumentsOrDiamond(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitTypeArgumentsOrDiamond(this);
        }
    }

    public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nonWildcardTypeArgumentsOrDiamond;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterNonWildcardTypeArgumentsOrDiamond(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitNonWildcardTypeArgumentsOrDiamond(this);
        }
    }

    public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nonWildcardTypeArguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterNonWildcardTypeArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitNonWildcardTypeArguments(this);
        }
    }

    public static class TypeListContext extends ParserRuleContext {
        public TypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TypeTypeContext> typeType() {
            return getRuleContexts(TypeTypeContext.class);
        }

        public TypeTypeContext typeType(int i) {
            return getRuleContext(TypeTypeContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeList(this);
        }
    }

    public static class TypeTypeContext extends ParserRuleContext {
        public TypeTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeType(this);
        }
    }

    public static class PrimitiveTypeContext extends ParserRuleContext {
        public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode BOOLEAN() {
            return getToken(JavaParser.BOOLEAN, 0);
        }

        public TerminalNode CHAR() {
            return getToken(JavaParser.CHAR, 0);
        }

        public TerminalNode BYTE() {
            return getToken(JavaParser.BYTE, 0);
        }

        public TerminalNode SHORT() {
            return getToken(JavaParser.SHORT, 0);
        }

        public TerminalNode INT() {
            return getToken(JavaParser.INT, 0);
        }

        public TerminalNode LONG() {
            return getToken(JavaParser.LONG, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(JavaParser.FLOAT, 0);
        }

        public TerminalNode DOUBLE() {
            return getToken(JavaParser.DOUBLE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primitiveType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterPrimitiveType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitPrimitiveType(this);
        }
    }

    public static class TypeArgumentsContext extends ParserRuleContext {
        public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TypeArgumentContext> typeArgument() {
            return getRuleContexts(TypeArgumentContext.class);
        }

        public TypeArgumentContext typeArgument(int i) {
            return getRuleContext(TypeArgumentContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeArguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeArguments(this);
        }
    }

    public static class SuperSuffixContext extends ParserRuleContext {
        public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_superSuffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterSuperSuffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitSuperSuffix(this);
        }
    }

    public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
        public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SUPER() {
            return getToken(JavaParser.SUPER, 0);
        }

        public SuperSuffixContext superSuffix() {
            return getRuleContext(SuperSuffixContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(JavaParser.IDENTIFIER, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_explicitGenericInvocationSuffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).enterExplicitGenericInvocationSuffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener)
                ((JavaParserListener) listener).exitExplicitGenericInvocationSuffix(this);
        }
    }

    public static class ArgumentsContext extends ParserRuleContext {
        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitArguments(this);
        }
    }
}