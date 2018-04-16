package ru.necessitudo.app.notelin.mvp.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import ru.necessitudo.app.notelin.mvp.models.Note

/**
 * Created by olegdubrovin on 27/03/18.
 */
@StateStrategyType(value=AddToEndSingleStrategy::class)
interface MainView :MvpView{

    fun onNotesLoaded(notes:List<Note>)

    fun updateView()

    fun onSearchResult(notes: List<Note>)

    fun onAllNotesDeleted()

    fun onNoteDeleted()

    fun showNoteInfoDialog(noteInfo:String)

    fun hideNoteInfoDialog()

    fun showNoteDeletedDialog(noteInfo:String)

    fun hideNoteDeleteDialog()

    fun showNoteContextDialog(noteInfo:String)

    fun hideNoteContextDialog()




}