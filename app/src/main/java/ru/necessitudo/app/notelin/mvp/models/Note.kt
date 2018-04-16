package ru.necessitudo.app.notelin.mvp.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo
import ru.necessitudo.app.notelin.mvp.common.formatDate
import java.util.Date

/**
 * Created by olegdubrovin on 09/03/18.
 */
@Entity(tableName = "Note")
class Note (@PrimaryKey(autoGenerate = true) var id:Long?,
            @ColumnInfo var title:String?,
            @ColumnInfo var text:String?,
            @ColumnInfo var createDate:Date?,
            @ColumnInfo var changeDate:Date?
) {

    constructor():this(null, null, null, null, null)

    fun getInfo():String = "Название :\n$title\n"+
            "Время создания: \n${formatDate(createDate)}\n"+
            "Время изменения: \\n${formatDate(changeDate)}"


}

