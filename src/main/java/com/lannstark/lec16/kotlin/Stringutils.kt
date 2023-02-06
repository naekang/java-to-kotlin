package com.lannstark.lec16.kotlin

import com.lannstark.lec16.Person

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 100)
    person.nextYearAge()

    val train: Train = Train()
    train.isExpensive()

    val srt1: Train = Srt()
    srt1.isExpensive()

    val srt2: Srt = Srt()
    srt2.isExpensive()
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

open class Train(
    val name: String = "새마을 기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt: Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("SRT의 확장함수")
    return this.price >= 10000
}