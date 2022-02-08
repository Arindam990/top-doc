package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.models.CoursesResponse
import com.cronocode.moviecatalog.models.MovieResponse
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

abstract class ApiClient {
    // companion object means no need to create instance or object call directly
    @GET("eduservice/api/v1/courses/keyword?keyword=popular&page=0&size=3")
    abstract fun getCourses() : Call<CoursesResponse>

    companion object {

        var BASE_URL = "https://qa-api.top-doc.com/"
        var gson = GsonBuilder()
            .setLenient()
            .create()

        fun create() : ApiClient {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return retrofit.create(ApiClient::class.java)

        }
    }
}