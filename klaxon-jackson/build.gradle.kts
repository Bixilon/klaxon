buildscript {
    repositories {
        jcenter()
        mavenCentral()
        maven { setUrl("https://plugins.gradle.org/m2") }
    }
}

plugins {
    java
//    kotlin("jvm") version "1.3.50"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":klaxon"))
    implementation("com.fasterxml.jackson.core:jackson-databind:2.9.6")
}
