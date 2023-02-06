package com.lannstark.lec15.kotlin

fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    array.plus(300)

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    val numbers = listOf(100, 200)

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) println("${idx}, $value")

    val list = mutableListOf(100, 200, 300)

    val numberSet = mutableSetOf(100, 200)

    numberSet.add(200)
    numberSet.add(300)
    for (i in numberSet) {
        println(i)
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MON"
    oldMap[2] = "TUE"

    mapOf(1 to "MON", 2 to "TUE")

    for (key in oldMap.keys) {

    }

    for ((key, value) in oldMap.entries) {

    }
}