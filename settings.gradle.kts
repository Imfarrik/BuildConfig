pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BusinessAsakabank"

include(":app")
include(":core:data")
include(":core:network")
include(":core:domain")
include(":core:database")
include(":core:ui")
include(":core:design-system")

include(":feature:login")
include(":feature:main")
include(":feature:home")
