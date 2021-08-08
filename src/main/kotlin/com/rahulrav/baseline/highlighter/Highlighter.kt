package com.rahulrav.baseline.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.rahulrav.baseline.lexer.LexerAdapter
import com.rahulrav.baseline.psi.TokenTypes

class Highlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return LexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            TokenTypes.WILDCARD, TokenTypes.LT, TokenTypes.GT -> arrayOf(KEYWORD)
            TokenTypes.LP, TokenTypes.RP -> arrayOf(BRACES)
            TokenTypes.SEMI -> arrayOf(SEMICOLON)
            TokenTypes.AP -> arrayOf(BRACKETS)
            TokenTypes.COMMA -> arrayOf(COMMA)
            else -> EMPTY
        }
    }

    companion object {
        private val EMPTY = arrayOf<TextAttributesKey>()
    }
}
