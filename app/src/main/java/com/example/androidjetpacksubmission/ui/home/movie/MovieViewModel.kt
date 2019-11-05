package com.example.androidjetpacksubmission.ui.home.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepository
import com.example.androidjetpacksubmission.domain.Movie

class MovieViewModel constructor(private val movieRepository: MovieRepository) : ViewModel() {
    private var movies = MutableLiveData<Resource<List<Movie>>>()
    private var movie = MutableLiveData<Resource<Movie>>()

    fun getMovies(): LiveData<Resource<List<Movie>>> {
        if(movies.value != null){
            return movies
        }
        movies = movieRepository.getAllMovies()
        return movies
    }

    fun getMovieDetail(movieId: Int): LiveData<Resource<Movie>>{
        if(movie.value != null){
            return movie
        }
        movie = movieRepository.getMovieById(movieId)
        return movie
    }
}