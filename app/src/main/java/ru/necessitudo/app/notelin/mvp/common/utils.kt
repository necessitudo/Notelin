package ru.necessitudo.app.notelin.mvp.common

import java.text.SimpleDateFormat
import java.util.Date

/**
 * Created by olegdubrovin on 08/03/18.
 */

fun formatDate(date: Date?):String{
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm")
    return dateFormat.format(date)
}
