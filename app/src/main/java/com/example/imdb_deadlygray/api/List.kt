package com.example.imdb_deadlygray.api

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

data class List(
    val page: Int,
    @SerializedName("results")
    val result2s: List<Result2>,
    val total_pages: Int,
    val total_results: Int
)
