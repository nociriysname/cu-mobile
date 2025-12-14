package ru.cu.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform