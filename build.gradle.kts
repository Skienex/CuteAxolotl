plugins {
    java
    id("io.papermc.paperweight.userdev") version "1.3.8"
}

group = "com.github.skienex"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(18))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    paperDevBundle("1.19.1-R0.1-SNAPSHOT")
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
}
