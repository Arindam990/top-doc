package com.cronocode.moviecatalog.notebook

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.cronocode.moviecatalog.R
import com.cronocode.moviecatalog.databinding.FragmentEditNotesBinding
import com.cronocode.moviecatalog.models.Courses1
import com.cronocode.moviecatalog.models.Notes


class EditNotes : Fragment() {
   // val notes by navArgs<EditNotesArgs>()

    lateinit var binding: FragmentEditNotesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditNotesBinding.inflate(layoutInflater, container, false)
        var result: Notes = requireArguments().getSerializable("notes") as Notes
        binding.editTitle.setText(result.title)
        binding.editSubtitle.setText(result.subtitle)
        binding.editNotes.setText(result.note)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        Log.i("@@@@","gating notes $notes")
//       // binding.editTitle.text= notes.toString()
//          binding.editTitle.text=notes.toString()
        binding.saveNotes.setOnClickListener {
            saveNotes(it)
        }
    }
    fun saveNotes(it:View){


        Toast.makeText(requireContext(), "notes saved successfully", Toast.LENGTH_SHORT).show()
        Navigation.findNavController(it!!).navigate(R.id.action_editNotes_to_noteBookSplashScreen)

    }


}