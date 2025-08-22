plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
}

android {
	namespace = "com.example.searchbarapp"
	compileSdk = 35

	defaultConfig {
		applicationId = "com.example.searchbarapp"
		minSdk = 24
		targetSdk = 35
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}

	kotlin {
		jvmToolchain(17)
	}

	buildFeatures {
		compose = true
	}

	composeOptions {
		kotlinCompilerExtensionVersion = "1.6.11"
	}

	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {
	implementation(platform("androidx.compose:compose-bom:2024.10.01"))
	implementation("androidx.core:core-ktx:1.13.1")
	implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")
	implementation("androidx.activity:activity-compose:1.9.3")
	implementation("androidx.compose.material3:material3")
	implementation("androidx.compose.ui:ui")
	implementation("androidx.compose.ui:ui-tooling-preview")

	debugImplementation("androidx.compose.ui:ui-tooling")
	debugImplementation("androidx.compose.ui:ui-test-manifest")

	testImplementation("junit:junit:4.13.2")
	androidTestImplementation(platform("androidx.compose:compose-bom:2024.10.01"))
	androidTestImplementation("androidx.test.ext:junit:1.2.1")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
	androidTestImplementation("androidx.compose.ui:ui-test-junit4")
}