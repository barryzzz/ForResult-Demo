package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    companion object {
        fun startAction(ac: Activity) {
            val intent = Intent(ac, MainActivity::class.java)
            ac.startActivityForResult(intent, 100)
        }
    }

    fun doClick(view: View) {
        MainActivity2.startAction(this)
    }
}