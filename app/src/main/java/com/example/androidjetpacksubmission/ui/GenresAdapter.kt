package com.example.androidjetpacksubmission.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidjetpacksubmission.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.genre_item.view.*

class GenresAdapter : RecyclerView.Adapter<GenresAdapter.GenresViewHolder>() {
    private val data = mutableListOf<String>()


    fun setData(data: List<String>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenresViewHolder =
        GenresViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.genre_item,
                parent,
                false
            )
        )

    override fun getItemCount() = this.data.size

    override fun onBindViewHolder(holder: GenresViewHolder, position: Int) {
        holder.bindItem(data[position])
    }

    inner class GenresViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(genres: String) {
            containerView.detailTextGenre.text = genres
        }
    }
}