package org.firehound.githubreleases.api.releases

import org.firehound.githubreleases.models.Release
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ReleaseApiService {
    @GET("repos/{user}/{repo}/releases")
    suspend fun getReleases(
        @Path("user") user: String,
        @Path("repo") repo: String
    ): Response<List<Release>>
}