package com.example.androidjetpacksubmission.ui.home.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepository
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import com.example.androidjetpacksubmission.utils.FakeDummyData
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {
    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tvShowRepository: TvShowRepository

    private lateinit var tvShowViewModel: TvShowViewModel
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        tvShowViewModel = TvShowViewModel(tvShowRepository)
    }

    @Test
    fun getAllTvShows() {
        val fakeTvShows = FakeDummyData.getTvShowList()
        val resource = Resource(status = StatusFixtures.SUCCESS,data = fakeTvShows,message = null)
        val tvShow = MutableLiveData<Resource<List<TvShow>>>()
        tvShow.value = resource

        `when`(tvShowRepository.getAll()).thenReturn(tvShow)

        val observer : Observer<Resource<List<TvShow>>> = mock()

        tvShowViewModel.getAllTvShows().observeForever(observer)

        verify(observer).onChanged(resource)
    }

    @Test
    fun getTvShowDetail() {
        val fakeMovie = FakeDummyData.getTvShowDetail()
        val resource = Resource(status = StatusFixtures.SUCCESS, data = fakeMovie, message = null)
        val movie = MutableLiveData<Resource<TvShow>>()
        movie.value = resource

        val fakeTvShowId = 4
        whenever(tvShowRepository.getDetail(fakeTvShowId)).thenReturn(movie)

        val observer: Observer<Resource<TvShow>> = mock()
        tvShowViewModel.getTvShowDetail(fakeTvShowId).observeForever(observer)
        verify(observer).onChanged(resource)
    }
}