package com.prabhakar.sedin.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.prabhakar.sedin.reposrepository.Repository

class UserViewModel : ViewModel() {
    private val repository = Repository()
    fun showData() {
        val data = repository.getDataFromServer()
        Log.d("pk", data.isExecuted.toString())
    }
}