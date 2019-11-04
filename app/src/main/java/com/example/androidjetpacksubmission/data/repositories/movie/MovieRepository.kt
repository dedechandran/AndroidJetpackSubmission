package com.example.androidjetpacksubmission.data.repositories.movie


import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieRemoteDataSource
import com.example.androidjetpacksubmission.domain.Movie
import javax.inject.Inject

class MovieRepository @Inject constructor(private val movieRemoteDataSource: MovieRemoteDataSource) {
    private val movies: MutableLiveData<Resource<List<Movie>>> by lazy {
        MutableLiveData<Resource<List<Movie>>>()
    }

    fun getAllMovies(): MutableLiveData<Resource<List<Movie>>> {
        movies.postValue(Resource.loading())
        movieRemoteDataSource.getAllMovies(object : RepositoryCallback<List<Movie>> {
            override fun onSuccess(data: List<Movie>) {
                movies.postValue(Resource.success(data))
            }

            override fun onFailure(t: Throwable) {
                movies.postValue(Resource.error(t.message!!))
            }

        })
        return movies
    }
}