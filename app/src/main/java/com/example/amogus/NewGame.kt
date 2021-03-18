package com.example.amogus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NewGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game)

        val continue_game = findViewById<Button>(R.id.b_back)
        continue_game.setOnClickListener {
            val ActivitySwitcher = Intent(this , MainMenu::class.java)
            startActivity(ActivitySwitcher)
        }
    }
}