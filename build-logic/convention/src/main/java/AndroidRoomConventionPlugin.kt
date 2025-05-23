import androidx.room.gradle.RoomExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.builder.model.v2.ide.Library
import com.runique.convention.ExtensionType
import com.runique.convention.configureAndroidCompose
import com.runique.convention.configureBuildTypes
import com.runique.convention.configureKotlinAndroid
import com.runique.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidRoomConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("androidx.room")
                apply("com.google.devtools.ksp")
            }

            extensions.configure<RoomExtension>() {
                schemaDirectory("$projectDir/schemas")
            }

            dependencies {
                "implementation"(libs.findLibrary("room.runtime").get())
                "implementation"(libs.findLibrary("room.ktx").get())
                "ksp"(libs.findLibrary("room.compiler").get())
            }

        }
    }
}