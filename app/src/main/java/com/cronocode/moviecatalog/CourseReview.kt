package com.cronocode.moviecatalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cronocode.moviecatalog.databinding.FragmentCourseReviewBinding
import com.cronocode.moviecatalog.models.Courses1
//import kotlinx.android.synthetic.main.fragment_course_details.course_rating
//import kotlinx.android.synthetic.main.fragment_course_review.*


class CourseReview(result: Courses1) : Fragment() {
    var result = result
    var binding: FragmentCourseReviewBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCourseReviewBinding.inflate(inflater, container, false)
        return binding!!.root
    }

 /*   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        5.let { this.course_rating.rating = it.toFloat() }
        4.let { this.course_rating1.rating = it.toFloat() }
        3.let { this.course_rating2.rating = it.toFloat() }
        2.let { this.course_rating3.rating = it.toFloat() }
        1.let { this.course_rating4.rating = it.toFloat() }
        binding!!.reviewNumber.text = (result.reviewCount.toString() + " review")

    }
*/

}