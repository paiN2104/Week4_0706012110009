package com.rey.week4retrofit.repository

import com.rey.week4retrofit.retrofit.EndPointApi
import javax.inject.Inject

class MoviesRepository @Inject constructor(private val api: EndPointApi) {

    suspend fun getNowPlayingData(apiKey: String, language: String, page: Int) = api.getNowPlaying(apiKey,language, page)

    suspend fun getMovieDetailResults(apiKey: String, movieid: Int) = api.getMovieDetails(movieid,apiKey)
}