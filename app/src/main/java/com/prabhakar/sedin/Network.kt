package com.prabhakar.sedin


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {
    private fun retrofitInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(Constraint.BASE_URL)
            .client(OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //    Calling APIService and after create Provide it's to use anywhere

    fun provideAPIService(): APIService {
        return retrofitInstance().create(APIService::class.java)
    }
}