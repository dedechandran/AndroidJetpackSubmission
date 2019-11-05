package com.example.androidjetpacksubmission.ui.home.movie

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.fixtures.IMAGE_URL
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import com.google.android.flexbox.FlexboxLayout
import kotlinx.android.synthetic.main.activity_movie_detail.*
import java.text.NumberFormat
import javax.inject.Inject

class MovieDetailActivity : BaseActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var movieViewModel: MovieViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = resources.getString(R.string.movie_detail_title)
        }

        movieViewModel = ViewModelProviders.of(this,viewModelFactory)[MovieViewModel::class.java]

        val movieId = intent.getIntExtra(EXTRA_MOVIE_ID,0)
        movieViewModel?.getMovieDetail(movieId)?.observe(this, Observer {
            when(it.status){
                StatusFixtures.LOADING -> shimmerMovieDetailContainer.startShimmer()
                StatusFixtures.ERROR -> Toast.makeText(this,"ERROR GAYS",Toast.LENGTH_SHORT).show()
                StatusFixtures.SUCCESS -> {
                    if(it.data != null) {
                        shimmerMovieDetailContainer.stopShimmer()
                        shimmerMovieDetailContainer.visibility = View.GONE
                        showMovieDetail(it.data)
                    }
                }
            }
        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMovieDetail(movie: Movie){
        Glide.with(this)
            .load("$IMAGE_URL${movie.moviePoster}")
            .into(detailMovieImage)
        detailTextMovieTitle.text = movie.movieTitle
        detailTextMovieDate.text = movie.movieReleaseDate

        detailTextMovieDurationLabel.text = resources.getString(R.string.detail_duration_label)
        detailTextMovieDuration.text = movie.movieDuration.toString()

        detailTextMovieLanguageLabel.text = resources.getString(R.string.detail_language_label)
        detailTextMovieLanguage.text = movie.movieLanguage

        detailTextMovieBudgetLabel.text = resources.getString(R.string.detail_budget_label)
        detailTextMovieBudget.text = movie.movieBudget

        detailTextMovieRevenueLabel.text = resources.getString(R.string.detail_revenue_label)
        detailTextMovieRevenue.text = movie.movieRevenue

        detailTextMovieOverviewLabel.text = resources.getString(R.string.detail_overview_label)
        detailTextMovieOverview.text = movie.movieOverview

        detailTextMovieGenreLabel.text = resources.getString(R.string.detail_genres_label)
        showGenres(movie.movieGenres!!)
    }


    private fun showGenres(genres: List<String>){
        for(i in genres.indices){
            val genreView = layoutInflater.inflate(R.layout.genre_item,detailMovieGenresContainer) as FlexboxLayout
            val genreText = genreView.getChildAt(i) as TextView
            genreText.text = genres[i]
        }
    }
}
