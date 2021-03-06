/*
 * MIT License
 *
 * Copyright (c) 17/11/2020 16:24   David Osemwota.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */


import dependencies.BuildDependencies

plugins {
    id("commons.android-dynamic-feature")
    id("com.android.dynamic-feature")
    id("kotlin-android")
    id("kotlin-kapt")
    id(BuildPlugins.PARCELIZE_PLUGIN)
    id("kotlin-allopen")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")

}

android {
    buildFeatures.dataBinding = true
}

dependencies {

    implementation( project(BuildModules.CORE))

    implementation(BuildDependencies.KOTLIN_COROUTINES_ANDROID)
    implementation(BuildDependencies.KOTLIN_COROUTINES_CORE)
    implementation(BuildDependencies.PAGING_KTX)
    implementation(BuildDependencies.LIFECYCLE_EXTENSIONS)
    implementation(BuildDependencies.VIEWMODEL)
    implementation(BuildDependencies.SWIPE_REFRESH_LAYOUT)
    implementation(BuildDependencies.LIFECYCLE_EXTENSIONS)
    implementation(BuildDependencies.DAGGER_HILT)

    kapt(BuildDependencies.HILT_VIEWMODEL_KAPT)
    kapt(BuildDependencies.DAGGER_HILT_KAPT)

}