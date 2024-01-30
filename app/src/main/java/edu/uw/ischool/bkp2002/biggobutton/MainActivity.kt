package edu.uw.ischool.bkp2002.biggobutton

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var pushButton: Button
    private var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushButton = findViewById(R.id.pushButton)

        pushButton.setOnClickListener {
            pushCount++
            updateButton()
        }
    }


    private fun updateButton() {
        val newButtonText = "You have pushed me $pushCount time${if (pushCount > 1) "s" else ""}!"
        pushButton.text = newButtonText
        pushButton.setBackgroundColor(getRandomColor())
        pushButton.setTextColor(getRandomColor())
    }

    private fun getRandomColor(): Int {
        val random = java.util.Random()
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }
}
