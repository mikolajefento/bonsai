plugins {
    alias(libs.plugins.android.application)
    kotlin("android")
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "cafe.adriel.bonsai.sample"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.get()
    }
}

dependencies {
    implementation(projects.bonsaiCore)

    implementation(libs.compose.material)
    implementation(libs.compose.material.icons)
    implementation(libs.compose.activity)
}
