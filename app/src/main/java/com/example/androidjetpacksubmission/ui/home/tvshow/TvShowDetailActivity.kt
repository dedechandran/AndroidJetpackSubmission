package com.example.androidjetpacksubmission.ui.home.tvshow

import android.os.Bundle
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity

class TvShowDetailActivity : BaseActivity() {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//
//    private var tvShowViewModel: TvShowViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_show_detail)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = resources.getString(R.string.tv_show_detail_title)
        }
//
//        tvShowViewModel = ViewModelProviders.of(this, viewModelFactory)[TvShowViewModel::class.java]
//
//        val tvShowId = intent.getIntExtra(EXTRA_TV_SHOW_ID, 0)
//        showTvShowDetail(tvShowId)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == android.R.id.home) {
//            finish()
//        }
//        return super.onOptionsItemSelected(item)
//    }
//
//    private fun showTvShowDetail(tvShowId: Int) {
//        val tvShow = tvShowViewModel?.getTvShowDetail(tvShowId)
//
//        detailTextTvShowTitle.text = tvShow?.tvShowTitle
//        detailTextTvShowDate.text = tvShow?.tvShowReleaseDate
//        Glide.with(this)
//            .load(tvShow?.tvShowPoster)
//            .into(detailTvShowImage)
//        detailTextTvShowOverview.text = tvShow?.tvShowOverview
//        detailTextTvShowDuration.text = tvShow?.tvShowDuration
//        detailTextTvShowLanguage.text = tvShow?.tvShowLanguage
//        detailTextTvShowType.text = tvShow?.tvShowType
//        detailTextTvShowStatus.text = tvShow?.tvShowStatus
//        showGenres(tvShow?.tvShowGenres?.split(";")!!)
//
//    }
//
//    private fun showGenres(genres: List<String>){
//        for(i in genres.indices){
//            val genreView = layoutInflater.inflate(R.layout.genre_item,detailTvShowGenresContainer) as FlexboxLayout
//            val genreText = genreView.getChildAt(i) as TextView
//            genreText.text = genres[i]
//        }
//    }
}
