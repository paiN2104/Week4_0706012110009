package com.rey.week4retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.rey.week4retrofit.adapter.GenreAdapter
import com.rey.week4retrofit.adapter.NowPlayingAdapter
import com.rey.week4retrofit.adapter.languageAdapter
import com.rey.week4retrofit.adapter.prodCompAdapter
import com.rey.week4retrofit.databinding.ActivityMovieDetailBinding
import com.rey.week4retrofit.helper.Const
import com.rey.week4retrofit.model.Genre
import com.rey.week4retrofit.viewmodel.MoviesViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext

@AndroidEntryPoint
class MovieDetail : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDetailBinding
    private lateinit var adapter: GenreAdapter
    private lateinit var adapter2: prodCompAdapter
    private lateinit var adapter3: languageAdapter
    private lateinit var nowPlayingViewModel: MoviesViewModel
    private lateinit var viewModel: MoviesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val movieId = intent.getIntExtra("movie_id",0)
        Toast.makeText(applicationContext,"Movie ID: ${movieId}",Toast.LENGTH_SHORT).show()


        viewModel = ViewModelProvider(this)[MoviesViewModel::class.java]
        viewModel.getMovieDetail(Const.API_KEY,movieId)
        viewModel.movieDetails.observe(this, Observer {
            response ->
            if(response != null){
                binding.bgDetail.visibility = View.INVISIBLE
                binding.tvTitleMovieDetail.apply {
                    text = response.title
                }
                binding.GenreRV.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
                adapter = GenreAdapter(response.genres as List<Genre>)
                binding.GenreRV.adapter = adapter

                binding.ProdRv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
                adapter2 = prodCompAdapter(response.production_companies)
                binding.ProdRv.adapter = adapter2

                binding.LangRV.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
                adapter3 = languageAdapter(response.spoken_languages)
                binding.LangRV.adapter = adapter3

                binding.descTv.apply {
                    text = response.overview
                }

                Glide.with(applicationContext)
                    .load(Const.IMG_URL + response.backdrop_path)
                    .into(binding.imgPosterMovieDetail)
            }else{
                binding.bgDetail.visibility = View.VISIBLE
            }

        })
        nowPlayingViewModel = ViewModelProvider(this)[MoviesViewModel::class.java]
    }
}