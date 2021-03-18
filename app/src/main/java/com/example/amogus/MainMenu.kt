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

        val newgame = findViewById<Button>(R.id.b_newgame)
        newgame.setOnClickListener {
            val ActivitySwitcher = Intent(this , NewGame::class.java)
            startActivity(ActivitySwitcher)
        }

        val loadgame = findViewById<Button>(R.id.b_loadgame)
        loadgame.setOnClickListener {
            val ActivitySwitcher = Intent(this , LoadGame::class.java)
            startActivity(ActivitySwitcher)
        }

        val gameoptions = findViewById<Button>(R.id.b_options)
        gameoptions.setOnClickListener {
            val ActivitySwitcher = Intent(this , Options::class.java)
            startActivity(ActivitySwitcher)
        }





    }
}