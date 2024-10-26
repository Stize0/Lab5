package com.example.lab5

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PriceActivity : AppCompatActivity() {

    public lateinit var  text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val isChecked1 = intent.getBooleanExtra("CHECKBOX1", false)
        val isChecked2 = intent.getBooleanExtra("CHECKBOX2", false)
        val isChecked3 = intent.getBooleanExtra("CHECKBOX3", false)
        val countValueString = intent.getStringExtra("COUNT")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        text = findViewById(R.id.textView9)
        val countValue = countValueString?.toIntOrNull() ?: 0
        var result: Int = 0

        when {
            isChecked1 -> {
                    result = countValue * 100
                }
            isChecked2 -> {
                result = countValue * 150
            }
            isChecked3 -> {
                result = countValue * 300
            }

        }
        text.text = result.toString()


    }
}
