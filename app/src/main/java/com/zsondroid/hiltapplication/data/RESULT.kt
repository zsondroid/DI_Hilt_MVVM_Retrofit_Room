package com.zsondroid.hiltapplication.data


import com.google.gson.annotations.SerializedName

data class RESULT(
    @SerializedName("CODE")
    val code: String,
    @SerializedName("MESSAGE")
    val message: String
)