package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var email:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textViewWelcome = findViewById<TextView>(R.id.viewemail)


        val email = intent.getStringExtra("EMAIL")


        textViewWelcome.text = "$email"
    }
}