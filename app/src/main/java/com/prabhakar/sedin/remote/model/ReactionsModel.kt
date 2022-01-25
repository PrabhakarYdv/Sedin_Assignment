package com.prabhakar.sedin.remote.model


import com.google.gson.annotations.SerializedName


data class ReactionsModel(

    @field:SerializedName("confused")
    val confused: Int? = null,

    @field:SerializedName("-1")
    val jsonMember1: Int? = null,

    @field:SerializedName("total_count")
    val totalCount: Int? = null,

    @field:SerializedName("+1")
    val jsonMember11: Int? = null,

    @field:SerializedName("rocket")
    val rocket: Int? = null,

    @field:SerializedName("hooray")
    val hooray: Int? = null,

    @field:SerializedName("eyes")
    val eyes: Int? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("laugh")
    val laugh: Int? = null,

    @field:SerializedName("heart")
    val heart: Int? = null
)