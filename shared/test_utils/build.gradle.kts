
import dependencies.TestDependencies

plugins {
    id(BuildPlugins.ANDROID_LIBRARY)
    kotlin(BuildPlugins.KOTLIN_ANDROID)
    kotlin(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)
}

android {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)
    buildToolsVersion(BuildAndroidConfig.BUILD_TOOLS_VERSION)

    defaultConfig {
        minSdkVersion(BuildAndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(BuildAndroidConfig.TARGET_SDK_VERSION)
        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME

        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }


    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    implementation(TestDependencies.COROUTINE_TEST)
    implementation(TestDependencies.JUNIT5_API)
    implementation(TestDependencies.JUNIT_PLATFORM)
    implementation(TestDependencies.JUNIT_VINTAGE)

    runtimeOnly(TestDependencies.JUNIT5_ENGINE)
}