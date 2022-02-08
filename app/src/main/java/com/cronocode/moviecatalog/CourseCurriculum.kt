package com.cronocode.moviecatalog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cronocode.moviecatalog.databinding.FragmentCoursCurriculumBinding
import com.cronocode.moviecatalog.models.Courses1

class CourseCurriculum(result: Courses1) : Fragment() {
    var result = result
    var binding: FragmentCoursCurriculumBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoursCurriculumBinding.inflate(inflater, container, false)
        return binding!!.root
    }

}