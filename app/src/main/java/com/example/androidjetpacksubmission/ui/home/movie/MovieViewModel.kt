package com.example.androidjetpacksubmission.ui.home.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepository
import com.example.androidjetpacksubmission.domain.Movie

class MovieViewModel constructor(private val movieRepository: MovieRepository) : ViewModel() {
    private val movies : MutableLiveData<Resource<List<Movie>>> by lazy {
        movieRepository.getAllMovies()
    }

    fun loadMovies(): LiveData<Resource<List<Movie>>> {
        return movies
    }
}