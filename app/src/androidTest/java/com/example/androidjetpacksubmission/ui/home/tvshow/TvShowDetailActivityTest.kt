package com.example.androidjetpacksubmission.ui.home.tvshow

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.fixtures.EXTRA_TV_SHOW_ID
import com.example.androidjetpacksubmission.utils.EspressoIdlingResourceHelper
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TvShowDetailActivityTest {
    private val fakeTvShowId = 1412
    @Rule
    @JvmField
    val activityRule =
        object : ActivityTestRule<TvShowDetailActivity>(TvShowDetailActivity::class.java) {
            override fun getActivityIntent(): Intent {
                val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
                val result = Intent(targetContext, TvShowDetailActivity::class.java)
                result.putExtra(EXTRA_TV_SHOW_ID, fakeTvShowId)
                return result
            }
        }


    @Before
    fun setUp() {
        IdlingRegistry.getInstance()
            .register(EspressoIdlingResourceHelper.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance()
            .unregister(EspressoIdlingResourceHelper.getEspressoIdlingResource())
    }

    @Test
    fun loadTvShowDetail(){
        onView(ViewMatchers.withId(R.id.detailTextTvShowTitle))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowTitle))
            .check(ViewAssertions.matches(ViewMatchers.withText("Arrow")))

        onView(ViewMatchers.withId(R.id.detailTextTvShowDate))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(ViewMatchers.withId(R.id.detailTextTvShowDurationLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowDuration))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(ViewMatchers.withId(R.id.detailTextTvShowLanguageLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowLanguage))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowLanguage))
            .check(ViewAssertions.matches(ViewMatchers.withText("English")))


        onView(ViewMatchers.withId(R.id.detailTextTvShowType))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowType))
            .check(ViewAssertions.matches(ViewMatchers.withText("Scripted")))

        onView(ViewMatchers.withId(R.id.detailTextTvShowStatusLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowStatus))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowStatus))
            .check(ViewAssertions.matches(ViewMatchers.withText("Returning Series")))

        onView(ViewMatchers.withId(R.id.detailTextTvShowGenreLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTvShowGenresContainer))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(ViewMatchers.withId(R.id.detailTextTvShowOverviewLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextTvShowOverview))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}