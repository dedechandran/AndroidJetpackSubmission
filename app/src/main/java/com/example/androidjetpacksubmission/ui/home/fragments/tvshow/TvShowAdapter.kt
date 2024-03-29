package com.example.androidjetpacksubmission.ui.home.fragments.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.TvShow
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.tv_show_item.view.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private val data = mutableListOf<TvShow>()

    fun setData(data: List<TvShow>?) {
        data?.let { this.data.addAll(it) }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder =
        TvShowViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.tv_show_item,
                parent,
                false
            )
        )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        holder.bind(data[position])
    }


    inner class TvShowViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bind(item: TvShow) {
            containerView.tvShowImage.apply {
                Glide.with(itemView).load(item.tvShowPoster).into(this)
            }
            containerView.tvShowTextName.text = item.tvShowName
            containerView.tvShowTextOverview.text = item.tvShowOverview
            containerView.tvShowTextReleaseDate.text = item.tvShowReleaseDate
        }
    }
}