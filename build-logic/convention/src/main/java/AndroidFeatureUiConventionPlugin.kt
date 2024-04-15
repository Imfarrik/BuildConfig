import com.asakabank.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

class FeatureUiConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.run {
                apply("businessasakabank.android.library")
                apply("businessasakabank.android.compose")
                apply("businessasakabank.android.hilt")
            }

            dependencies {
//                add("implementation", project(":core:feature:ui"))
//                add("implementation", project(":core:feature:datastore"))
                add("implementation", libs.findLibrary("androidx-constraintlayout-compose").get())
                add("implementation", libs.findLibrary("gson").get())
//                add("implementation", libs.findLibrary("autodagger-android").get())
//                add("ksp", libs.findLibrary("autodagger-compiler").get())
            }
        }
    }

}