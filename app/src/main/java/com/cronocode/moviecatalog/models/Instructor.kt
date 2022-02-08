package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class Instructor(
    @SerializedName("id")
    val id: Int?,
   // @SerializedName("createdDate")
    //val createdDate: Int?,
    //@SerializedName("modifiedDate")
    //val modifiedDate: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("signatureFile")
    val signatureFile: String?,
    @SerializedName("deleted")
    val deleted: Boolean?,
    @SerializedName("totalCourses")
    val totalCourses: Int?,

    @SerializedName("coverImage")
    val coverImage: String?,
    @SerializedName("coverImageOrig")
    val coverImageOrig: String?,
    @SerializedName("thumbnail")
    val thumbnail: String?,
    @SerializedName("thumbnailOrig")
    val thumbnailOrig: String?,
    @SerializedName("previewVideoId")
    val previewVideoId: String?,
    @SerializedName("previewVideoUrl")
    val previewVideoUrl: String?,
    @SerializedName("previewVideoUrlOrig")
    val previewVideoUrlOrig: String?,
    @SerializedName("previewVideoThumbnail")
    val previewVideoThumbnail: String?,
    @SerializedName("previewVideoThumbnailOrig")
    val previewVideoThumbnailOrig: String?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("enrollmentLastDate")
    val enrollmentLastDate: String?,
    @SerializedName("price")
    val price: Int?,
    @SerializedName("isPartOfMembership")
    val isPartOfMembership: Boolean?,
    @SerializedName("reviewGiven")
    val reviewGiven: Boolean?,
    @SerializedName("progressStatus")
    val progressStatus: String?,
    @SerializedName("percentageCompletion")
    val percentageCompletion: Int?,
    @SerializedName("userProgress")
    val userProgress: Int?,
    @SerializedName("isFavorite")
    val isFavorite: Boolean?,
    @SerializedName("isEnrolled")
    val isEnrolled: Boolean?,
    @SerializedName("meetupExpiryDate")
    val meetupExpiryDate: Int?,
   // @SerializedName("createdDate")
    //val createdDate: Int?,
    //@SerializedName("modifiedDate")
    //val modifiedDate: Int?,
    //@SerializedName("courseDuration")
    //val courseDuration: Int?,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("limitEnrollment")
    val limitEnrollment: Boolean?,
    @SerializedName("numberOfSeats")
    val numberOfSeats: Int?,
    @SerializedName("certificateAvailable")
    val certificateAvailable: Boolean?


)