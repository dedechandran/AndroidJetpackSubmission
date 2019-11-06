package com.example.androidjetpacksubmission.utils

import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieDetailResponse
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowResponse
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow

class FakeDummyData {
    companion object {
        fun getMovieList(): List<Movie> {
            val movies = mutableListOf<Movie>()
            movies.add(
                Movie(
                    movieId = 0,
                    movieTitle = "A Star Is Born",
                    moviePoster = "",
                    movieOverview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                    movieReleaseDate = "2018-10-03"
                )
            )

            movies.add(
                Movie(
                    movieId = 4,
                    movieTitle = "Cold Pursuit",
                    moviePoster = "",
                    movieOverview = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                    movieReleaseDate = "2019-02-07",
                    movieLanguage = "en",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "60000000",
                    movieRevenue = "59213931"
                )
            )
            return movies
        }

        fun getMovieDetail(): Movie =
            Movie(
                movieId = 0,
                movieTitle = "A Star Is Born",
                moviePoster = "",
                movieOverview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                movieReleaseDate = "2018-10-03",
                movieLanguage = "en",
                movieDuration = "120",
                movieGenres = listOf("crime"),
                movieBudget = "36000000",
                movieRevenue = "170000000"
            )

        fun getMovieResponse(): MovieResponse =
            MovieResponse(
                listOf(
                    MovieResponse.MovieData(
                        id = 0,
                        originalTitle = "A Star Is Born",
                        posterUrl = "",
                        overview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                        releaseDate = "2018-10-03"
                    ),
                    MovieResponse.MovieData(
                        id = 4,
                        originalTitle = "Cold Pursuit",
                        posterUrl = "",
                        overview = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                        releaseDate = "2019-02-07"
                    )
                )
            )

        fun getMovieDetailResponse(): MovieDetailResponse =
            MovieDetailResponse(
                id = 0,
                originalTitle = "A Star Is Born",
                posterUrl = "",
                overview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                releaseDate = "2018-10-03",
                originalLanguage = "en",
                runtime = 120,
                genres = listOf(
                    MovieDetailResponse.Genre(
                        id = 0,
                        name = "crime"
                    )
                ),
                budget = 36000000,
                revenue = 170000000
            )

        fun getTvShowList(): List<TvShow> {
            val tvShows = mutableListOf<TvShow>()
            tvShows.add(
                TvShow(
                    tvShowId = 0,
                    tvShowTitle = "Arrow",
                    tvShowPoster = "",
                    tvShowOverview = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                    tvShowReleaseDate = "2012-10-10"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 4,
                    tvShowTitle = "Family Guy",
                    tvShowPoster = "",
                    tvShowOverview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                    tvShowReleaseDate = "1999-01-31"
                )
            )

            return tvShows
        }

        fun getTvShowDetail() : TvShow =
            TvShow(
                tvShowId = 4,
                tvShowTitle = "Family Guy",
                tvShowPoster = "",
                tvShowOverview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                tvShowReleaseDate = "1999-01-31",
                tvShowLanguage = "en",
                tvShowDuration = "22",
                tvShowGenres = listOf("animation"),
                tvShowType = "Scripted",
                tvShowStatus = "Returning Series"
            )


        fun getTvShowResponse(): TvShowResponse =
            TvShowResponse(
                listOf(
                    TvShowResponse.TvShowData(
                        id = 0,
                        title = "Arrow",
                        posterUrl = "",
                        overview = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                        firstAirDate = "2012-10-10"
                    ),
                    TvShowResponse.TvShowData(
                        id = 4,
                        title = "Family Guy",
                        posterUrl = "",
                        overview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                        firstAirDate = "1999-01-31"
                    )
                )
            )

        fun getTvShowDetailResponse(): TvShowDetailResponse =
            TvShowDetailResponse(
                id = 4,
                title = "Family Guy",
                posterUrl = "",
                overview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                firstAirDate = "1999-01-31",
                originalLanguage = "en",
                duration = listOf(22),
                genres = listOf(
                    TvShowDetailResponse.Genre(
                        id = 0,
                        name = "animation"
                    )
                ),
                type = "Scripted",
                status = "Returning Series"
            )
    }

}