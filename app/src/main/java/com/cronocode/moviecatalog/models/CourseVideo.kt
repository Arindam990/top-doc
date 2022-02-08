package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class CourseVideo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("orderBy")
    val orderBy: Int?,
    @SerializedName("curriculumId")
    val curriculumId: Int?,
    @SerializedName("curriculumType")
    val curriculumType: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("keywords")
    val keywords: String?,
    @SerializedName("thumbnail")
    val thumbnail: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("deleted")
    val deleted: Boolean?,
    @SerializedName("duration")
    val duration: Int?,
   // @SerializedName("createdDate")
   // val createdDate: Int?,
    //@SerializedName("modifiedDate")
    //val modifiedDate: Int?
)