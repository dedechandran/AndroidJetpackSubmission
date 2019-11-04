package com.example.androidjetpacksubmission.ui.home.tvshow


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseFragment


class TvShowFragment : BaseFragment() {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//
//    private var tvShowViewModel: TvShowViewModel? = null
//    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tv_show, container, false)
//        tvShowAdapter = TvShowAdapter{
//            Intent(context,TvShowDetailActivity::class.java).run {
//                putExtra(EXTRA_TV_SHOW_ID,it.tvShowId)
//                startActivity(this)
//            }
//        }
//
//        view.tvShowRecyclerView.apply {
//            layoutManager = LinearLayoutManager(context)
//            adapter = tvShowAdapter
//        }
//
//        tvShowViewModel = activity?.run {
//            ViewModelProviders.of(this,viewModelFactory)[TvShowViewModel::class.java]
//        }
//        tvShowAdapter.setData(tvShowViewModel?.loadTvShows())
        return view
    }


}
