repositories {
    mavenCentral()
//    maven("https://repo.rapture.pw/repository/maven-releases/")
//    maven("https://repo.infernalsuite.com/repository/maven-snapshots/")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(project(":api"))
    compileOnly("io.papermc.paper:paper-api:${rootProject.properties["paper_version"]}")
    compileOnly(files("${rootProject.rootDir}/libs/flow-nbt-2.0.2.jar"))
    compileOnly(files("libs/api-1.20.4-R0.1-20240524.171344-26.jar"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(25)
    dependsOn(tasks.clean)
}
