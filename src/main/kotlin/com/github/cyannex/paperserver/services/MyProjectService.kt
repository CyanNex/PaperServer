package com.github.cyannex.paperserver.services

import com.intellij.openapi.project.Project
import com.github.cyannex.paperserver.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
