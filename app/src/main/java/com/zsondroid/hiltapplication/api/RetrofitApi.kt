package com.zsondroid.hiltapplication.api

import com.zsondroid.hiltapplication.data.Emoji
import retrofit2.http.GET

interface RetrofitApi {

    @GET("random")
    suspend fun getRandomEmojiData(): Emoji
}