import com.asakabank.convention.commonExtension
import com.asakabank.convention.configureAndroidCompose
import com.asakabank.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies


class AndroidComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            commonExtension.apply {
                configureAndroidCompose(this)
            }
            dependencies {
//                add("implementation", libs.findBundle("coil").get())
            }
        }
    }

}