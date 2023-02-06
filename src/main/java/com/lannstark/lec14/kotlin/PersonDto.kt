package com.lannstark.lec14.kotlin

fun main() {
    val dto1: PersonDto = PersonDto("내캉", 100)
    val dto2: PersonDto = PersonDto("내캉", 100)

    println(dto1 == dto2)
    println(dto1)

}

data class PersonDto(
    val name: String,
    val age: Int
) {
}