package com.prabhakar.sedin.view.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.sedin.R
import com.prabhakar.sedin.remote.model.ResponseModel
import com.prabhakar.sedin.view.viewholder.UserViewHolder

class UserAdapter(private val userList: MutableList<ResponseModel>): RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.git_profile_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val model=userList[position]
        holder.setData(model)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}