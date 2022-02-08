package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.models.CoursesResponse
import com.cronocode.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import com.google.gson.GsonBuilder


interface ApiInterfaceTopDoc {
   // inside get we are putting end point of url
    @GET("eduservice/api/v1/courses/filter?keyword=new_arrivals&sortBy=NEWEST&size=10&page=0")
    abstract fun getCourses() : Call<CoursesResponse>


    companion object {

        var BASE_URL = "https://api.top-doc.com/"
        var gson = GsonBuilder()
            .setLenient()
            .create()

        fun create() : ApiInterfaceTopDoc {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return retrofit.create(ApiInterfaceTopDoc::class.java)

        }
    }
}