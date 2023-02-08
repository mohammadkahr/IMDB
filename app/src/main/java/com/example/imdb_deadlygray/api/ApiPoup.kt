package com.example.imdb_deadlygray.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiPoup  {

    @GET("/3/movie/popular")
    fun searchMovie(
        @Query("api_key") key: String,
        @Query("language") language: String = "en",
        @Query("page") page: String
    ): Call<List>

    @GET("/3/movie/popular")
    fun searchMovie(
        @Query("api_key") key: String,
    ): Call<List>
}