package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("id")
    val id: Int.Companion,
    @SerializedName("createdDate")
    val createdDate: Long.Companion,
    @SerializedName("modifiedDate")
    val modifiedDate: Long.Companion,
    @SerializedName("description")
    val description: String.Companion,
    @SerializedName("name")
    val name:String?,

    )