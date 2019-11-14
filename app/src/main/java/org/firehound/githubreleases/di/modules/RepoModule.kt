package org.firehound.githubreleases.di.modules

import org.firehound.githubreleases.repo.ReleaseRepo
import org.koin.dsl.module

val repoModule = module {
    factory { ReleaseRepo(get()) }
}