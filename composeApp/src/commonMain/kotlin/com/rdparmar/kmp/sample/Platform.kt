package com.rdparmar.kmp.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform