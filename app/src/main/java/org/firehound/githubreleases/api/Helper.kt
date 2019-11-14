package org.firehound.githubreleases.api

import android.content.Context
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.firehound.githubreleases.BuildConfig
import java.util.concurrent.TimeUnit

fun getOkHttpClient(context: Context): OkHttpClient {

    val httpClient = OkHttpClient.Builder()

//    httpClient.addInterceptor { chain ->
//        val original = chain.request()
//        val requestBuilder = original.newBuilder()
//            .addHeader(
//                "x-access-token",
//                context.getString(R.string.access_token)
//            )
//        val request = requestBuilder.build()
//        return@addInterceptor chain.proceed(request)
//    }

    if (BuildConfig.DEBUG) {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpClient.addInterceptor(
            httpLoggingInterceptor.apply {
                httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            }
        )
    }

    return httpClient.readTimeout(60, TimeUnit.SECONDS)
        .connectTimeout(60, TimeUnit.SECONDS)
        .build()
}