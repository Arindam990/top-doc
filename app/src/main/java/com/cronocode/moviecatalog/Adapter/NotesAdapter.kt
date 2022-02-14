package com.cronocode.moviecatalog.Adapter

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewTreeLifecycleOwner.get
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.cronocode.moviecatalog.R
import com.cronocode.moviecatalog.databinding.ItemBinding
import com.cronocode.moviecatalog.models.Notes
import com.cronocode.moviecatalog.notebook.NoteBookHomeDirections
import java.lang.reflect.Array.get

class NotesAdapter(val requireContext: Context, val notesList: List<Notes>) :
    RecyclerView.Adapter<NotesAdapter.notesViewHolder>() {
    class notesViewHolder(var binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    //val note1 = notesList


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): notesViewHolder {
        return notesViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: notesViewHolder, position: Int) {
        var data = notesList[position]
        holder.binding.itemDate.text = data.date.toString()
        holder.binding.itemNotes.text = data.note.toString()
        holder.binding.itemTitle.text = data.title.toString()
        holder.binding.itemSubtitle.text = data.subtitle.toString()
        when (data.priority) {
            "1" -> {
                holder.binding.itemPriority.setBackgroundResource(R.drawable.green_dot)
            }
            "2" -> {
                holder.binding.itemPriority.setBackgroundResource(R.drawable.yellow_dot)
            }
            "3" -> {
                holder.binding.itemPriority.setBackgroundResource(R.drawable.red_dot)
            }
        }
        holder.binding.root.setOnClickListener {
//
//            val title = holder.binding.itemTitle.toString()
//            val subtitle = holder.binding.itemSubtitle.toString()
//            val note = holder.binding.itemNotes.toString()
//            val id = holder.itemId.toInt()
//            val action = NoteBookHomeDirections.actionNoteBookSplashScreenToEditNotes(
//                data.toString()
//            )
            // val result = position?.let { Notes?.get(it) }
            val notesdata=position?.let { notesList?.get(it) }
            val bundle=Bundle()
            bundle.putSerializable("notes",notesdata)
           Navigation.findNavController(it).navigate(
                R.id.action_noteBookSplashScreen_to_editNotes,
                bundle
            )

        }

    }

    override fun getItemCount() = notesList.size
}