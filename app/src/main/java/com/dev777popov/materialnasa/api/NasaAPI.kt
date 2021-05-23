package com.dev777popov.materialnasa.api

import com.dev777popov.materialnasa.api.model.ImageDayData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaAPI {
    @GET("planetary/apod")
    fun getPictureOfTheDay(@Query("api_key") apiKey: String): Call<ImageDayData>
}