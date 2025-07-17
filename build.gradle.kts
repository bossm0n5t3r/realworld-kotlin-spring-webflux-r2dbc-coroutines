plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.plugin.spring)
    alias(libs.plugins.springframework.boot)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.ktlint)
}

group = "me.bossm0n5t3r"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion =
            JavaLanguageVersion.of(
                libs.versions.jdk.version
                    .get(),
            )
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.sentry.bom))
    implementation(platform(libs.spring.cloud.dependencies))

    implementation(libs.bundles.spring.boot.starters)
    implementation(libs.jackson.module.kotlin)
    implementation(libs.reactor.kotlin.extensions)
    implementation(libs.sentry.spring.boot.starter.jakarta)

    implementation(libs.kotlin.reflect)
    implementation(libs.kotlinx.coroutines.reactor)
    implementation(libs.spring.cloud.stream)

    developmentOnly(libs.spring.boot.docker.compose)

    runtimeOnly(libs.postgresql)
    runtimeOnly(libs.r2dbc.postgresql)

    testImplementation(libs.bundles.test.implementations)
    testRuntimeOnly(libs.junit.platform.launcher)

    implementation("io.netty:netty-resolver-dns-native-macos:${libs.versions.netty.resolver.dns.native.macos.version.get()}:osx-aarch_64")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

ktlint {
    version.set(
        libs.versions.ktlint.version
            .get(),
    )
}
