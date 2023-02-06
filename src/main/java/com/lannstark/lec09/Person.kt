package com.lannstark.lec09

class Person(
    name: String,
    var age: Int
) {

    var name: String = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두번째 부생성자")
    }

    // 부생성자보다 정적 팩토리 메서드 권장

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }
//
//    val isAdult: Boolean
//        get() = this.age >= 20

}