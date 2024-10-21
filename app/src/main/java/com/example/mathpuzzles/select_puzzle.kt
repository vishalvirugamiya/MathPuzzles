package com.example.mathpuzzles

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class select_puzzle : AppCompatActivity() {

    lateinit var buttonList: GridView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_select_puzzle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // var position = intent.getIntExtra("position", 0)

        buttonList = findViewById(R.id.button_list)

        var myadapter = Myadapter(this@select_puzzle)
        buttonList.adapter = myadapter

    }

}
// zsbdfjhb sdfh gjhdbfh
// output -> how can i do?
// Intent
//Why write this line?
// Answer

//Practice -> 20

