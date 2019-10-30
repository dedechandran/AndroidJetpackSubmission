package com.example.androidjetpacksubmission.data.repositories.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieService
import com.example.androidjetpacksubmission.domain.Movie
import java.lang.Exception
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val movieService: MovieService):
    MovieRepository {
    override suspend fun getAll(): LiveData<List<Movie>> {
        val movies = MutableLiveData<List<Movie>>()
        try {
            movies.value = movieService.getAllMovies()
        }catch (e : Exception){

        }
        return movies
    }

    override suspend fun getById(id: String): LiveData<Movie> {
        val movie = MutableLiveData<Movie>()
        try {
            movie.value = movieService.getMovie(id)
        }catch (e : Exception){

        }
        return movie
    }


}