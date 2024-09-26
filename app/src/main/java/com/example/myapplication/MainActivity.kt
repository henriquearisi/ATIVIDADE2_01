package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageInput = findViewById<EditText>(R.id.edidade)
        val checkButton = findViewById<Button>(R.id.verificarbtn)
        val resultText = findViewById<TextView>(R.id.txtresultado)

        checkButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            resultText.text = when {
                age == null -> "Por favor, insira uma idade válida."
                age < 18 -> "Você é menor de idade."
                age <= 60 -> "Você está na meia idade."
                else -> "Você é idoso."
            }
        }
    }

    fun limparValores(view: View) {
        findViewById<TextView>(R.id.txtresultado).text = ""
        findViewById<EditText>(R.id.edidade).text.clear()
    }
}
