package com.example.androidjetpacksubmission.viewmodels

import com.example.androidjetpacksubmission.fixtures.AVAILABLE_TV_SHOW
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
class TvShowViewModelTest {
    @Mock
    private lateinit var dummyData: DummyData
    @InjectMocks
    private lateinit var tvShowViewModel: TvShowViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun loadTvShows() {
        val tvShows = tvShowViewModel.loadTvShows()
        assertNotNull(tvShows)
        assertEquals(AVAILABLE_TV_SHOW,tvShows.size)
    }

    @Test
    fun getTvShowDetail() {
        val mockTvShowId = 1
        val tvShow = tvShowViewModel.getTvShowDetail(mockTvShowId)
        assertNotNull(tvShow)
        assertEquals(1,tvShow.tvShowId)
        assertEquals("Doom Patrol",tvShow.tvShowTitle)
        assertEquals("February 15, 2019",tvShow.tvShowReleaseDate)
        assertEquals("English",tvShow.tvShowLanguage)
    }
}