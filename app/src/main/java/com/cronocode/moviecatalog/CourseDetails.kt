package com.cronocode.moviecatalog

import ViewPagerAdapter
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.cronocode.moviecatalog.databinding.FragmentCourseDetailsBinding
import com.cronocode.moviecatalog.models.Courses1
//import kotlinx.android.s.main.fragment_course_details.*
import java.text.SimpleDateFormat
import java.util.*


class CourseDetails : Fragment() {


    private var binding: FragmentCourseDetailsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCourseDetailsBinding.inflate(inflater, container, false)

        return binding!!.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // val bundle = arguments
        // Courses1 basically define type of the result data which are present in result
        var result: Courses1 = requireArguments().getSerializable("CourseKey") as Courses1
        Log.i("getresult", result.toString())
        if (result != null) {
            Glide.with(requireContext()).load(result.thumbnail).into(binding!!.courseDetailsImage)
            binding!!.courseTitle.text = result.title
            binding!!.doctorName1.text = result.instructorName
            Glide.with(requireContext()).load(result.instructor.image)
                .into(binding!!.doctorImageView2)
            binding!!.time.text = getDateTime(result.courseDuration!!.toLong())
         //   result.rating?.let { this.course_rating.rating = it.toFloat() }
            binding!!.ratingDetails.text = (result.reviewCount.toString() + " rating")
            var time=getDateTime1(result.endDate!!)
            binding!!.lastDate.text=time

            // we can get string value from string resource,which are present
            // in string file

            val string: String = requireContext().getString(R.string.Rs)
            binding!!.prise.text= string+(result.price.toString())
        }
        val tabLayout = binding!!.tabItem
        val viewPager = binding!!.viewPage
        //val adapter=ViewPagerAdapter(requireActivity().supportFragmentManager,lifecycle)
            val adapter = ViewPagerAdapter(requireActivity().supportFragmentManager,result)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun getDateTime(s: Long): String? {
        return try {
            val sdf = SimpleDateFormat("HH:mm")
            val netDate = Date(s * 1000)
            sdf.format(netDate)
        } catch (e: Exception) {
            e.toString()
        }
    }

    private fun getDateTime1(s: Long): String? {
        return try {
            val sdf = SimpleDateFormat("d MMM")
            val netDate = Date(s)
            sdf.format(netDate)
        } catch (e: Exception) {
            e.toString()
        }
    }
//dd/MM/yyyy

}