package org.firehound.githubreleases.api.releases

import org.firehound.githubreleases.api.BaseApiClient

class ReleaseApiClient(private val webService: ReleaseApiService): BaseApiClient() {
    suspend fun getReleases(user: String, repo: String) = getResult {
        webService.getReleases(user, repo)
    }
}