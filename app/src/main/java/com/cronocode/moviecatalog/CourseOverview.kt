package com.cronocode.moviecatalog

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cronocode.moviecatalog.databinding.FragmentCourseOverviewBinding
import com.cronocode.moviecatalog.models.Courses1

class CourseOverview(result: Courses1) : Fragment() {
var result=result
    var binding:FragmentCourseOverviewBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentCourseOverviewBinding.inflate(inflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.descriptionTextView.setText(Html.fromHtml(Html.fromHtml(result.overview).toString()));


    }

}