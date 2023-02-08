package com.example.imdb_deadlygray.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientPopular {
    companion object {

        var client: ApiPoup? = null

        private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build()

        fun getInstance(): ApiPoup {
            if (client == null) {
                client = Retrofit.Builder()
                    .baseUrl(Credentials.baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build()
                    .create(ApiPoup::class.java)
            }
            return client!!
        }
    }
}
