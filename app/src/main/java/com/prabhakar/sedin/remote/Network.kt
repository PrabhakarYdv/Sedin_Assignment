package com.prabhakar.sedin.remote


import com.google.gson.GsonBuilder
import com.prabhakar.sedin.remote.model.ResponseModel
import com.prabhakar.sedin.util.Constraint
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {
    private fun retrofitInstance(): Retrofit {
        val gson = GsonBuilder()
            .create()
        return Retrofit.Builder().baseUrl(Constraint.BASE_URL)
            .client(OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    //    Calling APIService and after create Provide it's to use anywhere

    fun provideAPIService(): APIService {
        return retrofitInstance().create(APIService::class.java)
    }
}