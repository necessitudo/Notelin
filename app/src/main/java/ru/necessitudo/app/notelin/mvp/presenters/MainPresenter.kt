package ru.necessitudo.app.notelin.mvp.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.necessitudo.app.notelin.NotelinApplication
import ru.necessitudo.app.notelin.mvp.common.AppDatabase
import ru.necessitudo.app.notelin.mvp.view.MainView

/**
 * Created by olegdubrovin on 27/03/18.
 */

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        loadAllNotes();
    }

    private fun loadAllNotes() {
        var noteDao =  NotelinApplication.instance.appDatabase?.noteDao()
        var mNotesList = noteDao?.getAll();
        //viewState.onNotesLoaded(mNotesList);
    }
}