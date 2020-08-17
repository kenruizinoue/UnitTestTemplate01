package com.kenruizinoue.unittesttemplate01

import org.junit.Test
import org.junit.Assert.*

class ConverterUnitTest {
    // delta -> tolerance
    @Test
    fun celsiusToFahrenheit() {
        val result = ConverterUtil.convertCelsiusToFahrenheit(24.0)
        assertEquals(75.2, result, 0.01)
    }

    @Test
    fun fahrenheitToCelsius() {
        val result = ConverterUtil.convertFahrenheitToCelsius(75.2)
        assertEquals(24.0, result, 0.01)
    }
}