package com.kananagila_software_solution.starterproject.buildSrc

object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinKapt = "kotlin-kapt"
    const val daggerHilt = "dagger.hilt.android.plugin"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.1.0"
    const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.1.5"

    const val junit = "junit:junit:4.13.2" // DEFAULT

    const val gson = "com.google.code.gson:gson:2.8.8"

    const val material = "com.google.android.material:material:1.3.0"

    object Accompanist {
        const val version = "0.23.0"
        const val permissions = "com.google.accompanist:accompanist-permissions:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.4.1"
        const val coreKtx = "androidx.core:core-ktx:1.7.0" // DEFAULT
        const val splashScreen = "androidx.core:core-splashscreen:1.0.0-beta01"

        object Activity {
            private const val version = "1.4.0"
            const val activityCompose = "androidx.activity:activity-compose:$version"
        }

        object Compose {
            private const val snapshot = ""
            const val version = "1.1.0"

            @get:JvmStatic
            val snapshotUrl: String
                get() = "https://androidx.dev/snapshots/builds/$snapshot/artifacts/repository/"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val material = "androidx.compose.material:material:$version" // DEFAULT
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version" // DEFAULT
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version" // DEFAULT
            const val test = "androidx.compose.test:test-core:$version"
            const val ui = "androidx.compose.ui:ui:$version" // DEFAULT
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version" // DEFAULT
        }

        object DataStore {
            private const val version = "1.0.0"
            const val preferences = "androidx.datastore:datastore-preferences:$version"
        }

        object Hilt {
            private const val version = "1.0.0"
            const val compiler = "androidx.hilt:hilt-compiler:$version"
            const val lifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$version-alpha01"
            const val navigation = "androidx.hilt:hilt-navigation-compose:$version"
        }

        object Lifecycle {
            private const val version = "2.4.0"
            const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$version" // DEFAULT
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
        }

        object Navigation {
            private const val version = "2.4.0"
            const val compose = "androidx.navigation:navigation-compose:$version"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Room {
            private const val version = "2.4.1"
            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }

    object Coroutines {
        private const val version = "1.6.0"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Coil{
        private const val version = "1.3.2"
        const val coilCompose = "io.coil-kt:coil-compose:$version"
    }

    object Dagger {
        private const val version = "2.38.1"
        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-android-compiler:$version"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Kotlin {
        private const val version = "1.6.10"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object  KotlinX {
        private const val version = "1.3.2"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
    }

    object OkHttp {
        private const val version = "5.0.0-alpha.2"
        const val okHttp = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$version"
    }
}

object Versions {
    const val ktlint = "0.43.2"
}