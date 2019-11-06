package com.example.androidjetpacksubmission.ui.home.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepository
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import com.example.androidjetpacksubmission.utils.FakeDummyData
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {
    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    private lateinit var movieViewModel: MovieViewModel
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieViewModel = MovieViewModel(movieRepository)
    }

    @Test
    fun getMovies() {
        val fakeMovies = FakeDummyData.getMovieList()
        val resource = Resource(status = StatusFixtures.SUCCESS, data = fakeMovies, message = null)
        val movies = MutableLiveData<Resource<List<Movie>>>()
        movies.value = resource

        whenever(movieRepository.getAll()).thenReturn(movies)

        val observer: Observer<Resource<List<Movie>>> = mock()
        movieViewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(resource)
    }

    @Test
    fun getMovieDetail() {
        val fakeMovie = FakeDummyData.getMovieDetail()
        val resource = Resource(status = StatusFixtures.SUCCESS, data = fakeMovie, message = null)
        val movie = MutableLiveData<Resource<Movie>>()
        movie.value = resource

        val fakeMovieId = 0
        whenever(movieRepository.getDetail(fakeMovieId)).thenReturn(movie)

        val observer: Observer<Resource<Movie>> = mock()
        movieViewModel.getMovieDetail(fakeMovieId).observeForever(observer)
        verify(observer).onChanged(resource)
    }
}