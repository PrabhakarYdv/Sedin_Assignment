package com.prabhakar.sedin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.prabhakar.sedin.remote.Resource
import com.prabhakar.sedin.remote.model.ResponseModel
import com.prabhakar.sedin.repository.Repository
import kotlinx.coroutines.Dispatchers

class UserViewModel : ViewModel() {
    private val repository = Repository()
    fun showData(): LiveData<Resource<List<ResponseModel>>> {
        return liveData(Dispatchers.Main) {
            val data = repository.getDataFromServer()
            emit(data)
//            Log.d("pk",data.data.toString())
            print(data)
        }
    }
}