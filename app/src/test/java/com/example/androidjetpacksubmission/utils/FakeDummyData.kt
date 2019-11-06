package com.example.androidjetpacksubmission.utils

import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
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
                    movieReleaseDate = "October 3, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "36000000",
                    movieRevenue = "170000000"
                )
            )

            movies.add(
                Movie(
                    movieId = 1,
                    movieTitle = "Alita",
                    moviePoster = "",
                    movieOverview = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                    movieReleaseDate = "January 31, 2019",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "170000000",
                    movieRevenue = "404852543"
                )
            )

            movies.add(
                Movie(
                    movieId = 2,
                    movieTitle = "Aquaman",
                    moviePoster = "",
                    movieOverview = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                    movieReleaseDate = "December 7, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "160000000",
                    movieRevenue = "1143689193"
                )
            )

            movies.add(
                Movie(
                    movieId = 3,
                    movieTitle = "Bohemian Rhapsody",
                    moviePoster = "",
                    movieOverview = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                    movieReleaseDate = "October 24, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "52000000",
                    movieRevenue = "894027543"
                )
            )

            movies.add(
                Movie(
                    movieId = 4,
                    movieTitle = "Cold Pursuit",
                    moviePoster = "",
                    movieOverview = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                    movieReleaseDate = "February 7, 2019",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "60000000",
                    movieRevenue = "59213931"
                )
            )

            movies.add(
                Movie(
                    movieId = 5,
                    movieTitle = "Creed II",
                    moviePoster = "",
                    movieOverview = "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                    movieReleaseDate = "November 21, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "50000000",
                    movieRevenue = "137944327"
                )
            )

            movies.add(
                Movie(
                    movieId = 6,
                    movieTitle = "Fantastic Beasts: The Crimes of Grindelwald",
                    moviePoster = "",
                    movieOverview = "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                    movieReleaseDate = "November 14, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "200000000",
                    movieRevenue = "653355901"
                )
            )

            movies.add(
                Movie(
                    movieId = 7,
                    movieTitle = "Glass",
                    moviePoster = "",
                    movieOverview = "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                    movieReleaseDate = "January 16, 2019",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "20000000",
                    movieRevenue = "246941965"
                )
            )

            movies.add(
                Movie(
                    movieId = 8,
                    movieTitle = "How to Train Your Dragon",
                    moviePoster = "",
                    movieOverview = "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father",
                    movieReleaseDate = "March 10, 2010",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "165000000",
                    movieRevenue = "494878759"
                )
            )

            movies.add(
                Movie(
                    movieId = 9,
                    movieTitle = "Avengers: Infinity War",
                    moviePoster = "",
                    movieOverview = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    movieReleaseDate = "April 25, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "300000000",
                    movieRevenue = "2046239637"
                )
            )

            movies.add(
                Movie(
                    movieId = 10,
                    movieTitle = "Mary Queen of Scots",
                    moviePoster = "",
                    movieOverview = "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                    movieReleaseDate = "December 7, 2018",
                    movieLanguage = "English",
                    movieDuration = "120",
                    movieGenres = listOf("crime"),
                    movieBudget = "25000000",
                    movieRevenue = "37807625"
                )
            )


            return movies
        }

        fun getTvShowList(): List<TvShow> {
            val tvShows = mutableListOf<TvShow>()
            tvShows.add(
                TvShow(
                    tvShowId = 0,
                    tvShowTitle = "Arrow",
                    tvShowPoster = "",
                    tvShowOverview = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                    tvShowReleaseDate = "October 10, 2012",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Returning Series"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 1,
                    tvShowTitle = "Doom Patrol",
                    tvShowPoster = "",
                    tvShowOverview = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                    tvShowReleaseDate = "February 15, 2019",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Returning Series"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 2,
                    tvShowTitle = "Dragon Ball",
                    tvShowPoster = "",
                    tvShowOverview = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                    tvShowReleaseDate = "February 26, 1986",
                    tvShowLanguage = "Japanese",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Ended"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 3,
                    tvShowTitle = "Fairy Tail",
                    tvShowPoster = "",
                    tvShowOverview = "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                    tvShowReleaseDate = "October 12, 2009",
                    tvShowLanguage = "Japanese",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Ended"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 4,
                    tvShowTitle = "Family Guy",
                    tvShowPoster = "",
                    tvShowOverview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                    tvShowReleaseDate = "January 31, 1999",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Returning Series"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 5,
                    tvShowTitle = "The Flash",
                    tvShowPoster = "",
                    tvShowOverview = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                    tvShowReleaseDate = "October 7, 2014",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Returning Series"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 6,
                    tvShowTitle = "Gotham",
                    tvShowPoster = "",
                    tvShowOverview = "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                    tvShowReleaseDate = "September 22, 2014",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Ended"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 7,
                    tvShowTitle = "Grey Anatomy",
                    tvShowPoster = "",
                    tvShowOverview = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                    tvShowReleaseDate = "March 27, 2005",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Returning Series"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 8,
                    tvShowTitle = "Hanna",
                    tvShowPoster = "",
                    tvShowOverview = "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                    tvShowReleaseDate = "March 28, 2019",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Returning Series"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 9,
                    tvShowTitle = "Marvel Iron Fist",
                    tvShowPoster = "",
                    tvShowOverview = "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                    tvShowReleaseDate = "March 17, 2017",
                    tvShowLanguage = "English",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Canceled"
                )
            )

            tvShows.add(
                TvShow(
                    tvShowId = 10,
                    tvShowTitle = "Naruto Shippuden",
                    tvShowPoster = "",
                    tvShowOverview = "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                    tvShowReleaseDate = "February 15, 2007",
                    tvShowLanguage = "Japanese",
                    tvShowDuration = "22",
                    tvShowGenres = listOf("animation"),
                    tvShowType = "Scripted",
                    tvShowStatus = "Ended"
                )
            )
            return tvShows
        }

        fun getMovieResponse(): MovieResponse =
            MovieResponse(
                listOf(
                    MovieResponse.MovieData(

                    )
                )
            )
    }

}