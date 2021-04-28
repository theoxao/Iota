plugins {
    java
    kotlin("jvm")
}

group = "me.theo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":base"))
    implementation(project(":handler-groovy"))
    implementation(kotlin("stdlib"))
    implementation("org.antlr:antlr4-runtime:4.6")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}