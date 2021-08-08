package com.rahulrav.baseline.completion

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.module.ModuleUtil
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import com.rahulrav.baseline.psi.TokenTypes

class Contributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(TokenTypes.ID), CLASS_PROVIDER
        )
    }

    companion object {
        private val CLASS_PROVIDER = object : CompletionProvider<CompletionParameters>() {
            override fun addCompletions(
                parameters: CompletionParameters,
                context: ProcessingContext,
                resultSet: CompletionResultSet
            ) {
                val range = parameters.position.textRange.shiftLeft(1)
                val text = parameters.editor.document.getText(range)
                val module = ModuleUtil.findModuleForFile(parameters.originalFile)
                if (text.startsWith("L") && module != null) {
                    val completion = Completion(module)
                    completion.findClassNames().forEach { psiClass ->
                        val qualifiedName = psiClass.qualifiedName
                        if (qualifiedName != null) {
                            val descriptor = qualifiedName.replace(".", "/")
                            resultSet.addElement(LookupElementBuilder.create("$descriptor;\n"))
                        }
                    }
                }
            }
        }
    }
}
