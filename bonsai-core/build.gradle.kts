plugins {
    kotlin("multiplatform")
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.compose)
}

kotlin {
    jvmToolchain(17)

    sourceSets {
        androidTarget()

        val commonMain by getting {
            dependencies {
                compileOnly(compose.runtime)
                compileOnly(compose.foundation)
                compileOnly(compose.ui)
                compileOnly(compose.materialIconsExtended)
            }
        }
    }
}

android {
    compileSdk = 34
    namespace = "cafe.adriel.bonsai.core"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
