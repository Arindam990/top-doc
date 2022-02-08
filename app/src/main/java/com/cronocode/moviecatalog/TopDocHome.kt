package com.cronocode.moviecatalog

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.NotificationCompat.EXTRA_PEOPLE
import androidx.navigation.fragment.findNavController

import androidx.recyclerview.widget.LinearLayoutManager
import com.cronocode.moviecatalog.databinding.FragmentTopDocHomeBinding
import com.cronocode.moviecatalog.models.*
import com.cronocode.moviecatalog.services.ApiInterfaceTopDoc
import kotlinx.android.synthetic.main.fragment_top_doc_home.*
import okhttp3.internal.http.StatusLine.get
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TopDocHome : Fragment() {
    private var binding: FragmentTopDocHomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTopDocHomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Set the layout manager that this recyclerview will use vertically
        course_list_recycler_view.layoutManager = LinearLayoutManager(requireContext())

        // if it gridview
        // course_list.layoutManager = GridLayoutManager(requireContext(),2)
        // if it use horizontally
        // course_list.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        course_list_recycler_view.setHasFixedSize(true)
        //adapter class is initialize and list is passed in the param
        // adapter instance is set to the recyclerview to inflate the item
        getCourseData()
//        getCourseData { courses: List<Courses> ->
//            course_list.adapter = TopDocAdapter(courses)
//        }
    }


    private fun getCourseData() {
        val apiClient = ApiInterfaceTopDoc.create().getCourses()

        //apiInterface.enqueue( Callback<List<Movie>>())
        apiClient.enqueue(object : Callback<CoursesResponse> {
            override fun onResponse(
                call: Call<CoursesResponse>?,
                response: Response<CoursesResponse>?
            ) {

                if (response?.body() != null)
                    Log.d("Response:::: ", response.toString())
                var courseList = response?.body()?.courses;
                var adapter = courseList?.let { TopDocAdapter(it) }
                course_list_recycler_view.adapter = adapter
                adapter?.setOnClickListener(object : TopDocAdapter.onItemClickListener {
                    override fun onItemClick(position: Int?) {
                       /* Toast.makeText(
                            requireActivity(),
                            position?.let { courseList?.get(it)?.title }, Toast.LENGTH_LONG
                        ).show()*/
                        // val course=Courses1

                        val result = position?.let { courseList?.get(it) }
                        val bundle = Bundle()
                        bundle.putSerializable("CourseKey", result)
                        findNavController().navigate(
                            R.id.action_top_Doc_Home_to_courseDetails,
                            bundle
                        )
                    }
                })
            }

            override fun onFailure(call: Call<CoursesResponse>?, t: Throwable?) {
                Log.e("Error", t.toString())
            }
        })
    }


}
