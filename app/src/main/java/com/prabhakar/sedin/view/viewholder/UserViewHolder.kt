package com.prabhakar.sedin.view.viewholder

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.prabhakar.sedin.remote.model.ResponseModel
import kotlinx.android.synthetic.main.git_profile_layout.view.*

class UserViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    /**
    Setting all the require data to Views
     */

    @SuppressLint("SetTextI18n")

    fun setData(model: ResponseModel) {
        view.apply {
            Glide.with(profileImage).load(model.user?.avatarUrl).into(profileImage)
            userId.text = "ID : ${model.user?.id}"
            userName.text = "Name : ${model.user?.login}"
            issuesCount.text = "Total Issue : ${model.number}"
            title.text = "Title : ${model.title}"
            status.text = model.state

            /**
            handling the color of Status
             */

            if (model.state == "closed") {
                status.setBackgroundColor(Color.RED)
            } else if (model.state == "open") {
                status.setBackgroundColor(Color.GREEN)
            }

            comments.text = model.comments.toString()
//            pullRequest.text="Pull Requests : ${model.number}"
        }
    }

}