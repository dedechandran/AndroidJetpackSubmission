package com.example.androidjetpacksubmission.ui.home.movie


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseFragment
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import kotlinx.android.synthetic.main.fragment_movie.*
import javax.inject.Inject


class MovieFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var movieAdapter: MovieAdapter
    private var movieViewModel: MovieViewModel? = null


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        movieAdapter = MovieAdapter {
            Intent(context, MovieDetailActivity::class.java).run {
                this.putExtra(EXTRA_MOVIE_ID, it.movieId)
                startActivity(this)
            }
        }

        movieRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = movieAdapter
        }

        movieViewModel = activity?.run {
            ViewModelProviders.of(this, viewModelFactory)[MovieViewModel::class.java]
        }

        movieViewModel?.getMovies()?.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                StatusFixtures.LOADING -> shimmerMovieContainer.showShimmer(shimmerMovieContainer.isShimmerStarted)
                StatusFixtures.ERROR -> Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                StatusFixtures.SUCCESS -> {
                    if (it.data != null) {
                        shimmerMovieContainer.hideShimmer()
                        movieAdapter.setData(it.data)
                    }
                }
            }
        })

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }


}
