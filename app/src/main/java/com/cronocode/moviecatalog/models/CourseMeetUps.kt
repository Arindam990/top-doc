package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class CourseMeetUps(
    @SerializedName("orderBy")
    val orderBy: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("curriculumId")
    val curriculumId: Int?,
    @SerializedName("curriculumType")
    val curriculumType: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("startTime")
    val startTime: String?,
    @SerializedName("endTime")
    val endTime: String?,
    @SerializedName("timeZone")
    val timeZone: String?,
    @SerializedName("keywords")
    val keywords: String?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("instructorName")
    val instructorName: String?,
    @SerializedName("deleted")
    val deleted: Boolean?,
    @SerializedName("startingDate")
    val startingDate: Int?,
    //@SerializedName("createdDate")
    //val createdDate: Int?,
    // @SerializedName("modifiedDate")
    // val modifiedDate: Int?,
    // @SerializedName("meetupDuration")
    //val meetupDuration: Int?,
    //@SerializedName("startDateTime")
    //val startDateTime: Int?,
    //@SerializedName("endDateTime")
    //val endDateTime: Int?,
    @SerializedName("instructorDto")
    // call the instructorDto class through object reference
    val instructorDto: InstructorDto?,

    )