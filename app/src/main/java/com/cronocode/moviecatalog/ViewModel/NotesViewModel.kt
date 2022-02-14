package com.cronocode.moviecatalog.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.cronocode.moviecatalog.Database.NoteDatabase
import com.cronocode.moviecatalog.Repository.NotesRepository
import com.cronocode.moviecatalog.models.Notes

    class NotesViewModel(application:Application) :AndroidViewModel(application){
     var repository:NotesRepository
    init {
        val dao=NoteDatabase.getDatabaseInstance(application).myNotesDao()
        repository= NotesRepository(dao)
    }
    fun addNotes(notes:Notes){
        repository.insertNotes(notes)
    }
    fun getNotes():LiveData<List<Notes>> = repository.getAllNotes()
    fun deleteNotes(id:Int){
        repository.deleteNotes(id)
    }
    fun  updateNotes(notes: Notes){
        repository.updateNotes(notes)
    }

}