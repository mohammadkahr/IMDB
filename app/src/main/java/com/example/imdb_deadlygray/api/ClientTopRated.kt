package com.example.imdb_deadlygray.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientTopRated {
    companion object {

        var client: ApiTopRa? = null

        private val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build()

        fun getInstance(): ApiTopRa {
            if (client == null) {
                client = Retrofit.Builder()
                    .baseUrl(Credentials.baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build()
                    .create(ApiTopRa::class.java)
            }
            return client!!
        }
    }
}
