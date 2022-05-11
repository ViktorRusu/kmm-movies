plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.viktorrusu.kmmmovies.android"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

	kotlinOptions {
		jvmTarget = "1.8"
	}

	buildFeatures {
		compose = true
	}

	composeOptions {
		kotlinCompilerExtensionVersion = "1.2.0-beta01"
	}
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")

	implementation(Dependencies.AndroidX.Compose.ui)
	implementation(Dependencies.AndroidX.Compose.material)
	implementation(Dependencies.AndroidX.Compose.activity)
	implementation(Dependencies.AndroidX.Compose.navigation)
	implementation(Dependencies.AndroidX.Compose.tooling)
	debugImplementation(Dependencies.AndroidX.Compose.toolingPreview)

	implementation(Dependencies.Koin.android)
	implementation(Dependencies.Coroutines.android)
}