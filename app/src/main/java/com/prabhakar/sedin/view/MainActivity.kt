package com.prabhakar.sedin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.prabhakar.sedin.R
import com.prabhakar.sedin.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        viewModel.showData()
    }
}