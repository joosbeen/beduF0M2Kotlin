package com.example.app.beduf0m2kotlin.models

import com.google.gson.annotations.SerializedName

class Wind(

    @SerializedName("speed") var speed: Double? = null,
    @SerializedName("deg") var deg: Int? = null,
    @SerializedName("gust") var gust: Double? = null

)