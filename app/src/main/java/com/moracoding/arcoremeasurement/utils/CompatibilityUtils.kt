package com.moracoding.arcoremeasurement.utils

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.widget.Toast
import java.util.*

fun verifyOpenGLVersion(activity: Activity): Boolean {
    val minOpenGLVersion = 3.0
    val openGlVersionString =
        (Objects.requireNonNull(activity
            .getSystemService(Context.ACTIVITY_SERVICE)) as ActivityManager)
            .deviceConfigurationInfo
            .glEsVersion
    if (openGlVersionString.toDouble() < minOpenGLVersion) {
        Toast.makeText(activity,
            "Sceneform requires OpenGL $minOpenGLVersion or later",
            Toast.LENGTH_LONG)
            .show()
        return false
    }
    return true
}