package com.example.androidjetpacksubmission.data.repositories.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.mapper.MovieMapper
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieRepositoryImplTest {
    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRemoteDataSource: MovieRemoteDataSource

    @Mock
    private lateinit var movieMapper: MovieMapper

    private lateinit var movieRepository: MovieRepositoryImpl

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieRepository = MovieRepositoryImpl(movieRemoteDataSource, movieMapper)
    }

    @Test
    fun getAll() {
        val fakeMovieResponse = MovieResponse(
            listOf(
                MovieResponse.MovieData(
                    id = 0,
                    releaseDate = "2019-09-12",
                    originalTitle = "SiMadun",
                    posterUrl = "/zxccvbnmlsdheiry.jpg",
                    overview = "Tendangan si madun",
                    originalLanguage = "in"
                )
            )
        )
        movieRepository.getAll()
        argumentCaptor<RepositoryCallback<MovieResponse>>().apply {
            verify(movieRemoteDataSource).loadMovies(capture())
            firstValue.onSuccess(fakeMovieResponse)
        }
        verify(movieMapper).transform(fakeMovieResponse)
    }

    @Test
    fun getDetail() {
    }


}