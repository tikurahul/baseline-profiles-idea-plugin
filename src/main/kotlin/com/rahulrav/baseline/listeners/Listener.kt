package com.rahulrav.baseline.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.rahulrav.baseline.services.ProjectService

internal class Listener : ProjectManagerListener {
  override fun projectOpened(project: Project) {
    project.service<ProjectService>()
  }
}
