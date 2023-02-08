package com.example.imdb_deadlygray.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientLatest {
    companion object {

        var client: ApiLatest? = null

        private val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build()

        fun getInstance(): ApiLatest {
            if (client == null) {
                client = Retrofit.Builder()
                    .baseUrl(Credentials.baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build()
                    .create(ApiLatest::class.java)
            }
            return client!!
        }
    }
}
