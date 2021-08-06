package com.rahulrav.baseline.services

import com.intellij.openapi.project.Project
import com.rahulrav.baseline.Bundle

class ProjectService(project: Project) {
  init {
    println(Bundle.message("projectService", project.name))
  }
}
