package com.lannstark.lec10.kotlin

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

open class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}