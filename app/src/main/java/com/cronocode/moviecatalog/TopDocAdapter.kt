package com.cronocode.moviecatalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.cronocode.moviecatalog.models.Courses1
import kotlinx.android.synthetic.main.course_item.view.*

class TopDocAdapter(
    private val courses: List<Courses1>
) : RecyclerView.Adapter<TopDocAdapter.CourseViewHolder>() {
    // create a local variable inside a TopDocAdapter class
    private lateinit var cListener:onItemClickListener
    interface onItemClickListener{

        fun onItemClick(position: Int?)
    }
    fun setOnClickListener(listener: onItemClickListener){

        //local variable to pass as a argument
        cListener=listener
    }
    class CourseViewHolder(view: View,listener: onItemClickListener) : RecyclerView.ViewHolder(view) {
        fun bindcourse(courses: Courses1) {
            itemView.course_title_textView.text = courses.title

            itemView.prise_text.text = courses.price.toString()
            itemView.doctor_name.text = courses.instructorName
            courses.rating?.let { itemView.course_rating.rating = it.toFloat() }
            itemView.review_tv.text = (courses.reviewCount.toString() +" review")

            Glide.with(itemView).load(courses.thumbnail).into(itemView.course_imageView)
            Glide.with(itemView).load(courses.instructor.image).into(itemView.doctor_imageView2)
        }
        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        return CourseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.course_item, parent, false),cListener
        )
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.bindcourse(courses[position])
    }

    override fun getItemCount(): Int = courses.size


}


