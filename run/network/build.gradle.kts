plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "com.runique.run.network"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.core.data)


}