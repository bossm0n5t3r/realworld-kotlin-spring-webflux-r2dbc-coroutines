plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.plugin.spring)
    alias(libs.plugins.springframework.boot)
    alias(libs.plugins.spring.dependency.management)
}

dependencies {
    // Depend on the core module
    implementation(project(":realworld-core"))

    implementation(platform(libs.sentry.bom))
    implementation(platform(libs.spring.cloud.dependencies))

    // Spring Boot starters
    implementation(libs.bundles.spring.boot.starters)
    implementation(libs.sentry.spring.boot.starter.jakarta)
    implementation(libs.spring.cloud.stream)

    // Development tools
    developmentOnly(libs.spring.boot.docker.compose)

    // Netty resolver for macOS
    implementation("io.netty:netty-resolver-dns-native-macos:${libs.versions.netty.resolver.dns.native.macos.version.get()}:osx-aarch_64")

    // Test dependencies
    testImplementation(libs.bundles.test.implementations)
    testRuntimeOnly(libs.junit.platform.launcher)
}
