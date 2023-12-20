package com.zsondroid.hiltapplication.data


import com.google.gson.annotations.SerializedName

data class Head(
    @SerializedName("api_version")
    val apiVersion: String,
    @SerializedName("list_total_count")
    val listTotalCount: Int,
    @SerializedName("RESULT")
    val result: RESULT
)