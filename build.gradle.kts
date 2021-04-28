import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
}

group = "me.theo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}