package com.example.androidjetpacksubmission.data.repositories.movie


import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieRemoteDataSource
import com.example.androidjetpacksubmission.domain.Movie
import javax.inject.Inject
import javax.inject.Singleton

class MovieRepositoryImpl @Inject constructor(private val movieRemoteDataSource: MovieRemoteDataSource) : MovieRepository {
    override
    fun getAll(): MutableLiveData<Resource<List<Movie>>> {
        val movies = MutableLiveData<Resource<List<Movie>>>()
        movies.postValue(Resource.loading())
        movieRemoteDataSource.loadMovies(object : RepositoryCallback<List<Movie>> {
            override fun onSuccess(data: List<Movie>) {
                movies.postValue(Resource.success(data))
            }

            override fun onFailure(t: Throwable) {
                movies.postValue(Resource.error(t.message!!))
            }

        })
        return movies
    }
    override
    fun getDetail(id: Int): MutableLiveData<Resource<Movie>> {
        val movie = MutableLiveData<Resource<Movie>>()
        movie.postValue(Resource.loading())
        movieRemoteDataSource.loadMovieDetail(id, object : RepositoryCallback<Movie> {
            override fun onSuccess(data: Movie) {
                movie.postValue(Resource.success(data))
            }

            override fun onFailure(t: Throwable) {
                movie.postValue(Resource.error(t.message!!))
            }

        })
        return movie
    }


}