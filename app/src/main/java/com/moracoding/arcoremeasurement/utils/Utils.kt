package com.moracoding.arcoremeasurement.utils

import android.app.AlertDialog
import android.content.Context

fun showAlert(context: Context, throwable: Throwable){
    val builder = AlertDialog.Builder(context)
    builder.setMessage(throwable.message).setTitle("Error")
    val dialog = builder.create()
    dialog.show()
}