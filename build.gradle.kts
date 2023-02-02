allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.register<Copy>("packageDistribution") {
        dependsOn("fatJar")
        from("${project.rootDir}/scripts/financial-definition-helper") {
            expand("path" to "lib/${project.name}-${project.version}-standalone.jar $@")
        }
        from("${project.projectDir}/build/libs/${project.name}-${project.version}-standalone.jar")
        {
            into("lib")
        }
        into("${project.rootDir}/dist")
    }
}
