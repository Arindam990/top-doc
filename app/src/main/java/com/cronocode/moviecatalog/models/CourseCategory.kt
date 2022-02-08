package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class CourseCategory(
    @SerializedName("id")
    val id:Int?,
   // @SerializedName("createdDate")
    //val createdDate:Int?,
    //@SerializedName("modifiedDate")
    //val modifiedDate:Long?,
    @SerializedName("name")
    val name:String?,
    @SerializedName("shortName")
    val shortName:String?,
    @SerializedName("description")
    val description:String?,
    @SerializedName("image")
    val image:String?,
    @SerializedName("totalCourses")
    val totalCourses:Int?

)