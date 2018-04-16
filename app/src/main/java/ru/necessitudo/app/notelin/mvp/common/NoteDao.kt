package ru.necessitudo.app.notelin.mvp.common

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import ru.necessitudo.app.notelin.mvp.models.Note

/**
 * Created by olegdubrovin on 09/03/18.
 */
@Dao
interface NoteDao {

    @Query("Select * from Note")
    fun getAll(): List<Note>

    @Insert(onConflict = REPLACE)
    fun insert(note: Note)

    @Query("Delete from Note")
    fun deleteAll()

}