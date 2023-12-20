package com.zsondroid.hiltapplication.api

import com.zsondroid.hiltapplication.data.Emoji
import com.zsondroid.hiltapplication.data.ParkingPlaceData
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface RetrofitApi {

    @GET("random")
    suspend fun getRandomEmojiData(): Emoji

    @GET("ParkingPlace")
    @Headers("Content-type: application/json")
    suspend fun getParkingPlaceData(
        @Query("KEY") key: String,
        @Query("Type") type: String,
        @Query("pIndex") index: String,
        @Query("pSize") size: String,
        @Query("SIGUN_NM") sigun: String
    ) : ParkingPlaceData

}