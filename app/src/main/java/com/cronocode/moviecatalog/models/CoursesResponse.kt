package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class CoursesResponse(
    //@SerializedName is used to map the POJO object into to JSON response properties.
    @SerializedName("status")
    val status: Int?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("data")
    val courses: List<Courses1>,
    @SerializedName("total")
    val total: Int?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("currentPage")
    val currentPage: Int?
)