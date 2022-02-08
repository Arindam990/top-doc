package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class MeetUps(
    @SerializedName("id")
    val id:String?,
    @SerializedName("curriculumType")
    val curriculumType:String?,
    @SerializedName("title")
    val title:String?,
    @SerializedName("Date")
    val Date:String?,
    @SerializedName("startTime")
    val startTime:String?,
    @SerializedName("endTime")
    val endTime:String?,
    @SerializedName("timeZone")
    val timeZone:String?,
    @SerializedName("instructorName")
    val instructorName:String?,
    @SerializedName("startDateTime")
    val startDateTime:String?,
    @SerializedName("endDateTime")
    val endDateTime:String?
)