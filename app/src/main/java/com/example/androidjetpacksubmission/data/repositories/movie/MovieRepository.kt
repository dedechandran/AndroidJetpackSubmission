package com.example.androidjetpacksubmission.data.repositories.movie

import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.domain.Movie

interface MovieRepository {
    fun getAllMovies(): MutableLiveData<Resource<List<Movie>>>
    fun getMovieDetail(movieId: Int): MutableLiveData<Resource<Movie>>
}