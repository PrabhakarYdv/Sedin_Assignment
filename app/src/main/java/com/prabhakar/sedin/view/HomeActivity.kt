package com.prabhakar.sedin.view

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
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
    private var dataList = listOf<ResponseModel>()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
        Initializing ViewModel
         */
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        /**
        Starting Animation before loading Content
         */
        loading.startShimmerAnimation()


        /**
        Calling Function of ViewModel for get all Data
         */

        viewModel.showData().observe(this, Observer {
            it?.run {
                when (this.status) {
                    Status.ERROR -> {
                        Toast.makeText(this@HomeActivity, "Error", Toast.LENGTH_SHORT).show()
                    }
                    Status.LOADING -> {
                        loading.visibility = View.VISIBLE
                        loading.startShimmerAnimation()
                        recyclerView.visibility = View.GONE

                    }

                    Status.SUCCESS -> {
                        recyclerView.visibility = View.VISIBLE
                        loading.visibility = View.GONE
                        homeActivity.setBackgroundColor(Color.parseColor("#231D1D"))
                        dataList = this?.data!!
//                        userAdapter.notifyDataSetChanged()
                        setRecyclerView()
                    }
                }
            }
        })

//        setRecyclerView()
    }

    private fun setRecyclerView() {
        userAdapter = UserAdapter(dataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = userAdapter
    }
}