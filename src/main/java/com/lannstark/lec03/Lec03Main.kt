package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2 = 5
    val result: Long = number1 / number2.toLong()
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}