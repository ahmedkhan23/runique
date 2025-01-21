import com.android.build.api.dsl.LibraryExtension
import com.android.builder.model.v2.ide.Library
import com.runique.convention.ExtensionType
import com.runique.convention.configureBuildTypes
import com.runique.convention.configureKotlinAndroid
import com.runique.convention.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJvm()
        }
    }
}