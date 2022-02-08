package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class Courses(
    @SerializedName("id")
    val id:String?,
    @SerializedName("keywords")
    val keywords:String?,
    @SerializedName("title")
    val title:String?,
    @SerializedName("categories")
    val categories:String?,
    @SerializedName("popular")
    val popular:Boolean,
    @SerializedName("meetup")
    val meetup:Boolean,
    @SerializedName("price")
    val price:Int?,
    @SerializedName("rating")
    val rating:Float?,
    @SerializedName("reviewCount")
    val reviewCount:String?,
    @SerializedName("sku")
    val sku:String?,
    @SerializedName("thumbnail")
    val thumbnail:String?,
    @SerializedName("startDate")
    val startDate:String?,
    @SerializedName("endDate")
    val endDate:String?,
    @SerializedName("enrollmentLastDate")
    val enrollmentLastDate:String?,
    @SerializedName("isPartOfMembership")
    val isPartOfMembership:Boolean?,
    @SerializedName("reviewGiven")
    val reviewGiven:Boolean?,
    @SerializedName("instructorName")
    val instructorName:String?,
    @SerializedName("courseDuration")
    val courseDuration:String?,
    @SerializedName("meetupExpiryDate")
    val meetupExpiryDate:String?,
    // create MeetUps array
    @SerializedName("meetups")
    val meetUps:ArrayList<MeetUps>


)