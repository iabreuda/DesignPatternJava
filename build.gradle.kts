plugins {
    id("java")
}

group = "com.iabreuda"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    compileOnly("org.projectlombok:lombok:1.18.24")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}