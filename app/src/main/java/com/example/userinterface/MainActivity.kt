package com.example.userinterface

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        //Call the function to create a TextView
        addTextView("Hello")
        addTextView("From")
        addTextView("Mithu")

    }

    //Create a function to create a TextView through code
    private fun addTextView(lebel : String){
        val view = TextView(this)
        view.text = lebel
        view.textSize = 28f
        view.setTextColor(Color.parseColor("#ff0000"))
        linearLayout.addView(view)
    }
}