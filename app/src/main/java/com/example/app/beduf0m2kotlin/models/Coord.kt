package com.example.app.beduf0m2kotlin.models

import com.google.gson.annotations.SerializedName

class Coord (
    @SerializedName("lon" ) var lon : Double? = null,
    @SerializedName("lat" ) var lat : Double? = null
)