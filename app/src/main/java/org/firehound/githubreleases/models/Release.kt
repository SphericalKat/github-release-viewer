package org.firehound.githubreleases.models
import com.google.gson.annotations.SerializedName


data class Release(
    @SerializedName("assets")
    val assets: List<Asset> = listOf(),
    @SerializedName("assets_url")
    val assetsUrl: String = "",
    @SerializedName("author")
    val author: Author = Author(),
    @SerializedName("body")
    val body: String = "",
    @SerializedName("created_at")
    val createdAt: String = "",
    @SerializedName("draft")
    val draft: Boolean = false,
    @SerializedName("html_url")
    val htmlUrl: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("node_id")
    val nodeId: String = "",
    @SerializedName("prerelease")
    val prerelease: Boolean = false,
    @SerializedName("published_at")
    val publishedAt: String = "",
    @SerializedName("tag_name")
    val tagName: String = "",
    @SerializedName("tarball_url")
    val tarballUrl: String = "",
    @SerializedName("target_commitish")
    val targetCommitish: String = "",
    @SerializedName("upload_url")
    val uploadUrl: String = "",
    @SerializedName("url")
    val url: String = "",
    @SerializedName("zipball_url")
    val zipballUrl: String = ""
) {
    data class Asset(
        @SerializedName("browser_download_url")
        val browserDownloadUrl: String = "",
        @SerializedName("content_type")
        val contentType: String = "",
        @SerializedName("created_at")
        val createdAt: String = "",
        @SerializedName("download_count")
        val downloadCount: Int = 0,
        @SerializedName("id")
        val id: Int = 0,
        @SerializedName("label")
        val label: String = "",
        @SerializedName("name")
        val name: String = "",
        @SerializedName("node_id")
        val nodeId: String = "",
        @SerializedName("size")
        val size: Int = 0,
        @SerializedName("state")
        val state: String = "",
        @SerializedName("updated_at")
        val updatedAt: String = "",
        @SerializedName("uploader")
        val uploader: Uploader = Uploader(),
        @SerializedName("url")
        val url: String = ""
    ) {
        data class Uploader(
            @SerializedName("avatar_url")
            val avatarUrl: String = "",
            @SerializedName("events_url")
            val eventsUrl: String = "",
            @SerializedName("followers_url")
            val followersUrl: String = "",
            @SerializedName("following_url")
            val followingUrl: String = "",
            @SerializedName("gists_url")
            val gistsUrl: String = "",
            @SerializedName("gravatar_id")
            val gravatarId: String = "",
            @SerializedName("html_url")
            val htmlUrl: String = "",
            @SerializedName("id")
            val id: Int = 0,
            @SerializedName("login")
            val login: String = "",
            @SerializedName("node_id")
            val nodeId: String = "",
            @SerializedName("organizations_url")
            val organizationsUrl: String = "",
            @SerializedName("received_events_url")
            val receivedEventsUrl: String = "",
            @SerializedName("repos_url")
            val reposUrl: String = "",
            @SerializedName("site_admin")
            val siteAdmin: Boolean = false,
            @SerializedName("starred_url")
            val starredUrl: String = "",
            @SerializedName("subscriptions_url")
            val subscriptionsUrl: String = "",
            @SerializedName("type")
            val type: String = "",
            @SerializedName("url")
            val url: String = ""
        )
    }

    data class Author(
        @SerializedName("avatar_url")
        val avatarUrl: String = "",
        @SerializedName("events_url")
        val eventsUrl: String = "",
        @SerializedName("followers_url")
        val followersUrl: String = "",
        @SerializedName("following_url")
        val followingUrl: String = "",
        @SerializedName("gists_url")
        val gistsUrl: String = "",
        @SerializedName("gravatar_id")
        val gravatarId: String = "",
        @SerializedName("html_url")
        val htmlUrl: String = "",
        @SerializedName("id")
        val id: Int = 0,
        @SerializedName("login")
        val login: String = "",
        @SerializedName("node_id")
        val nodeId: String = "",
        @SerializedName("organizations_url")
        val organizationsUrl: String = "",
        @SerializedName("received_events_url")
        val receivedEventsUrl: String = "",
        @SerializedName("repos_url")
        val reposUrl: String = "",
        @SerializedName("site_admin")
        val siteAdmin: Boolean = false,
        @SerializedName("starred_url")
        val starredUrl: String = "",
        @SerializedName("subscriptions_url")
        val subscriptionsUrl: String = "",
        @SerializedName("type")
        val type: String = "",
        @SerializedName("url")
        val url: String = ""
    )
}