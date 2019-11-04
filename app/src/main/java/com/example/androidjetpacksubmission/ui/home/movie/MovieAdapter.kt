package com.example.androidjetpacksubmission.ui.home.fragments.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.fixtures.IMAGE_URL
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(private val listener: (Movie) -> Unit) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private val data = mutableListOf<Movie>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder =
        MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.movie_item,
                parent,
                false
            )
        )

    fun setData(data: List<Movie>?){
        data?.let { this.data.addAll(it) }
        notifyDataSetChanged()
    }

    override fun getItemCount() = data.size
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindItem(data[position],listener)
    }

    inner class MovieViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: Movie,listener: (Movie) -> Unit) {
            containerView.movieCardContainer.setOnClickListener {
                listener(item)
            }
            containerView.movieImage.apply {
                Glide.with(itemView).load("$IMAGE_URL${item.moviePoster}").into(this)
            }
            containerView.movieTextTitle.text = item.movieTitle
            containerView.movieTextOverview.text = item.movieOverview
            containerView.movieTextReleaseDate.text = item.movieReleaseDate
        }
    }

}