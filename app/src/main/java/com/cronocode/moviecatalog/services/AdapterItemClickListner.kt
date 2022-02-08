package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.TopDocAdapter
import com.cronocode.moviecatalog.models.CoursesResponse
import com.cronocode.moviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import com.google.gson.GsonBuilder


interface AdapterItemClickListner {

        fun onItemClick(position: Int?)
}
