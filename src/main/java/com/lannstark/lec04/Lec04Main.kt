package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(1000L)
    val money2 = money1
    val money3 = JavaMoney(1000L)

    println(money1.plus(money2))

    if (money1 > money2) {
        println("Money1이 Money2보다 큽니다.")
    }

    println(money1 === money2)
    println(money1 == money3)

}