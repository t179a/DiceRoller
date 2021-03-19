package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.diceroller.R.id.roll_button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(roll_button)

        rollButton.setOnClickListener{ rollDice() }
    }

    private fun rollDice(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }
}