package kweto.bandmate.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform