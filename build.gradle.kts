plugins {
    kotlin("jvm") version "2.4.0"
}

val junitVersion = "6.1.2"
val javaVersion = 21

description = "Workshop for JUnit 6 and Kotlin"
group = "com.oleynik.qa.workshop"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(platform("org.junit:junit-bom:$junitVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    jvmToolchain(javaVersion)
}

tasks.test {
    useJUnitPlatform()
}
