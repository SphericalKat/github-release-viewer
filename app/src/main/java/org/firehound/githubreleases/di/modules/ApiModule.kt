package org.firehound.githubreleases.di.modules

import org.firehound.githubreleases.api.getOkHttpClient
import org.firehound.githubreleases.api.releases.ReleaseApiClient
import org.firehound.githubreleases.api.releases.ReleaseApiService
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://api.github.com/"

val apiModule = module {
    factory { getOkHttpClient(androidContext()) } // okHttpClient factory

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    } // get a retrofit instance for the given base url

    factory { get<Retrofit>().create(ReleaseApiService::class.java) } // get a webservice instance

    factory { ReleaseApiClient(get()) } // get our final web client
}