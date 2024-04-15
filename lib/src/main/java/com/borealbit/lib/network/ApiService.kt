package com.borealbit.lib.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("endpoint")
    fun <DataModel> getData(): Call<List<DataModel>>
}