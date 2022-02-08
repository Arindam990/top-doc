package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import com.google.gson.GsonBuilder


interface ApiInterface {

    @GET("/3/movie/popular?api_key=c62827c7a1e82704a573ec6d34a8c942")
    fun getMovies() : Call<MovieResponse>


    companion object {

        var BASE_URL = "https://api.themoviedb.org"
        var gson = GsonBuilder()
            .setLenient()
            .create()

        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}