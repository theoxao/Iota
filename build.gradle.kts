import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    id("maven-publish")
}

group = "com.theoxao"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "maven-publish")
    publishing {
        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/theoxao/iota")
                credentials {
                    username = "theoxao"
                    password = "111111"
                }
            }
        }
        publications {
            register("mavenJava", MavenPublication::class.java) {
                components.forEach {
                    println(it.name)
                }
//                from(components["java"])
            }
        }
    }
}

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}