package com.example.androidjetpacksubmission.viewmodels

import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.utils.DummyData

open class MovieViewModel constructor(private val dummyData: DummyData) : ViewModel() {

    fun loadMovies() : List<Movie> = dummyData.getMovieList()

    fun getMovieDetail(movieId: Int) : Movie = dummyData.getMovieList()[movieId]
}