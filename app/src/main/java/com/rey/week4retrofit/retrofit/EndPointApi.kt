package com.rey.week4retrofit.retrofit

import com.rey.week4retrofit.model.MovieDetails
import com.rey.week4retrofit.model.NowPlaying
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EndPointApi {

    @GET("movie/now_playing")
    suspend fun getNowPlaying(
        @Query("api_key") apikey: String,
        @Query("language") language: String,
        @Query("page") page : Int
    ): Response<NowPlaying>

    @GET("movie/{id}")
    suspend fun getMovieDetails(
        @Path("id") id:Int,
        @Query("api_key") apikey: String
    ): Response<MovieDetails>

}