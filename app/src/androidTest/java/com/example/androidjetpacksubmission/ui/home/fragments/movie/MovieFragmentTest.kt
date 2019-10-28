package com.example.androidjetpacksubmission.ui.home.fragments.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.fixtures.AVAILABLE_MOVIE
import com.example.androidjetpacksubmission.testing.SingleFragmentActivity
import com.example.androidjetpacksubmission.utils.RecyclerViewItemCountAssertion
import org.junit.Before

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MovieFragmentTest {
    @Rule
    @JvmField
    val activityRule = ActivityTestRule<SingleFragmentActivity>(SingleFragmentActivity::class.java)
    private val movieFragment = MovieFragment()


    @Before
    fun setUp() {
        activityRule.activity.setFragment(movieFragment)
    }

    @Test
    fun loadMovies(){
        onView(withId(R.id.movieRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRecyclerView)).check(RecyclerViewItemCountAssertion(AVAILABLE_MOVIE))
    }
}