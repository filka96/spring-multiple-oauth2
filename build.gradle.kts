plugins {
    java
    id("io.spring.dependency-management").version("1.0.6.RELEASE")
    id("org.springframework.boot").version("2.1.2.RELEASE")
}

group = "ru.oprosso"
version = "0.0.1"

repositories {
    mavenCentral()
}


tasks.withType(Wrapper::class.java).configureEach {
    gradleVersion = "5.2.1"
    distributionType = Wrapper.DistributionType.ALL
}


java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")

    compile("org.springframework:spring-context:5.1.8.RELEASE")

    compile("org.springframework.security.oauth:spring-security-oauth2:2.3.5.RELEASE")
    compile("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.1.4.RELEASE")
    compile("org.springframework.security:spring-security-oauth2-client:5.1.5.RELEASE")

    compileOnly("org.projectlombok:lombok:1.18.4")
    annotationProcessor("org.projectlombok:lombok:1.18.4")
}

springBoot {
    mainClassName = "com.example.auth.AuthApplication"
}
