package com.prabhakar.sedin.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.prabhakar.sedin.remote.model.ResponseModel
import kotlinx.android.synthetic.main.git_profile_layout.view.*

class UserViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun setData(model: ResponseModel){
        view.apply {
            Glide.with(profileImage).load(model.user.avatar_url).into(profileImage)
            userId.text=model.user.id.toString()
            name.text=model.user.login
        }
    }

}