package com.rahulrav.baseline.lexer

import com.intellij.lexer.FlexAdapter
import com.rahulrav.baseline.Lexer

/**
 * A Lexer adapter for the [Lexer].
 */
class LexerAdapter : FlexAdapter(Lexer()) {
}
