package com.example.androidjetpacksubmission.utils

import android.content.res.Resources
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow
import java.text.NumberFormat
import javax.inject.Inject

class DummyData @Inject constructor(private val resources: Resources) {
    fun getMovieList(): List<Movie> {
        val currency = NumberFormat.getCurrencyInstance()
        currency.minimumFractionDigits = 0

        val movies = mutableListOf<Movie>()
        movies.add(
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "Seasoned musician Jackson Maine discovers and falls in love with struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jack coaxes her into the spotlight. But even as Allys career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 1,
                movieTitle = "Alita",
                moviePoster = R.drawable.mv_poster_alita,
                movieOverview = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                movieReleaseDate = "January 31, 2019",
                movieLanguage = "English",
                movieDuration = "2h 2m",
                movieGenres = "action;science fiction;thriller;adventure",
                movieBudget = "170000000",
                movieRevenue = "404852543"
            )
        )

        movies.add(
            Movie(
                movieId = 2,
                movieTitle = "Aquaman",
                moviePoster = R.drawable.mv_poster_aquaman,
                movieOverview = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orms half-human, half-Atlantean brother and true heir to the throne.",
                movieReleaseDate = "December 7, 2018",
                movieLanguage = "English",
                movieDuration = "2h 24m",
                movieGenres = "action;adventure;fantasy",
                movieBudget = "160000000",
                movieRevenue = "1143689193"
            )
        )

        movies.add(
            Movie(
                movieId = 3,
                movieTitle = "Bohemian Rhapsody",
                moviePoster = R.drawable.mv_poster_bohemian,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 4,
                movieTitle = "Cold Pursuit",
                moviePoster = R.drawable.mv_poster_cold_pursuit,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 5,
                movieTitle = "Creed II",
                moviePoster = R.drawable.mv_poster_creed,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 6,
                movieTitle = "Fantastic Beasts: The Crimes of Grindelwald",
                moviePoster = R.drawable.mv_poster_crimes,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 7,
                movieTitle = "Glass",
                moviePoster = R.drawable.mv_poster_glass,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 8,
                movieTitle = "How to Train Your Dragon",
                moviePoster = R.drawable.mv_poster_how_to_train,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 9,
                movieTitle = "Avengers: Infinoty War",
                moviePoster = R.drawable.mv_poster_infinity_war,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 10,
                movieTitle = "Mary Queen of Scots",
                moviePoster = R.drawable.mv_poster_marry_queen,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 11,
                movieTitle = "Mortal Engines",
                moviePoster = R.drawable.mv_poster_mortal_engines,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 12,
                movieTitle = "Overlord",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )

        movies.add(
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = R.drawable.mv_poster_a_star_is_born,
                movieOverview = "",
                movieReleaseDate = "October 3, 2018",
                movieLanguage = "English",
                movieDuration = "2h 15m",
                movieGenres = "drama;romance;music",
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )
        )




        return movies
    }

    fun getTvShowList(): List<TvShow> {
        val tvShows = mutableListOf<TvShow>()
        val tvShowPosters = resources.obtainTypedArray(R.array.tv_show_posters)
        val tvShowTitles = resources.getStringArray(R.array.tv_show_titles)
        val tvShowOverviews = resources.getStringArray(R.array.tv_show_overviews)
        val tvShowReleaseDates = resources.getStringArray(R.array.tv_show_release_dates)
        val tvShowLanguages = resources.getStringArray(R.array.tv_show_languages)
        val tvShowDurations = resources.getStringArray(R.array.tv_show_durations)
        val tvShowGenres = resources.getStringArray(R.array.tv_show_genres)
        val tvShowTypes = resources.getStringArray(R.array.tv_show_types)

        for ((index, tvShow) in tvShowTitles.withIndex()) {
            tvShows.add(
                TvShow(
                    tvShowId = index,
                    tvShowTitle = tvShow,
                    tvShowPoster = tvShowPosters.getResourceId(index, 0),
                    tvShowOverview = tvShowOverviews[index],
                    tvShowReleaseDate = tvShowReleaseDates[index],
                    tvShowLanguage = tvShowLanguages[index],
                    tvShowDuration = tvShowDurations[index],
                    tvShowGenres = tvShowGenres[index].split(';'),
                    tvShowType = tvShowTypes[index]
                )
            )
        }
        tvShowPosters.recycle()
        return tvShows
    }

}