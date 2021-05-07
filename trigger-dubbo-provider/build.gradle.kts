plugins {
    java
    kotlin("jvm")
}

group = "com.theoxao"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("org.apache.dubbo:dubbo-spring-boot-starter:2.7.9")
    //fix NoClassDefFoundError: org/apache/curator/framework/CuratorFrameworkFactory
    implementation("org.apache.curator:curator-framework:5.1.0")
    implementation("org.apache.curator:curator-recipes:5.1.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}