# SearchBarApp

A minimal Android app using Jetpack Compose and Material3 that shows a SearchBar allowing user input and displays mock results.

## Open and run (Android Studio recommended)

1. Open this folder in Android Studio (Hedgehog+).
2. Let it sync Gradle and download SDKs when prompted.
3. Run the `app` configuration on an emulator or device.

## Command line (if you have Android SDK + Gradle wrapper)

This repo does not include the Gradle wrapper JAR. Generate it locally or let Android Studio create it.

- Generate wrapper (requires Gradle installed):
  - `gradle wrapper --gradle-version 8.7`
- Then build:
  - `./gradlew assembleDebug`

## Tech
- Kotlin 2.0.21
- Compose BOM 2024.10.01, Material3 SearchBar
- compileSdk 35, minSdk 24

## Code entry points
- `app/src/main/java/com/example/searchbarapp/MainActivity.kt`
- `app/src/main/AndroidManifest.xml`
