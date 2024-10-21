package com.example.mathpuzzles

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    lateinit var complete_puzzle:TextView
    lateinit var conti_nue : Button
    lateinit var main_menu : Button
    lateinit var buy_pro : Button
    lateinit var shere_ : Button
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var position=intent.getIntExtra("position",0)

        complete_puzzle=findViewById(R.id.complete_puzzle)
        complete_puzzle.text="Puzzle ${position} complet"


        conti_nue=findViewById(R.id.conti_nue)
        conti_nue.setOnClickListener {

            var intent=Intent(this@MainActivity3,MainActivity2::class.java)
            intent.putExtra("position",position)                                               //continue Button
            startActivity(intent)

            finish()

        }

        main_menu=findViewById(R.id.main_menu)
        main_menu.setOnClickListener {

            finish()
        }

        buy_pro=findViewById(R.id.buy_pro)
        buy_pro.setOnClickListener {


        }


    }
}


