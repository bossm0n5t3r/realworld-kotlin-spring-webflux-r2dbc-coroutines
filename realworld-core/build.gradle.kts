plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.plugin.spring)
    alias(libs.plugins.spring.dependency.management)
}

dependencies {
    implementation(platform(libs.spring.boot.dependencies))
    implementation(platform(libs.spring.cloud.dependencies))

    implementation(libs.kotlin.reflect)
    implementation(libs.kotlinx.coroutines.reactor)
    implementation(libs.reactor.kotlin.extensions)

    // Database
    implementation(libs.spring.boot.data.r2dbc)
    runtimeOnly(libs.postgresql)
    runtimeOnly(libs.r2dbc.postgresql)

    // Jackson
    implementation(libs.jackson.module.kotlin)

    // Test dependencies
    testImplementation(libs.bundles.test.implementations)
    testRuntimeOnly(libs.junit.platform.launcher)
}
