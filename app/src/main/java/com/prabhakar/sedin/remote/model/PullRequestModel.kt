package com.prabhakar.sedin.remote.model


import com.google.gson.annotations.SerializedName

data class PullRequestModel(

    @field:SerializedName("patch_url")
    val patchUrl: String? = null,

    @field:SerializedName("html_url")
    val htmlUrl: String? = null,

    @field:SerializedName("merged_at")
    val mergedAt: String? = null,

    @field:SerializedName("diff_url")
    val diffUrl: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)