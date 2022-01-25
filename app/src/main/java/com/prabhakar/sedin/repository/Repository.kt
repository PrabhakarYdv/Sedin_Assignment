package com.prabhakar.sedin.repository

import android.util.Log
import com.prabhakar.sedin.remote.Network
import com.prabhakar.sedin.remote.Resource
import com.prabhakar.sedin.remote.ResponseHandler
import com.prabhakar.sedin.remote.model.ResponseModel

class Repository {
    private val apiService = Network.provideAPIService()
    private val responseHandler = ResponseHandler()

    /**
      Fetching data from server and passing to ViewModel
      */

    suspend fun getDataFromServer(): Resource<ResponseModel> {
        Log.d("pk", apiService.getDetails("all").body)
        val data = apiService.getDetails("all")
        return try {
            responseHandler.handleSuccess(data)
        } catch (exception: Exception) {
            responseHandler.handleException(exception)
        }
    }
}