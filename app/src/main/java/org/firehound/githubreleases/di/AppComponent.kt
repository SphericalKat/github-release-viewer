package org.firehound.githubreleases.di

import org.firehound.githubreleases.di.modules.apiModule
import org.firehound.githubreleases.di.modules.repoModule

val appComponent = listOf(
    apiModule,
    repoModule
)