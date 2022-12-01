package com.example.app.beduf0m2kotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.app.beduf0m2kotlin.http.HttpOperations
import com.example.app.beduf0m2kotlin.models.WeatherResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class WeatherActivity : AppCompatActivity() {

    private lateinit var txtWeatherTemperatura: TextView
    private lateinit var txtWeatherClima: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        txtWeatherTemperatura = findViewById(R.id.txtWeatherTemperatura)
        txtWeatherClima = findViewById(R.id.txtWeatherClima)

    }

    fun onClickWeatherCargar(view: View) {

        val http = HttpOperations()
        val json =
            http.httpGet("https://api.openweathermap.org/data/2.5/weather?lat=16.251150&lon=-92.136480&appid=b62bec84393bc782f065b3b227588a32&lang=es")

        val weatherResponse = jsonResponse(json.toString())

        if (weatherResponse != null) {
            txtWeatherTemperatura.text = weatherResponse.main?.temp.toString()
        }
        if (weatherResponse != null) {
            txtWeatherClima.text = weatherResponse.weather.get(0).description
        }

    }


    private fun jsonResponse(json: String): WeatherResponse? {
        val gson = Gson()
        val type: Type = object : TypeToken<WeatherResponse?>() {}.type
        return gson.fromJson(json, type)
    }
}