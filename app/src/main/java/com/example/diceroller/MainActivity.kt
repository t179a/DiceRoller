package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.R.id.roll_button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(roll_button)

        rollButton.setOnClickListener{ rollDice() }

        val countupButton: Button = findViewById(R.id.count_up)

        countupButton.setOnClickListener{ countUp()}

        val resetButton: Button = findViewById(R.id.reset_button)

        resetButton.setOnClickListener{ reset()}
    }

    private fun rollDice(){
        /*Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp(){

        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text.toString() == "Hello World!"){
            resultText.text = "1"
        }else{
            val currentInt = Integer.parseInt(resultText.text.toString())
            if(currentInt != 6){
                resultText.text = (currentInt + 1).toString()
            }
        }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}