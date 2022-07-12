package com.example.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}