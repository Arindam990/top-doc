package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.models.CoursesResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("eduservice/api/v1/courses/keyword?keyword=popular&page=0&size=3")
    fun getCourseList():Call<CoursesResponse>
}