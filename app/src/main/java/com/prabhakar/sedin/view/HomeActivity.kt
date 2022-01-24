package com.prabhakar.sedin.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.prabhakar.sedin.R
import com.prabhakar.sedin.remote.Status
import com.prabhakar.sedin.remote.model.ResponseModel
import com.prabhakar.sedin.view.adapter.UserAdapter
import com.prabhakar.sedin.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    lateinit var viewModel: UserViewModel
    lateinit var userAdapter: UserAdapter
    private var dataList= mutableListOf<ResponseModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

//        Calling Function of ViewModel for get all Data
        viewModel.showData().observe(this, Observer {
            it?.run {
                when(it.status){
                    Status.ERROR ->{
                        Toast.makeText(this@HomeActivity, "Error", Toast.LENGTH_SHORT).show()
                    }

                    Status.SUCCESS ->{
                        dataList = it.data as MutableList<ResponseModel>
                        userAdapter.notifyDataSetChanged()
                    }
                }
            }
        })

        setRecyclerView()
    }

    private fun setRecyclerView() {
        userAdapter= UserAdapter(dataList)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=userAdapter
    }
}