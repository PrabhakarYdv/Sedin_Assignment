package com.prabhakar.sedin

import retrofit2.http.GET

interface APIService {
    @GET(Constraint.END_POINT)
    fun getDetails():ResponseModel
}