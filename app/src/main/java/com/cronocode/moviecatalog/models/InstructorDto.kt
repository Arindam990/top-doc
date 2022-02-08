package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class InstructorDto(
    @SerializedName("id")
    val id:Int?,
    //@SerializedName("createdDate")
    //val createdDate:Int?,
    //@SerializedName("modifiedDate")
    //val modifiedDate:Int?,
    @SerializedName("name")
    val name:String?,
    @SerializedName("description")
    val description:String?,
    @SerializedName("image")
    val image:String?,
    @SerializedName("signatureFile")
    val signatureFile:String?,
    @SerializedName("deleted")
    val deleted:Boolean?,
    @SerializedName("totalCourses")
    val totalCourses:Int?

)