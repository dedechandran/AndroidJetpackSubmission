package com.example.androidjetpacksubmission.viewmodels

import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.utils.DummyData

open class MovieViewModel constructor(dummyData: DummyData) : ViewModel() {
    private val movies = mutableListOf<Movie>()
    init {
        movies.addAll(dummyData.getMovieList())
    }

    fun loadMovies() = movies

    fun getMovieDetail(movieId: Int) = movies[movieId]
}