package raf.console.notes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform