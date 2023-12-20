package com.zsondroid.hiltapplication.data


import com.google.gson.annotations.SerializedName

data class ParkingPlaceData(
    @SerializedName("ParkingPlace")
    val parkingPlace: List<ParkingPlace>
)