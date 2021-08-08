package com.rahulrav.baseline.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement
import com.rahulrav.baseline.psi.*

/**
 * An annotator for Baseline profiles.
 */
class Annotator : com.intellij.lang.annotation.Annotator {
    override fun annotate(psiElement: PsiElement, holder: AnnotationHolder) {
        if (psiElement is BCommentStmt) {
            psiElement.annotation(holder, LINE_COMMENT)
        } else if (psiElement is BClassStmt) {
            val classRule = psiElement.classRule
            classRule.annotation(holder)
        } else if (psiElement is BMethodStmt) {
            psiElement.flags.annotation(holder, KEYWORD)
            psiElement.methodClassRule.annotation(holder)
            psiElement.methodName.annotation(holder, STATIC_METHOD)
            psiElement.argumentRule.annotation(holder)
            psiElement.returnType?.annotation(holder)
        }
    }

    private fun BClassRule.annotation(holder: AnnotationHolder) {
        basicClassRule?.annotation(holder)
        classPrefix?.annotation(holder)
        pathComponent?.annotation(holder)
        matchAll?.annotation(holder)
    }

    private fun BMethodClassRule.annotation(holder: AnnotationHolder) {
        classPrefix?.annotation(holder)
        matchAll?.annotation(holder)
        pathComponent?.annotation(holder)
        arrow?.annotation(holder)
    }

    private fun BBasicClassRule.annotation(holder: AnnotationHolder) {
        val prefix = classPrefix
        prefix.annotation(holder)
        val components = pathComponent
        components.annotation(holder, STATIC_FIELD)
    }

    private fun BArgumentRule.annotation(holder: AnnotationHolder) {
        matchAllArgs?.annotation(holder, KEYWORD)
        matchNoArgs?.annotation(holder, KEYWORD)
        typeList.forEach { it.annotation(holder) }
    }

    private fun BReturnType.annotation(holder: AnnotationHolder) {
        matchAll?.annotation(holder, KEYWORD)
        type?.annotation(holder)
    }

    private fun BPathComponent.annotation(holder: AnnotationHolder) {
        annotation(holder, STATIC_FIELD)
    }

    private fun BMatchAll.annotation(holder: AnnotationHolder) {
        annotation(holder, KEYWORD)
    }

    private fun BClassPrefix.annotation(holder: AnnotationHolder) {
        annotation(holder, KEYWORD)
    }

    private fun BArrow.annotation(holder: AnnotationHolder) {
        annotation(holder, KEYWORD)
    }

    private fun BType.annotation(holder: AnnotationHolder) {
        primitives?.annotation(holder)
        arrayRule?.annotation(holder)
        basicClassRule?.annotation(holder)
    }

    private fun BPrimitives.annotation(holder: AnnotationHolder) {
        annotation(holder, KEYWORD)
    }

    private fun BArrayRule.annotation(holder: AnnotationHolder) {
        primitives?.annotation(holder)
        basicClassRule?.annotation(holder)
    }

    private fun PsiElement.annotation(
        holder: AnnotationHolder,
        color: TextAttributesKey,
        severity: HighlightSeverity = HighlightSeverity.INFORMATION,
    ) {
        holder.newSilentAnnotation(severity)
            .range(textRange)
            .textAttributes(color)
            .create()
    }
}
