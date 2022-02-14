package com.cronocode.moviecatalog.Dao

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.room.*
import com.cronocode.moviecatalog.models.Notes

@Dao
interface NotesDao {
    @Query("SELECT * FROM Notes")
    fun getNotes():LiveData<List<Notes>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(notes: Notes)
    @Query("DELETE FROM Notes WHERE id=:id")
    fun deleteNotes(id:Int)
    @Update
    fun updateNotes(notes: Notes)
}