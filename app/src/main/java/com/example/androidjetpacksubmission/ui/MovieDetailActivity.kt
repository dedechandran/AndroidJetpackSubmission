package com.example.androidjetpacksubmission.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
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
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = resources.getString(R.string.movie_detail_title)
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
        detailTextTvShowTitle.text = movie?.movieTitle
        detailTextTvShowDate.text = movie?.movieReleaseDate
        Glide.with(this)
            .load(movie?.moviePoster)
            .into(detailTvShowImage)
        detailTextTvShowOverview.text = movie?.movieOverview
        detailTextTvShowDuration.text = movie?.movieDuration
        detailTextTvShowLanguage.text = movie?.movieLanguage
        detailTextTvShowType.text = movie?.movieBudget
        detailTextTvShowStatus.text = movie?.movieRevenue
        genresAdapter.setData(movie?.movieGenres!!)
    }
}
