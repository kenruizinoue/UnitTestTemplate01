package com.kenruizinoue.unittesttemplate01

class ConverterUtil {
    companion object {
        fun convertCelsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) + 32
        fun convertFahrenheitToCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5 / 9
    }
}
