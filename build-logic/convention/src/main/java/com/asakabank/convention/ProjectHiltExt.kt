package com.asakabank.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidHilt(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    if (commonExtension is ApplicationExtension) {
        pluginManager.apply(libs.findPlugin("dagger-hilt-android").get().get().pluginId)
    }

    pluginManager.apply(libs.findPlugin("ksp").get().get().pluginId)

    dependencies {
        add("implementation", libs.findLibrary("dagger-hilt-android").get())
        add("ksp", libs.findLibrary("dagger-hilt-compiler").get())
    }
}