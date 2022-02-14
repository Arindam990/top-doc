package com.cronocode.moviecatalog.notebook


import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.cronocode.moviecatalog.R
import com.cronocode.moviecatalog.ViewModel.NotesViewModel
import com.cronocode.moviecatalog.databinding.FragmentCreateNotesBinding
import com.cronocode.moviecatalog.models.Notes
import java.util.*

class CreateNotes : Fragment() {
    lateinit var binding: FragmentCreateNotesBinding
    private var priority:String="3"
 // val viewModel : NotesViewModel?=null
    val viewModel by viewModels<NotesViewModel>()
    //val viewModel = ViewModelProvider(requireActivity()).get(NotesViewModel::class.java)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateNotesBinding.inflate(layoutInflater, container, false)
        binding.greenDot.setImageResource(R.drawable.ic_baseline_done_24)
        binding.greenDot.setOnClickListener {
            priority="1"
            binding.greenDot.setImageResource(R.drawable.ic_baseline_done_24)
            binding.redDot.setImageResource(0)
            binding.yellowDot.setImageResource(0)
        }
        binding.redDot.setOnClickListener {
            priority="3"
            binding.redDot.setImageResource(R.drawable.ic_baseline_done_24)
            binding.greenDot.setImageResource(0)
            binding.yellowDot.setImageResource(0)
        }
        binding.yellowDot.setOnClickListener {
            priority="2"
            binding.yellowDot.setImageResource(R.drawable.ic_baseline_done_24)
            binding.redDot.setImageResource(0)
            binding.greenDot.setImageResource(0)
        }


        binding.done.setOnClickListener {
            createNotes(it)
        }
        return binding.root
    }

    public fun createNotes(it: View) {
        var title = binding.title.text.toString()
        var subtitle = binding.subtitle.text.toString()
        var notes = binding.notes.text.toString()
        var date = Date()
        val notesdate: CharSequence = DateFormat.format("MMMM d, YYYY", date.time)
        Log.e("@@@@","createNotes :$notesdate")
        val data=Notes(
            null,
            title=title,
            subtitle=subtitle,
            note = notes,
            date=notesdate.toString(),
            priority
        )
        viewModel?.addNotes(data)
        Toast.makeText(requireContext(), "notes create successfully", Toast.LENGTH_SHORT).show()
        Navigation.findNavController(it!!).navigate(R.id.action_createNotes_to_noteBookSplashScreen)
    }


}