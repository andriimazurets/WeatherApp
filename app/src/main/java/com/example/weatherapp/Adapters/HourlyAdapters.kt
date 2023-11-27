package com.example.weatherapp.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.Domains.Hourly
import com.example.weatherapp.databinding.ActivityMainBinding

class HourlyAdapters(var hourlys: List<Hourly>) : RecyclerView.Adapter<HourlyAdapters.houlyHolder>() {
    inner class houlyHolder(val binding: ActivityMainBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): houlyHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ActivityMainBinding.inflate(layoutInflater, parent, false)
        return houlyHolder(binding)
    }

    override fun getItemCount(): Int {
        return hourlys.size
    }

    override fun onBindViewHolder(holder: houlyHolder, position: Int) {
        TODO("Not yet implemented")
    }
}