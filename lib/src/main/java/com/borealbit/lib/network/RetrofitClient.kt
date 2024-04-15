package com.borealbit.lib.network

import retrofit2.Retrofit

object RetrofitClient {
    private const val BASE_URL = "https://api.example.com/"

    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()

        retrofit.create(ApiService::class.java)
    }
}
