package com.example.androidjetpacksubmission.ui

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import com.google.android.flexbox.FlexboxLayout
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.genre_item.*
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
        showMovieDetail(movieId)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
    
    private fun showMovieDetail(movieId : Int){
        val movie = movieViewModel?.getMovieDetail(movieId)
        detailTextMovieTitle.text = movie?.movieTitle
        detailTextMovieDate.text = movie?.movieReleaseDate
        Glide.with(this)
            .load(movie?.moviePoster)
            .into(detailMovieImage)
        detailTextMovieOverview.text = movie?.movieOverview
        detailTextMovieDuration.text = movie?.movieDuration
        detailTextMovieLanguage.text = movie?.movieLanguage
        detailTextMovieBudget.text = movie?.movieBudget
        detailTextMovieStatus.text = movie?.movieRevenue
        showGenres(movie?.movieGenres!!)
    }


    private fun showGenres(genres: List<String>){
        for(i in genres.indices){
            val genreView = layoutInflater.inflate(R.layout.genre_item,detailMovieGenresContainer) as FlexboxLayout
            val genreText = genreView.getChildAt(i) as TextView
            genreText.text = genres[i]
        }
    }
}
