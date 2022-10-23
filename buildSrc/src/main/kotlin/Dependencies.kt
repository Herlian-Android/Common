object Platform {
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-bom" }
}

object StandardLibrary {
    val jdk8 by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk8" }
    val guava by lazy { "com.google.guava:guava:${Versions.guava}" }
}

object Impl {
    val dagger by lazy { "com.google.dagger:dagger:${Versions.dagger}" }
}

object Api {}

object Kapt {
    val dagger by lazy  { "com.google.dagger:dagger-compiler:${Versions.dagger}" }
}

object Test {
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-test" }
    val jUnit by lazy { "org.jetbrains.kotlin:kotlin-test-junit" }
}