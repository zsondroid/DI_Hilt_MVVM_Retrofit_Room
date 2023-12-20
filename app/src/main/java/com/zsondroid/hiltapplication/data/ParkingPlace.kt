package com.zsondroid.hiltapplication.data


import com.google.gson.annotations.SerializedName

data class ParkingPlace(
    @SerializedName("head")
    val head: List<Head>,
    @SerializedName("row")
    val row: List<Row>
)