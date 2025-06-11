package com.example.mathpuzzles

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var contin:TextView
    lateinit var puzzles:TextView
    lateinit var buypro:TextView

    companion object{

        lateinit var sharedPreferences: SharedPreferences
        lateinit var editor: SharedPreferences.Editor
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sharedPreferences = getSharedPreferences("Math Puzzle",0)
        editor = sharedPreferences.edit()

         contin=findViewById(R.id.continue_)
         contin.setOnClickListener {

             var levelIndex = MainActivity.sharedPreferences.getInt("lastLevel",0)

             var  intent= Intent(this@MainActivity,MainActivity2::class.java)
             intent.putExtra("position", levelIndex)
             startActivity(intent)

         }

        puzzles=findViewById(R.id.puzzles)
        puzzles.setOnClickListener {

            var  intent= Intent(this@MainActivity,select_puzzle::class.java)
            startActivity(intent)
        }

        buypro=findViewById(R.id.buypro)
        buypro.setOnClickListener {


        }
    }


}