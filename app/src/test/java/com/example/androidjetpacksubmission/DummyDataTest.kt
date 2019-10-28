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

    private lateinit var dummyData: DummyData

    @Before
    fun setUp() {
        dummyData = DummyData()
    }

    @Test
    fun getMovieList() {
        val movies = dummyData.getMovieList()
    }

    @Test
    fun getTvShowList() {
        val tvShow = dummyData.getTvShowList()
    }
}