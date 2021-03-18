package com.example.amogus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val continue_game = findViewById<Button>(R.id.b_continue)
        continue_game.setOnClickListener {
            val ActivitySwitcher = Intent(this , Continue::class.java)
            startActivity(ActivitySwitcher)
        }





    }
}