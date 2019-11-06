package com.example.androidjetpacksubmission.data.repositories.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.mapper.MovieMapper
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieDetailResponse
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import com.example.androidjetpacksubmission.utils.FakeDummyData
import com.example.androidjetpacksubmission.utils.LiveDataHelper
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Assert.*
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
    fun getAllMovies() {
        val fakeMovieResponse = FakeDummyData.getMovieResponse()
        val fakeMovieList = FakeDummyData.getMovieList()
        whenever(movieMapper.transform(fakeMovieResponse)).thenReturn(fakeMovieList)

        val moviesLiveData = movieRepository.getAll()
        argumentCaptor<RepositoryCallback<MovieResponse>>().apply {
            verify(movieRemoteDataSource).loadMovies(capture())
            firstValue.onSuccess(fakeMovieResponse)
        }
        verify(movieMapper).transform(fakeMovieResponse)

        val result = LiveDataHelper.getValue(moviesLiveData)
        assertEquals(StatusFixtures.SUCCESS, result.status)
        assertNotNull(result.data)
        assertNull(result.message)
        assertEquals(fakeMovieResponse.data.size, result.data?.size)
    }

    @Test
    fun getMovieDetail() {
        val fakeMovieDetailResponse = FakeDummyData.getMovieDetailResponse()
        val fakeMovieDetail = FakeDummyData.getMovieDetail()
        whenever(movieMapper.transform(fakeMovieDetailResponse)).thenReturn(fakeMovieDetail)

        val fakeMovieId = 0
        val movieLiveData = movieRepository.getDetail(fakeMovieId)
        argumentCaptor<RepositoryCallback<MovieDetailResponse>>().apply {
            verify(movieRemoteDataSource).loadMovieDetail(eq(fakeMovieId), capture())
            firstValue.onSuccess(fakeMovieDetailResponse)
        }
        verify(movieMapper).transform(fakeMovieDetailResponse)

        val result = LiveDataHelper.getValue(movieLiveData)
        assertNotNull(result.data)
        assertEquals(StatusFixtures.SUCCESS, result.status)
        assertNotNull(result.data)
        assertNull(result.message)
        assertEquals(fakeMovieDetail, result.data)
    }


}