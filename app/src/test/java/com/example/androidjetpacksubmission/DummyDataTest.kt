package com.example.androidjetpacksubmission

import android.content.res.Resources
import com.example.androidjetpacksubmission.utils.DummyData
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock

import org.mockito.MockitoAnnotations


class DummyDataTest {
    @Mock
    private lateinit var resources: Resources
    private lateinit var dummyData: DummyData

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        dummyData = DummyData(resources)
//        whenever(appContext.resources).thenReturn(resources)
    }

    @Test
    fun getMovieList() {
        val movieTitleArray = arrayOf("x","y","z"
        )
        whenever(resources.getStringArray(R.array.movie_titles)).thenReturn(movieTitleArray)
        val movieTitles = resources.getStringArray(R.array.movie_titles)
        assertEquals(movieTitleArray, movieTitles)
//        verify(appContext).resources.getStringArray(R.array.movie_titles)
    }

    @Test
    fun getTvShowList() {
    }
}