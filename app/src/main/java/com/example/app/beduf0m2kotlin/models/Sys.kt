package com.example.app.beduf0m2kotlin.models

import com.google.gson.annotations.SerializedName

class Sys(

    @SerializedName("country") var country: String? = null,
    @SerializedName("sunrise") var sunrise: Int? = null,
    @SerializedName("sunset") var sunset: Int? = null

)