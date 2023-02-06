package com.lannstark.lec02

fun main() {
    println(startWithA1(""))

    val str: String? = null
    println(str?.length)
    println(str?.length ?: 100)

    val person = Person("내캉")
    println(startWithA(person.name))

}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔다.")

//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//
//    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

//    if (str == null) {
//        return null
//    }
//
//    return str.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}