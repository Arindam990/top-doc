package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Courses1(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("keyFeatures")
    val keyFeatures: String?,
    @SerializedName("category")
    val category: String?,
    @SerializedName("keywords")
    val keywords: String?,
    @SerializedName("instructorName")
    val instructorName: String?,
    @SerializedName("deleted")
    val deleted: Boolean?,
    @SerializedName("popular")
    val popular: Boolean?,
    @SerializedName("meetup")
    val meetup: Boolean?,
    @SerializedName("rating")
    val rating: Double?,
    @SerializedName("reviewCount")
    val reviewCount: Int?,
    @SerializedName("enrollmentCount")
    val enrollmentCount: Int?,
    @SerializedName("duration")
    val duration: Long?,
    @SerializedName("courseCategory")
    val courseCategory: List<CourseCategory>,
    @SerializedName("courseVideo")
    val courseVideo: List<CourseVideo>?,
    @SerializedName("courseMeetup")
    val courseMeetup: List<CourseMeetUps>?,
    @SerializedName("courseQuiz")
    val courseQuiz: List<CourseQuiz>,
    @SerializedName("keyFeaturesObject")
    val keyFeaturesObject: List<KeyFeatures>,
    @SerializedName("instructor")
    val instructor: Instructor,
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
    val previewVideoThumbnail: String,
    @SerializedName("previewVideoThumbnailOrig")
    val previewVideoThumbnailOrig: String?,
    @SerializedName("startDate")
    val startDate: Long?,
    @SerializedName("endDate")
    val endDate: Long?,
    @SerializedName("enrollmentLastDate")
    val enrollmentLastDate: Long?,
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
    val isEnrolled: Boolean,
    @SerializedName("meetupExpiryDate")
    val meetupExpiryDate:Long?,
    @SerializedName("createdDate")
    val createdDate: Long?,
    @SerializedName("modifiedDate")
    val modifiedDate: Long,
    @SerializedName("courseDuration")
    val courseDuration:Long?,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("limitEnrollment")
    val limitEnrollment: Boolean?,
    @SerializedName("numberOfSeats")
    val numberOfSeats: Int?,
    @SerializedName("certificateAvailable")
    val certificateAvailable: Boolean?,


    ) : Serializable