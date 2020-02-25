package patches.templates

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Template
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dockerCommand
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a template with id = 'SubProject_Template'
in the project with id = 'SubProject', and delete the patch script.
*/
create(RelativeId("SubProject"), Template({
    id("SubProject_Template")
    name = "template"

    steps {
        script {
            id = "RUNNER_3"
            scriptContent = "pwd"
        }
        dockerCommand {
            name = "docker ps"
            id = "RUNNER_4"
            commandType = other {
                subCommand = "ps"
            }
        }
    }
}))

