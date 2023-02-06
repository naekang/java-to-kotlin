package com.lannstark.lec11.kotlin

private val a = 3

fun add(a: Int, b: Int): Int = a + b

class Cat private constructor(){}

open class Dog protected constructor() {}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {

    var price = _price
        private set
}

