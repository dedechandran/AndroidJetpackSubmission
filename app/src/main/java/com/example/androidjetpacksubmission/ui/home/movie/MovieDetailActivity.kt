package com.example.androidjetpacksubmission.ui.home.movie

import android.os.Bundle
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity

class MovieDetailActivity : BaseActivity() {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//
//    private var movieViewModel: MovieViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = resources.getString(R.string.movie_detail_title)
        }
//
//        movieViewModel = ViewModelProviders.of(this,viewModelFactory)[MovieViewModel::class.java]
//
//        val movieId = intent.getIntExtra(EXTRA_MOVIE_ID,0)
//        showMovieDetail(movieId)
    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if(item.itemId == android.R.id.home){
//            finish()
//        }
//        return super.onOptionsItemSelected(item)
//    }
//
//    private fun showMovieDetail(movieId : Int){
//        val currencyFormat = NumberFormat.getCurrencyInstance()
//        currencyFormat.minimumFractionDigits = 0
//
//        val movie = movieViewModel?.getMovieDetail(movieId)
//
//        detailTextMovieTitle.text = movie?.movieTitle
//        detailTextMovieDate.text = movie?.movieReleaseDate
//        Glide.with(this)
//            .load(movie?.moviePoster)
//            .into(detailMovieImage)
//        detailTextMovieOverview.text = movie?.movieOverview
//        detailTextMovieDuration.text = movie?.movieDuration
//        detailTextMovieLanguage.text = movie?.movieLanguage
//        detailTextMovieBudget.text = currencyFormat.format(movie?.movieBudget?.toLong())
//        detailTextMovieRevenue.text = currencyFormat.format(movie?.movieRevenue?.toLong())
//        showGenres(movie?.movieGenres?.split(";")!!)
//    }
//
//
//    private fun showGenres(genres: List<String>){
//        for(i in genres.indices){
//            val genreView = layoutInflater.inflate(R.layout.genre_item,detailMovieGenresContainer) as FlexboxLayout
//            val genreText = genreView.getChildAt(i) as TextView
//            genreText.text = genres[i]
//        }
//    }
}
