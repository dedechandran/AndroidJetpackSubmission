package com.example.androidjetpacksubmission.viewmodels

import com.example.androidjetpacksubmission.fixtures.AVAILABLE_MOVIE
import com.example.androidjetpacksubmission.utils.DummyData
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {
    @Mock
    private lateinit var dummyData: DummyData
    @InjectMocks
    private lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun loadMovies() {
        val movies = movieViewModel.loadMovies()
        assertNotNull(movies)
        assertEquals(AVAILABLE_MOVIE,movies.size)
    }

    @Test
    fun getMovieDetail() {
        val mockMovieId = 1
        val movie = movieViewModel.getMovieDetail(mockMovieId)
        assertNotNull(movie)
        assertEquals(1,movie.movieId)
        assertEquals("Alita",movie.movieTitle)
        assertEquals("January 31, 2019",movie.movieReleaseDate)
        assertEquals("English",movie.movieLanguage)
    }
}