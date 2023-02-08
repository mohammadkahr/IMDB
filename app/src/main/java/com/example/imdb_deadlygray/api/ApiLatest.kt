package com.example.imdb_deadlygray.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiLatest  {

    @GET("/3/movie/now_playing")
    fun searchMovieLatest(
        @Query("api_key") key: String,
        @Query("language") language: String = "en",
        @Query("page") page: String
    ): Call<List>

    @GET("/3/movie/now_playing")
    fun searchMovieLatest(
        @Query("api_key") key: String,
    ): Call<List>
}