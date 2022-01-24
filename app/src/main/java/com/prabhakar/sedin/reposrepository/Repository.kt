package com.prabhakar.sedin.reposrepository

import android.util.Log
import com.prabhakar.sedin.remote.Network
import com.prabhakar.sedin.remote.model.ResponseModel
import retrofit2.Call

class Repository {
    private val apiService = Network.provideAPIService()
    //    Calling data from server and passing to ViewModel

    fun getDataFromServer(): Call<MutableList<ResponseModel>> {
        Log.d("pk",apiService.getDetails("all").isExecuted.toString())
        return apiService.getDetails("all")
    }
}