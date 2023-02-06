package com.lannstark.lec05

fun main() {

}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0부터 100사이 입니다.")
    }
}

fun getPassOrFail(score: Int): String {
//    if (score >= 90) {
//        return "P"
//    } else {
//        return "F"
//    }

    return if (score >= 90) "P" else "F"
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}