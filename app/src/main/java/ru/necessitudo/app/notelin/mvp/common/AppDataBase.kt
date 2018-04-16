package ru.necessitudo.app.notelin.mvp.common

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import ru.necessitudo.app.notelin.mvp.models.Note

/**
 * Created by olegdubrovin on 09/03/18.
 */
@Database(entities = arrayOf(Note::class), version = 1)
@TypeConverters(TypeTransmogrifier::class)
abstract  class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao


}