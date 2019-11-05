package com.example.androidjetpacksubmission.ui.home.tvshow

import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepository
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
    private lateinit var tvShowRepository: TvShowRepository
    @InjectMocks
    private lateinit var tvShowViewModel: TvShowViewModel
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun getAllTvShows() {

    }

    @Test
    fun getTvShowDetail() {
    }
}