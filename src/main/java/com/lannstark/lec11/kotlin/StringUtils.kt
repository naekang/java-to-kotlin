package com.lannstark.lec11.kotlin

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}