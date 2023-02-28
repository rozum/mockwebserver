plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.2")
    implementation("com.squareup.okhttp3:mockwebserver:4.10.0")
    implementation("io.fabric8:zjsonpatch:0.3.0")
}
