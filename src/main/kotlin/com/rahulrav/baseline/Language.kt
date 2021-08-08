package com.rahulrav.baseline

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class Language : com.intellij.lang.Language("baseline") {
    companion object {
        // The icon
        val icon by lazy { IconLoader.getIcon("/icons/icon.svg", Language::class.java) }

        // The language
        @JvmField
        val instance = Language()
    }
}

class FileType : LanguageFileType(Language.instance) {
    override fun getName(): String {
        return "baseline"
    }

    override fun getDescription(): String {
        return "Android Baseline profiles"
    }

    override fun getDefaultExtension(): String {
        return "txt"
    }

    override fun getIcon(): Icon {
        return Language.icon
    }

    companion object {
        // The language
        @JvmField
        val instance = FileType()
    }
}
