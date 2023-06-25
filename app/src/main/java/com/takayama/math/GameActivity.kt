package com.takayama.math

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


var a: Int = 100
var b: Int = 100
var c: Int = 0;

fun gameInit() {
    a = (0..10).random()
    b = (0..10).random()

    while (a + b > 10) {
        a = (0..10).random()
        b = (0..10).random()
    }

    c = 0
}

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var correctCounter: Int = 0
        var incorrectCounter: Int = 0

        val textViewCorrectCounter: TextView = findViewById(R.id.textViewCorrectCounter)
        val textViewAllCounter: TextView = findViewById(R.id.textViewAllCounter)
        val textViewPercent: TextView = findViewById(R.id.textViewPercent)
        val textViewIncorrectCounter: TextView = findViewById(R.id.textViewIncorrectCounter)
        val textViewTask: TextView = findViewById(R.id.textViewTask)
        val textView: TextView = findViewById(R.id.textView)

        gameInit()

        textViewCorrectCounter.text = "0"
        textViewAllCounter.text = "0"
        textViewPercent.text = "0%"
        textViewIncorrectCounter.text = "0"
        textViewTask.text = "$a + $b = $c"
        textView.text = ""

        val buttonNumber1: Button = findViewById(R.id.buttonNumber1)
        buttonNumber1.setOnClickListener {
            c *= 10
            c += 1
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber2: Button = findViewById(R.id.buttonNumber2)
        buttonNumber2.setOnClickListener {
            c *= 10
            c += 2
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber3: Button = findViewById(R.id.buttonNumber3)
        buttonNumber3.setOnClickListener {
            c *= 10
            c += 3
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber4: Button = findViewById(R.id.buttonNumber4)
        buttonNumber4.setOnClickListener {
            c *= 10
            c += 4
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber5: Button = findViewById(R.id.buttonNumber5)
        buttonNumber5.setOnClickListener {
            c *= 10
            c += 5
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber6: Button = findViewById(R.id.buttonNumber6)
        buttonNumber6.setOnClickListener {
            c *= 10
            c += 6
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber7: Button = findViewById(R.id.buttonNumber7)
        buttonNumber7.setOnClickListener {
            c *= 10
            c += 7
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber8: Button = findViewById(R.id.buttonNumber8)
        buttonNumber8.setOnClickListener {
            c *= 10
            c += 8
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber9: Button = findViewById(R.id.buttonNumber9)
        buttonNumber9.setOnClickListener {
            c *= 10
            c += 9
            textViewTask.text = "$a + $b = $c"
        }

        val buttonNumber0: Button = findViewById(R.id.buttonNumber0)
        buttonNumber0.setOnClickListener {
            c *= 10
            textViewTask.text = "$a + $b = $c"
        }

        val buttonDelete: Button = findViewById(R.id.buttonDelete)
        buttonDelete.setOnClickListener {
            c /= 10
            textViewTask.text = "$a + $b = $c"
        }

        val buttonResult: Button = findViewById(R.id.buttonResult)
        buttonResult.setOnClickListener {
            if (a + b == c) {
                textView.text = getString(R.string.correct)
                textView.setTextColor(resources.getColor(R.color.green))

                correctCounter += 1
                textViewCorrectCounter.text = "$correctCounter"
                textViewAllCounter.text = "${correctCounter + incorrectCounter}"
                textViewPercent.text = "${100 * correctCounter / (correctCounter + incorrectCounter)}%"

                gameInit()
                textViewTask.text = "$a + $b = $c"
            } else {
                textView.text = getString(R.string.incorrect)
                textView.setTextColor(resources.getColor(R.color.red))

                incorrectCounter += 1
                textViewIncorrectCounter.text = "$incorrectCounter"
                textViewAllCounter.text = "${correctCounter + incorrectCounter}"
                textViewPercent.text = "${100 * correctCounter / (correctCounter + incorrectCounter)}%"

                c = 0
                textViewTask.text = "$a + $b = $c"
            }
        }
    }
}