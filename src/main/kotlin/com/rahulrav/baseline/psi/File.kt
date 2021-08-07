package com.rahulrav.baseline.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.rahulrav.baseline.Language

/**
 * Defines a [PsiFileBase] root for the PSI.
 */
class File(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, Language.instance) {
    override fun getFileType(): FileType {
        return com.rahulrav.baseline.FileType.instance
    }
}
