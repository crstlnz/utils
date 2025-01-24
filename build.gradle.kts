// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        maven(url = "https://jitpack.io")
        mavenCentral()
    }
    dependencies {
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.jetbrainsKotlinJvm) apply false
}

subprojects {
    apply(plugin = "com.lagradost.cloudstream3.gradle")
    dependencies {
        val apk by configurations
        apk("com.lagradost:cloudstream3:pre-release")
    }
}