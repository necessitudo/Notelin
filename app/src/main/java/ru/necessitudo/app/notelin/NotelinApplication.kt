package ru.necessitudo.app.notelin

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import ru.necessitudo.app.notelin.mvp.common.AppDatabase
import ru.necessitudo.app.notelin.mvp.models.Note

class NotelinApplication : Application() {

    companion object{

        lateinit var  instance : NotelinApplication
        private set
    }

    var appDatabase:AppDatabase?=null

    override fun onCreate() {
        super.onCreate()
        initializeDatabaseInstance()
    }

   fun initializeDatabaseInstance() {

        synchronized(Note::class) {
            appDatabase = Room.databaseBuilder(this,
                    AppDatabase::class.java, "note.db")
                    .allowMainThreadQueries()
                    .build()
        }

    }
}