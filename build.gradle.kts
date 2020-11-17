plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.72") apply false
}


subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    group = "com.github.tamurashingo.gyomuflow"

    repositories {
        jcenter()
    }

    val implementation by configurations

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }
}
