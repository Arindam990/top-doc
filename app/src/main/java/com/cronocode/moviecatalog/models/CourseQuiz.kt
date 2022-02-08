package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class CourseQuiz(
    @SerializedName("id")
    val id:Int?,
    @SerializedName("curriculumId")
    val curriculumId:Int?,
    @SerializedName("curriculumType")
    val curriculumType:String?,
    @SerializedName("name")
    val name:String?,
    @SerializedName("description")
    val description:String?,
    @SerializedName("orderBy")
    val orderBy:Int?,
    @SerializedName("keywords")
    val keywords:String?,
    @SerializedName("status")
    val status: Status?,
    @SerializedName("createdDate")
    val createdDate:Long?,
    @SerializedName("endDateTime")
    val endDateTime:String?
)