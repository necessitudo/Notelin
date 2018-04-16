package ru.necessitudo.app.notelin.ui.activities

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import ru.necessitudo.app.notelin.R

import ru.necessitudo.app.notelin.mvp.common.AppDatabase
import ru.necessitudo.app.notelin.mvp.models.Note
import ru.necessitudo.app.notelin.mvp.presenters.MainPresenter
import ru.necessitudo.app.notelin.mvp.view.MainView

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.RecyclerView



class MainActivity : MvpAppCompatActivity(), MainView  {

    @InjectPresenter
    lateinit var mPresenter: MainPresenter

    override fun onNotesLoaded(notes: List<Note>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSearchResult(notes: List<Note>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAllNotesDeleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNoteDeleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNoteInfoDialog(noteInfo: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideNoteInfoDialog() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNoteDeletedDialog(noteInfo: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideNoteDeleteDialog() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNoteContextDialog(noteInfo: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideNoteContextDialog() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    //var database: AppDatabase? = null
    //var job:Job? = null


    /*override fun onClick(p0: View) {

        when(p0.id){

            R.id.btnStart -> { startPresenting() }
            R.id.btnStop ->  { stopPresenting()  }
        }

    }*/

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fabButton.attachToRecyclerView(rvNoteList)


        rvNoteList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                if (dy > 0 || dy < 0 && fabButton.isShown())  fabButton.hide()

            }

            override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    fabButton.show()
                }
                super.onScrollStateChanged(recyclerView, newState)
            }
        })



        //AppDatabase.getInstance(this)

        /*val btnStart:Button = findViewById(R.id.btnStart)
        btnStart.setOnClickListener(this)

        val btnStop:Button = findViewById(R.id.btnStop)
        btnStop.setOnClickListener(this)
*/
        //database = AppDatabase.getInstance(this)

      /*  var note = Note(12, "Заголовк заметки", "текст заметки", Date(), Date())
        var noteDao: NoteDao = database!!.noteDao();

        noteDao.insert(note);*/


    }
/*

    fun startPresenting() {
        Log.d("Coroutines", "Start")
        job = loadData()
    }

    fun stopPresenting() {
        Log.d("Coroutines", "Stop")
        job?.cancel()
    }

    private fun loadData() = launch(UI) {
        showLoading() // ui thread

        val task = async(CommonPool) { saveData()}
        val result = task.await() // non ui thread, suspend until finished

        showData(result) // ui thread
    }


    fun showLoading(){
        Log.d("Coroutines", "showLoading")
    }
    fun showData(result:Any){
        Log.d("Coroutines", "showData")
    }


    fun saveData(){

        Thread.sleep(5000)

        var note = Note(12, "Заголовк заметки", "текст заметки", Date(), Date())
        var noteDao: NoteDao = database!!.noteDao();

        noteDao.insert(note);

    }
*/



}
