package com.rahulrav.baseline.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.rahulrav.baseline.Language
import com.rahulrav.baseline.Parser
import com.rahulrav.baseline.lexer.LexerAdapter
import com.rahulrav.baseline.psi.File
import com.rahulrav.baseline.psi.TokenTypes

/**
 * The parser definition for baseline profiles.
 */
class ParserDef : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return LexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return Parser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return TokenTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return File(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet {
        return SPACES
    }

    override fun spaceExistenceTypeBetweenTokens(
        left: ASTNode?,
        right: ASTNode?
    ): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        private val SPACES = TokenSet.create(TokenTypes.SPACE)
        private val COMMENTS = TokenSet.create(TokenTypes.COMMENT_STMT)
        private val FILE = IFileElementType(Language.instance)
    }
}
