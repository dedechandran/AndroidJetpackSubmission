package com.example.androidjetpacksubmission.data.repositories.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.mapper.TvShowMapper
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowResponse
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import com.example.androidjetpacksubmission.utils.FakeDummyData
import com.example.androidjetpacksubmission.utils.LiveDataHelper
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DefaultTvShowRepositoryTest {
    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tvShowRemoteDataSource: TvShowRemoteDataSource

    @Mock
    private lateinit var tvShowMapper: TvShowMapper

    private lateinit var defaultTvShowRepository: DefaultTvShowRepository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        defaultTvShowRepository = DefaultTvShowRepository(tvShowRemoteDataSource, tvShowMapper)
    }

    @Test
    fun getAllTvShow() {
        val fakeTvShowResponse = FakeDummyData.getTvShowResponse()
        val fakeTvShowList = FakeDummyData.getTvShowList()
        whenever(tvShowMapper.transform(fakeTvShowResponse)).thenReturn(fakeTvShowList)

        val tvShowsLiveData = defaultTvShowRepository.getAll()
        argumentCaptor<RepositoryCallback<TvShowResponse>>().apply {
            verify(tvShowRemoteDataSource).loadTvShows(capture())
            firstValue.onSuccess(fakeTvShowResponse)
        }
        verify(tvShowMapper).transform(fakeTvShowResponse)

        val result = LiveDataHelper.getValue(tvShowsLiveData)
        Assert.assertEquals(StatusFixtures.SUCCESS, result.status)
        Assert.assertNotNull(result.data)
        Assert.assertNull(result.message)
        Assert.assertEquals(fakeTvShowResponse.data.size, result.data?.size)
    }

    @Test
    fun getTvShowDetail() {
        val fakeTvShowDetailResponse = FakeDummyData.getTvShowDetailResponse()
        val fakeTvShowDetail = FakeDummyData.getTvShowDetail()
        whenever(tvShowMapper.transform(fakeTvShowDetailResponse)).thenReturn(fakeTvShowDetail)

        val fakeTvShowId = 4
        val tvShowLiveData =defaultTvShowRepository.getDetail(fakeTvShowId)
        argumentCaptor<RepositoryCallback<TvShowDetailResponse>>().apply {
            verify(tvShowRemoteDataSource).loadTvShowDetail(eq(fakeTvShowId),capture())
            firstValue.onSuccess(fakeTvShowDetailResponse)
        }
        verify(tvShowMapper).transform(fakeTvShowDetailResponse)

        val result = LiveDataHelper.getValue(tvShowLiveData)
        Assert.assertEquals(StatusFixtures.SUCCESS, result.status)
        Assert.assertNotNull(result.data)
        Assert.assertNull(result.message)
        Assert.assertEquals(fakeTvShowDetail, result.data)
    }
}