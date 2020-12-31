package com.github.kieran1494.autohotkey.services

import com.intellij.openapi.project.Project
import com.github.kieran1494.autohotkey.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
