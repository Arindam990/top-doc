package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=c62827c7a1e82704a573ec6d34a8c942")
    fun getMovieList(): Call<MovieResponse>
}