package com.lannstark.lec12.kotlin

fun main() {
    println(Person.newBaby("sozkd"))
    println(++Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) : Log {

    companion object {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }

    override fun log() {
        println("나는 Person 클래스의 동행객체 Factory입니다.")
    }

}

object Singleton {
    var a: Int = 0
}