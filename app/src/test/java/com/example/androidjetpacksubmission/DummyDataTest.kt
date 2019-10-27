package com.example.androidjetpacksubmission

import android.content.res.Resources
import com.example.androidjetpacksubmission.utils.DummyData
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock

import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DummyDataTest {
    @Mock
    private lateinit var resources: Resources
    @InjectMocks
    private lateinit var dummyData: DummyData

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun getMovieList() {
        val movieTitleArray = arrayOf("x","y","z"
        )
        whenever(resources.getStringArray(R.array.movie_titles)).thenReturn(movieTitleArray)
        val movies = dummyData.getMovieList()
        verify(resources).getStringArray(R.array.movie_titles)
    }

    @Test
    fun getTvShowList() {
    }
}