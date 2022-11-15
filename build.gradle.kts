plugins {
    kotlin("jvm") version "1.5.21"
    id("org.springframework.boot") version "2.4.1"
    id("org.jmailen.kotlinter") version "3.3.0"
    kotlin("kapt") version "1.4.20"
    application
}

java.sourceCompatibility = JavaVersion.VERSION_11

group = "com.moneycare"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies{
    implementation("org.springframework.cloud:spring-cloud-config-server:3.1.4")
    implementation("org.springframework.boot:spring-boot-autoconfigure:2.7.5")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")
}