package com.takayama.math

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart: Button = findViewById(R.id.buttonStart)
        buttonStart.setOnClickListener {
            val intent = Intent(this@MainActivity, GameActivity::class.java)
            this@MainActivity.startActivity(intent)
        }

        val buttonSettings: ImageButton = findViewById(R.id.buttonSettings)
        buttonSettings.setOnClickListener {
            val intent = Intent(this@MainActivity, SettingsActivity::class.java)
            this@MainActivity.startActivity(intent)
        }

    }
}