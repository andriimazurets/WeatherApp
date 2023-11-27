package com.example.weatherapp.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weatherapp.Domains.Hourly
import com.example.weatherapp.databinding.ViewholderHourlyBinding

class HourlyAdapters(var items: List<Hourly>) : RecyclerView.Adapter<HourlyAdapters.houlyHolder>() {
    inner class houlyHolder(val binding: ViewholderHourlyBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): houlyHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ViewholderHourlyBinding.inflate(layoutInflater, parent, false)
        return houlyHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: houlyHolder, position: Int) {
        holder.binding.apply {
            hourTxt.text = items[position].hour
            tempTxt.text = "${items[position].temp}°"

            var drawableResourceId = holder.itemView.resources
                .getIdentifier(
                    items[position].picPath,
                    "drawable",
                    holder.itemView.context.packageName
                )

            Glide.with(context)
        }
    }
}