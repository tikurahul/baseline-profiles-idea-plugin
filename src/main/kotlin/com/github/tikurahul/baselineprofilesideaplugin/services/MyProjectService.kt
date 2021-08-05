package com.github.tikurahul.baselineprofilesideaplugin.services

import com.github.tikurahul.baselineprofilesideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
