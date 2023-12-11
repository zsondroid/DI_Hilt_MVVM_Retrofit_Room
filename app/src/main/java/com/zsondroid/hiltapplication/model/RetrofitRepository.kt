package com.zsondroid.hiltapplication.model

import com.zsondroid.hiltapplication.api.RetrofitApi
import javax.inject.Inject

class RetrofitRepository @Inject constructor(private val retrofitApi: RetrofitApi) {

    suspend fun getRandomEmojiData() = retrofitApi.getRandomEmojiData()
}