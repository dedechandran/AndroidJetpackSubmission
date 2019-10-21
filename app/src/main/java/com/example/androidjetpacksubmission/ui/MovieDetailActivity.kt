package com.example.androidjetpacksubmission.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.MenuItem
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import com.example.androidjetpacksubmission.viewmodels.ViewModelFactory
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_movie_detail.*
import javax.inject.Inject

class MovieDetailActivity : BaseActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var genresAdapter: GenresAdapter
    private var movieViewModel: MovieViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        supportActionBar.apply {
            this?.setDisplayHomeAsUpEnabled(true)
            this?.title = resources.getString(R.string.movie_detail_title)
        }

        genresAdapter = GenresAdapter()

        detailRvGenres.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = genresAdapter
        }

        movieViewModel = ViewModelProviders.of(this,viewModelFactory)[MovieViewModel::class.java]

        val movieId = intent.getShortExtra(EXTRA_MOVIE_ID,0)
        showMovieDetail(movieId)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
    
    private fun showMovieDetail(movieId : Short){
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
        detailTextMovieRevenue.text = movie?.movieRevenue
        genresAdapter.setData(movie?.movieGenres!!)
    }
}
