package com.cronocode.moviecatalog.Repository

import androidx.lifecycle.LiveData
import com.cronocode.moviecatalog.Dao.NotesDao
import com.cronocode.moviecatalog.models.Notes

class NotesRepository(private val dao:NotesDao) {
    fun getAllNotes():LiveData<List<Notes>>{
        return dao.getNotes()
    }
    fun insertNotes(notes: Notes){
        dao.insertNotes(notes)
    }
    fun deleteNotes(id:Int){
        dao.deleteNotes(id)
    }
    fun updateNotes(notes: Notes)
    {
        dao.updateNotes(notes)
    }
}