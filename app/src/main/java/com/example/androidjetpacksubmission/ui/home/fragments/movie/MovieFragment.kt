package com.example.androidjetpacksubmission.ui.home.fragments.movie


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseFragment
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.ui.MovieDetailActivity
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import kotlinx.android.synthetic.main.fragment_movie.view.*
import javax.inject.Inject


class MovieFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var movieAdapter: MovieAdapter
    private var movieViewModel: MovieViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie, container, false)
        movieAdapter = MovieAdapter{
            Intent(context,MovieDetailActivity::class.java).run {
                this.putExtra(EXTRA_MOVIE_ID,it.movieId)
                startActivity(this)
            }
        }

        view.movieRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = movieAdapter
        }

        movieViewModel = activity?.run {
            ViewModelProviders.of(this,viewModelFactory)[MovieViewModel::class.java]
        }

        movieAdapter.setData(movieViewModel?.loadMovies())


        return view
    }


}
