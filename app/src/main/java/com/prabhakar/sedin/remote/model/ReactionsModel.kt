package com.prabhakar.sedin.remote.model

import com.google.gson.annotations.SerializedName

data class ReactionsModel(
    @SerializedName("url") val url: String,
    @SerializedName("total_count") val total_count: Int,
//	@SerializedName("+1") val +1 : Int,
//	@SerializedName("-1") val -1 : Int,
    @SerializedName("laugh") val laugh: Int,
    @SerializedName("hooray") val hooray: Int,
    @SerializedName("confused") val confused: Int,
    @SerializedName("heart") val heart: Int,
    @SerializedName("rocket") val rocket: Int,
    @SerializedName("eyes") val eyes: Int
)