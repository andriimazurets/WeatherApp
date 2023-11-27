package com.example.weatherapp.Activitis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.Adapters.HourlyAdapters
import com.example.weatherapp.Domains.Hourly
import com.example.weatherapp.R
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        var hourlyList = mutableListOf<Hourly>(
            Hourly("11 pm", "28", "cloudy"),
            Hourly("12 pm", "29", "sunny"),
            Hourly("13 pm", "30", "wind"),
            Hourly("16 pm", "31", "rainy"),
            Hourly("17 pm", "32", "storm")
        )

        val adapter = HourlyAdapters(hourlyList)
        binding.viewRecycler.adapter = adapter
        binding.viewRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
}