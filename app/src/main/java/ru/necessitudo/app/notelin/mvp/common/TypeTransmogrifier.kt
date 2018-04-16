package ru.necessitudo.app.notelin.mvp.common

import android.arch.persistence.room.TypeConverter
import java.util.*

/**
 * Created by olegdubrovin on 09/03/18.
 */

class TypeTransmogrifier {
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch: Long): Date {
        return Date(millisSinceEpoch)
    }
}