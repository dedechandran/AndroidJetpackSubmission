package com.example.androidjetpacksubmission.data.repositories.movie


import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.mapper.MovieMapper
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieDetailResponse
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
import com.example.androidjetpacksubmission.domain.Movie
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieMapper: MovieMapper
) : MovieRepository {
    override
    fun getAll(): MutableLiveData<Resource<List<Movie>>> {
        val movies = MutableLiveData<Resource<List<Movie>>>()
//        movies.postValue(Resource.loading())
        movieRemoteDataSource.loadMovies(object : RepositoryCallback<MovieResponse> {
            override fun onSuccess(data: MovieResponse) {
                val mappedMovies = movieMapper.transform(data)
                movies.postValue(Resource.success(mappedMovies))
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
        movieRemoteDataSource.loadMovieDetail(id, object : RepositoryCallback<MovieDetailResponse> {
            override fun onSuccess(data: MovieDetailResponse) {
                val mappedMovie = movieMapper.transform(data)
                movie.postValue(Resource.success(mappedMovie))
            }

            override fun onFailure(t: Throwable) {
                movie.postValue(Resource.error(t.message!!))
            }

        })
        return movie
    }


}