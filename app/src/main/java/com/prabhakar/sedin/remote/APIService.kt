package com.prabhakar.sedin.remote

import com.prabhakar.sedin.remote.model.ResponseModel
import com.prabhakar.sedin.util.Constraint
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("issues")
    fun getDetails(@Query("state")state:String): Call<MutableList<ResponseModel>>
}
/*
Query = ?state=all
 */