package com.example.userinterface

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        button.setOnClickListener{
            val userName = nameInput.text.toString()
            val password = passwordInput.text.toString()

            //String concatination useing string.xml file
            val message = getString(R.string.loginMessage, userName, password)

            //Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            //Useing snakbar for more complex benifits than Toast
            Snackbar.make(it, message, Snackbar.LENGTH_LONG).setAction("Click me", {showAnotherMessage() }).show()
        }



    }

    private fun showAnotherMessage() {
        Toast.makeText(this, "You Clicked", Toast.LENGTH_LONG).show()
    }

}