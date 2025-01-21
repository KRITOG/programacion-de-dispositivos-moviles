pluginManagement {
    repositories {
        google() // Repositorio de Google necesario para Hilt
        mavenCentral() // Maven Central
        gradlePluginPortal() // Plugins de Gradle
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MovieTime"
include(":app")
