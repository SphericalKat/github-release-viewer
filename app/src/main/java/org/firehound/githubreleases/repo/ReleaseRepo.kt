package org.firehound.githubreleases.repo

import org.firehound.githubreleases.api.releases.ReleaseApiClient

class ReleaseRepo(private val webClient: ReleaseApiClient): BaseRepo() {

    fun getReleases(user: String, repo: String) = makeRequest {
        webClient.getReleases(user, repo)
    }
}