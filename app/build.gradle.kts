plugins {
    id("com.android.application")

}

android {
    namespace = "com.AdeebTechLab.BsISClass"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.AdeebTechLab.BsISClass"
        minSdk = 28
        targetSdk = 35
        versionCode = 28
        versionName = "0.2.8"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.android.car.ui:car-ui-lib:2.5.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.27")
    implementation("com.onesignal:OneSignal:[5.0.0, 5.99.99]")




}