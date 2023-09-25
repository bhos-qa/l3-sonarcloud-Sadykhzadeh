plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.sonarqube") version "4.3.1.3277"
}

group = "one.azer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}

sonar {
    properties {
        property("sonar.projectKey", "bhos-qa_l3-sonarcloud-Sadykhzadeh")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}