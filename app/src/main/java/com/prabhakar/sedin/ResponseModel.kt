package com.prabhakar.sedin

import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("url") val url: String,
    @SerializedName("repository_url") val repository_url: String,
    @SerializedName("labels_url") val labels_url: String,
    @SerializedName("comments_url") val comments_url: String,
    @SerializedName("events_url") val events_url: String,
    @SerializedName("html_url") val html_url: String,
    @SerializedName("id") val id: Int,
    @SerializedName("node_id") val node_id: String,
    @SerializedName("number") val number: Int,
    @SerializedName("title") val title: String,
    @SerializedName("user") val user: UserModel,
    @SerializedName("labels") val labels: List<String>,
    @SerializedName("state") val state: String,
    @SerializedName("locked") val locked: Boolean,
    @SerializedName("assignee") val assignee: String,
    @SerializedName("assignees") val assignees: List<String>,
    @SerializedName("milestone") val milestone: String,
    @SerializedName("comments") val comments: Int,
    @SerializedName("created_at") val created_at: String,
    @SerializedName("updated_at") val updated_at: String,
    @SerializedName("closed_at") val closed_at: String,
    @SerializedName("author_association") val author_association: String,
    @SerializedName("active_lock_reason") val active_lock_reason: String,
    @SerializedName("draft") val draft: Boolean,
    @SerializedName("pull_request") val pull_request: PullRequestModel,
    @SerializedName("body") val body: String,
    @SerializedName("reactions") val reactions: ReactionsModel,
    @SerializedName("timeline_url") val timeline_url: String,
    @SerializedName("performed_via_github_app") val performed_via_github_app: String
)