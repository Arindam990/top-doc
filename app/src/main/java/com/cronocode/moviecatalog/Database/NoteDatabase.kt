package com.cronocode.moviecatalog.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cronocode.moviecatalog.Dao.NotesDao
import com.cronocode.moviecatalog.models.Notes
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Notes::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun myNotesDao():NotesDao
    companion object{
        @Volatile
        private var INSTANCE:NoteDatabase?=null
        @OptIn(InternalCoroutinesApi::class)
        fun getDatabaseInstance(context:Context):NoteDatabase{
            val temInstance= INSTANCE
            if (temInstance!=null){
                return temInstance
            }
            synchronized(this)
            {
                val roomDatabseInstance=Room.
                        databaseBuilder(context,NoteDatabase::class.java,"Notes")
                     .allowMainThreadQueries()
                    .build()
                INSTANCE=roomDatabseInstance
                return roomDatabseInstance
            }
        }
    }
}