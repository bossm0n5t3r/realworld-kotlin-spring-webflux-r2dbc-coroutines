plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.plugin.spring) apply false
    alias(libs.plugins.springframework.boot) apply false
    alias(libs.plugins.spring.dependency.management) apply false
    alias(libs.plugins.ktlint) apply false
}

val kotlinJvmId = libs.plugins.kotlin.jvm.get().pluginId
val ktlintId = libs.plugins.ktlint.get().pluginId
val jdkVersion = libs.versions.jdk.version.get()
val ktlintVersion = libs.versions.ktlint.version.get()

allprojects {
    group = "me.bossm0n5t3r"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    // Apply the ktlint plugin to each subproject
    apply {
        plugin(kotlinJvmId)
        plugin(ktlintId)
    }

    configure<org.gradle.api.plugins.JavaPluginExtension> {
        toolchain {
            languageVersion = JavaLanguageVersion.of(jdkVersion)
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        compilerOptions {
            freeCompilerArgs.add("-Xjsr305=strict")
        }
    }

    // Configure the ktlint extension in each subproject
    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        version.set(ktlintVersion)
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
