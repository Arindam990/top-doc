package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class KeyFeaturesObject(

    @SerializedName("timeZone")
    val timeZone:String?,
    @SerializedName("instructorName")
    val instructorName:String?,
    @SerializedName("startDateTime")
    val startDateTime:String?,
    @SerializedName("endDateTime")
    val endDateTime:String?
)