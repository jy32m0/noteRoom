package com.example.noteroom.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.noteroom.model.NoteEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.selects.select

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getAllFlow(): Flow<List<NoteEntity>>

    @Insert
    suspend fun insert(note: NoteEntity)

    @Update
    suspend fun update(note: NoteEntity)

    @Delete
    suspend fun delete(note: NoteEntity)
}