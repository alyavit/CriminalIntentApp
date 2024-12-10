plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.criminalintent"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.criminalintent"
        minSdk = 29
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    // Заменить lifecycle-extensions на lifecycle-viewmodel-ktx
    //implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1") // Убедитесь, что версия актуальна
    //implementation ("androidx.lifecycle:lifecycle-extensions-ktx:2.6.1")

    // Navigation Component

        implementation("androidx.navigation:navigation-fragment-ktx:2.2.2")
        implementation("androidx.navigation:navigation-ui-ktx:2.2.2")

// Room components
        implementation("androidx.room:room-runtime:2.2.5")
    implementation(libs.androidx.lifecycle.viewmodel.android)
    kapt("androidx.room:room-compiler:2.2.5")

        implementation("androidx.room:room-ktx:2.2.5")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
        androidTestImplementation("androidx.room:room-testing:2.2.5")

// Lifecycle components
        implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
        implementation("androidx.lifecycle:lifecycle-common-java8:2.2.0")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

// Kotlin components
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.72")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5")


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


}
