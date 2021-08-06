package com.rahulrav.baseline.psi

import com.intellij.psi.tree.IElementType
import com.rahulrav.baseline.Language

class Token(private val name: String) : IElementType(name, Language.instance)
