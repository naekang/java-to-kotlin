package com.lannstark.lec14.kotlin

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        Country.JAPAN -> TODO()
    }
}

enum class Country(
    val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    JAPAN("JP")
    ;
}