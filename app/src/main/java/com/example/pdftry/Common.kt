package com.example.pdftry
import android.content.Context
import java.io.File

object Common {
    fun getAppPath (context: Context):String{
        val dir = File(android.os.Environment.getExternalStorageDirectory().toString())
    }
}