package com.rahulrav.baseline.completion

import com.intellij.psi.PsiClass
import com.intellij.psi.search.searches.AllClassesSearch

class Completion(
    private val module: com.intellij.openapi.module.Module
) {
    fun findClassNames(): Collection<PsiClass> {
        return AllClassesSearch.search(module.moduleScope, module.project).findAll()
    }
}
