package com.cronocode.moviecatalog.models

import com.google.gson.annotations.SerializedName

data class KeyFeatures(
    @SerializedName("orderBy")
    val orderBy: Int?,
    @SerializedName("name")
    val name: String?,

    )
