package com.example.androidjetpacksubmission.ui.home

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.fixtures.TV_SHOW_TAB_TITLE
import com.example.androidjetpacksubmission.ui.home.fragments.movie.MovieAdapter
import com.example.androidjetpacksubmission.ui.home.fragments.tvshow.TvShowAdapter
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeActivityTest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule<HomeActivity>(HomeActivity::class.java)

    @Test
    fun toMovieDetailTest(){
        onView(withId(R.id.movieRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRecyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<MovieAdapter.MovieViewHolder>(0,click()))
        onView(withId(R.id.detailTextMovieTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieTitle)).check(matches(withText("A Star Is Born")))
    }

    @Test
    fun toTvShowDetailTest(){
        onView(withId(R.id.movieRecyclerView)).check(matches(isDisplayed()))

        onView(withText(TV_SHOW_TAB_TITLE)).perform(click())
        onView(withId(R.id.tvShowRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.tvShowRecyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<TvShowAdapter.TvShowViewHolder>(0,
            click()))

        onView(withId(R.id.detailTextTvShowTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowTitle)).check(matches(withText("Arrow")))

    }
}