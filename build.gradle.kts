plugins {
    id(Plugins.gitHooks)
    id(Plugins.detekt) version PluginsVersions.detekt
    id(Plugins.ktlint) version PluginsVersions.ktlint
}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.android.tools.build:gradle:7.1.3")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    apply {
        plugin(Plugins.detekt)
        plugin(Plugins.ktlint)
    }

    detekt {
        config = rootProject.files("$rootDir/.detekt/config.yml")
    }

    tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
        reports.html.required.set(true)
        reports.txt.required.set(false)
        reports.sarif.required.set(false)
    }

    ktlint {
        debug.set(false)
        version.set(Versions.ktlint)
        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        ignoreFailures.set(false)
        enableExperimentalRules.set(true)
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
