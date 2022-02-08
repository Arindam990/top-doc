package com.cronocode.moviecatalog

import android.os.Bundle
import android.text.Html
import android.util.Log.i
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.cronocode.moviecatalog.databinding.FragmentCouseInstructorBinding
import com.cronocode.moviecatalog.models.Courses1
import kotlinx.android.synthetic.main.fragment_course_details.*

class CourseInstructor(result:Courses1) : Fragment() {
    val result =result
    private var binding: FragmentCouseInstructorBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCouseInstructorBinding.inflate(inflater, container, false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var doctorImage=result.instructor.image
        Glide.with(requireContext()).load(doctorImage)
            .into(binding!!.doctorImageView3)
        binding!!.doctorName2.text=result.instructor.name
        // covert html text to normal text
        binding!!.doctorDetails.setText(Html.fromHtml(Html.fromHtml(result.instructor.description).toString()));
      //  binding!!.instructorDetails.text=result.instructor.description
    }


}