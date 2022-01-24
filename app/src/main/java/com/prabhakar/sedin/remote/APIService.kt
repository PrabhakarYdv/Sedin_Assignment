package com.prabhakar.sedin.remote

import com.prabhakar.sedin.remote.model.ResponseModel
import com.prabhakar.sedin.util.Constraint
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET(Constraint.END_POINT)
    suspend fun getDetails(@Query("state") state: String): ResponseModel
}
/*
Query = ?state=all
 */