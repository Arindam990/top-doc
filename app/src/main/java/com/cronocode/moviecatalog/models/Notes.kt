package com.cronocode.moviecatalog.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable
import java.util.*

@Entity(tableName = "Notes")
class Notes (
    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @SerializedName("title")
    var title: String,
    @SerializedName("subtitle")
    var subtitle: String,
    @SerializedName("note")
    var note:String,
    @SerializedName("data")
    var date:String,
    @SerializedName("priority")
    var priority:String

):Serializable
