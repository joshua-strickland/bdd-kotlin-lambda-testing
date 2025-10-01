plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(kotlin("test"))
    // Kotlin standard library
    implementation(kotlin("stdlib"))

    implementation("io.cucumber:cucumber-java:6.11.0")

    // Cucumber for BDD - Use cucumber-java8 for lambda support
    implementation("io.cucumber:cucumber-java8:6.11.0")

    // Appium Java Client for mobile automation
    implementation("io.appium:java-client:9.5.0")

    implementation("io.cucumber:cucumber-junit:6.11.0")

    // JUnit for running the tests
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}