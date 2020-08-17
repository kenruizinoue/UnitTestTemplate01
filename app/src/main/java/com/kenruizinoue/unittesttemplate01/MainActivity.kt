package com.kenruizinoue.unittesttemplate01import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        convertToCelsiusButton.setOnClickListener { convertToFahrenheit() }
        convertToFahrenheitButton.setOnClickListener { convertToCelsius() }
    }

    private fun convertToFahrenheit() {
        val textToConvert = temperatureEditText.text.toString().toDouble()
        resultTextView.text = ConverterUtil.convertFahrenheitToCelsius(textToConvert).toString()
    }

    private fun convertToCelsius() {
        val textToConvert = temperatureEditText.text.toString().toDouble()
        resultTextView.text = ConverterUtil.convertCelsiusToFahrenheit(textToConvert).toString()
    }
}

