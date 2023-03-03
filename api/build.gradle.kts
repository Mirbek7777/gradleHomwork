plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(mapOf("path" to ":service")))
    implementation(project(mapOf("path" to ":service")))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation project (":db")
    implementation project (":service")
}



tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

