plugins {
    id("com.android.application")
    kotlin("android")
}

val composeVersion = "1.1.1"

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.jetbrains.simplelogin.androidapp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }

}

dependencies {
    implementation(project(":shared"))

    implementation("androidx.compose.foundation:foundation:$composeVersion")
    implementation("androidx.compose.runtime:runtime:$composeVersion")
    // UI
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    // Material Design
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.material:material-icons-core:$composeVersion")
    // Activity
    implementation("androidx.activity:activity-compose:1.5.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    // viewmodel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.0")
}