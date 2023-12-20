package com.zsondroid.hiltapplication.model

import com.zsondroid.hiltapplication.api.RetrofitApi
import com.zsondroid.hiltapplication.base.AuthKey
import javax.inject.Inject

class RetrofitRepository @Inject constructor (private val retrofitApi: RetrofitApi) {

    suspend fun getRandomEmojiData() = retrofitApi.getRandomEmojiData()

    suspend fun getParkingPlaceData(key: String, type: String, index: String, size: String, city: String) = retrofitApi.getParkingPlaceData(key, type, index, size, city)
}