package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    companion object {
        fun startAction(ac: Activity) {
            val intent = Intent(ac, MainActivity2::class.java)
            ac.startActivityForResult(intent, 101)
        }
    }

    fun doClick(view: View) {
        MainActivity3.startAction(this)
    }
}