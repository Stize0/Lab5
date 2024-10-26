package com.example.lab5

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    public lateinit var checkbox1: CheckBox
    public lateinit var checkbox2: CheckBox
    public lateinit var checkbox3: CheckBox
    public lateinit var count: EditText
    public lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        checkbox1 = findViewById(R.id.checkBox)
        checkbox2 = findViewById(R.id.checkBox2)
        checkbox3 = findViewById(R.id.checkBox3)
        count = findViewById(R.id.editTextNumberDecimal)
        button = findViewById(R.id.button)

        button.setOnClickListener(){


        }


    }



}