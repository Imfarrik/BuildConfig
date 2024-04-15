plugins {
    `kotlin-dsl`
}

group = "com.asakabank.businessasakabank.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
//    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
//    compileOnly(libs.ksp.gradlePlugin)
//    compileOnly(libs.room.gradlePlugin)
//    implementation(libs.truth)
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "businessasakabank.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "businessasakabank.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidCompose") {
            id = "businessasakabank.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "businessasakabank.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("featureUi") {
            id = "businessasakabank.feature.ui"
            implementationClass = "FeatureUiConventionPlugin"
        }
    }
}