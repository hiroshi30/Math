package com.takayama.math

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import java.io.File


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchSummation: SwitchCompat = findViewById(R.id.switchSummation)
        val switchSubtracting: SwitchCompat = findViewById(R.id.switchSubtracting)
        val switchMultiplication: SwitchCompat = findViewById(R.id.switchMultiplication)
        val switchDivision: SwitchCompat = findViewById(R.id.switchDivision)

        if (File("data.txt").exists()) {
            var file = File("data.txt").bufferedReader()
            switchSummation.isChecked = file.readLine().toBoolean()
            switchSubtracting.isChecked = file.readLine().toBoolean()
            switchMultiplication.isChecked = file.readLine().toBoolean()
            switchDivision.isChecked = file.readLine().toBoolean()
        }

        val buttonStart: Button = findViewById(R.id.buttonStart)
        buttonStart.setOnClickListener {
            val intent = Intent(this@MainActivity, GameActivity::class.java)
            this@MainActivity.startActivity(intent)
            File("data.txt").createNewFile()
            var file = File("data.txt").bufferedWriter()
            file.write(switchSummation.isChecked.toString())
            file.newLine()
            file.write(switchSubtracting.isChecked.toString())
            file.newLine()
            file.write(switchMultiplication.isChecked.toString())
            file.newLine()
            file.write(switchDivision.isChecked.toString())
            file.close()
        }

        val buttonSettings: ImageButton = findViewById(R.id.buttonSettings)
        buttonSettings.setOnClickListener {
            val intent = Intent(this@MainActivity, SettingsActivity::class.java)
            this@MainActivity.startActivity(intent)
            File("data.txt").createNewFile()
            var file = File("data.txt").bufferedWriter()
            file.write(switchSummation.isChecked.toString())
            file.newLine()
            file.write(switchSubtracting.isChecked.toString())
            file.newLine()
            file.write(switchMultiplication.isChecked.toString())
            file.newLine()
            file.write(switchDivision.isChecked.toString())
            file.close()
        }
    }
}