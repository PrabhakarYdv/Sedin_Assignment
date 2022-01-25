package com.prabhakar.sedin.remote.model


import com.google.gson.annotations.SerializedName

data class ResponseModel(

    @field:SerializedName("assignees")
    val assignees: List<Any?>? = null,

    @field:SerializedName("created_at")
    val createdAt: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("body")
    val body: String? = null,

    @field:SerializedName("labels_url")
    val labelsUrl: String? = null,

    @field:SerializedName("author_association")
    val authorAssociation: String? = null,

    @field:SerializedName("number")
    val number: Int? = null,

    @field:SerializedName("updated_at")
    val updatedAt: String? = null,

    @field:SerializedName("draft")
    val draft: Boolean? = null,

    @field:SerializedName("comments_url")
    val commentsUrl: String? = null,

    @field:SerializedName("repository_url")
    val repositoryUrl: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("state")
    val state: String? = null,

    @field:SerializedName("locked")
    val locked: Boolean? = null,

    @field:SerializedName("timeline_url")
    val timelineUrl: String? = null,

    @field:SerializedName("pull_request")
    val pullRequest: PullRequestModel? = null,

    @field:SerializedName("comments")
    val comments: Int? = null,

    @field:SerializedName("closed_at")
    val closedAt: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("labels")
    val labels: List<Any?>? = null,

    @field:SerializedName("events_url")
    val eventsUrl: String? = null,

    @field:SerializedName("html_url")
    val htmlUrl: String? = null,

    @field:SerializedName("reactions")
    val reactions: ReactionsModel? = null,

    @field:SerializedName("user")
    val user: UserModel? = null,

    @field:SerializedName("node_id")
    val nodeId: String? = null
)