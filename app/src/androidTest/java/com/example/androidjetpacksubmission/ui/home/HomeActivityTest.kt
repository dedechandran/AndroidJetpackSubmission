package com.example.androidjetpacksubmission.ui.home

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.fixtures.AVAILABLE_MOVIE
import com.example.androidjetpacksubmission.fixtures.AVAILABLE_TV_SHOW
import com.example.androidjetpacksubmission.fixtures.TV_SHOW_TAB_TITLE
import com.example.androidjetpacksubmission.ui.home.movie.MovieAdapter
import com.example.androidjetpacksubmission.ui.home.tvshow.TvShowAdapter
import com.example.androidjetpacksubmission.utils.EspressoIdlingResourceHelper
import com.example.androidjetpacksubmission.utils.RecyclerViewItemCountAssertion
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeActivityTest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule<HomeActivity>(HomeActivity::class.java)

    @Before
    fun setUp(){
        IdlingRegistry.getInstance().register(EspressoIdlingResourceHelper.getEspressoIdlingResource())
    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResourceHelper.getEspressoIdlingResource())
    }

    @Test
    fun toMovieDetailTest() {
        onView(withId(R.id.movieRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRecyclerView)).check(RecyclerViewItemCountAssertion(AVAILABLE_MOVIE))
        onView(withId(R.id.movieRecyclerView)).perform(
            RecyclerViewActions.actionOnItemAtPosition<MovieAdapter.MovieViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.detailTextMovieTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieTitle)).check(matches(withText("Joker")))

        onView(withId(R.id.detailTextMovieDate)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieDate)).check(matches(withText("2019-10-02")))

        onView(withId(R.id.detailTextMovieDurationLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieDuration)).check(matches(isDisplayed()))


        onView(withId(R.id.detailTextMovieLanguageLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieLanguage)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieLanguage)).check(matches(withText("English")))

        onView(withId(R.id.detailTextMovieBudgetLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieBudget)).check(matches(isDisplayed()))

        onView(withId(R.id.detailTextMovieRevenueLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieRevenue)).check(matches(isDisplayed()))

        onView(withId(R.id.detailTextMovieGenreLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailMovieGenresContainer)).check(matches(isDisplayed()))

        onView(withId(R.id.detailTextMovieOverviewLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextMovieOverview)).check(matches(isDisplayed()))
    }

    @Test
    fun toTvShowDetailTest() {
        onView(withId(R.id.movieRecyclerView)).check(matches(isDisplayed()))
        onView(withText(TV_SHOW_TAB_TITLE)).perform(click())
        onView(withId(R.id.tvShowRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.tvShowRecyclerView)).check(
            RecyclerViewItemCountAssertion(
                AVAILABLE_TV_SHOW
            )
        )
        onView(withId(R.id.tvShowRecyclerView)).perform(
            RecyclerViewActions.actionOnItemAtPosition<TvShowAdapter.TvShowViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.detailTextTvShowTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowTitle)).check(matches(withText("Arrow")))

        onView(withId(R.id.detailTextTvShowDate)).check(matches(isDisplayed()))

        onView(withId(R.id.detailTextTvShowDurationLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowDuration)).check(matches(isDisplayed()))

        onView(withId(R.id.detailTextTvShowLanguageLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowLanguage)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowLanguage)).check(matches(withText("English")))


        onView(withId(R.id.detailTextTvShowType)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowType)).check(matches(withText("Scripted")))

        onView(withId(R.id.detailTextTvShowStatusLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowStatus)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowStatus)).check(matches(withText("Returning Series")))

        onView(withId(R.id.detailTextTvShowGenreLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTvShowGenresContainer)).check(matches(isDisplayed()))

        onView(withId(R.id.detailTextTvShowOverviewLabel)).check(matches(isDisplayed()))
        onView(withId(R.id.detailTextTvShowOverview)).check(matches(isDisplayed()))


    }
}