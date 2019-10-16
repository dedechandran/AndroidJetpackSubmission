package com.example.androidjetpacksubmission.ui.home.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseFragment
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
        movieAdapter = MovieAdapter()

        view.movieRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = movieAdapter
        }

        movieViewModel = activity?.run {
            ViewModelProviders.of(this)[MovieViewModel::class.java]
        }
        
        movieAdapter.setData(movieViewModel?.loadMovies())


        return view
    }


}
