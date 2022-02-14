package com.cronocode.moviecatalog.notebook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.cronocode.moviecatalog.Adapter.NotesAdapter
import com.cronocode.moviecatalog.R
import com.cronocode.moviecatalog.ViewModel.NotesViewModel
import com.cronocode.moviecatalog.databinding.FragmentNoteBookBinding


class NoteBookHome : Fragment() {

    lateinit var binding: FragmentNoteBookBinding
    val viewModel by viewModels<NotesViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNoteBookBinding.inflate(layoutInflater, container, false)
        viewModel?.getNotes()?.observe(viewLifecycleOwner) { notesList ->
            binding.rvNotes.layoutManager = GridLayoutManager(requireContext(), 2)
            binding.rvNotes.adapter = NotesAdapter(requireContext(), notesList)
        }

        binding.addNoteButton.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_noteBookSplashScreen_to_createNotes)
        }

        return binding.root
    }


}