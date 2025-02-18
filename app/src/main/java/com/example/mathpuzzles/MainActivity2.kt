package com.example.mathpuzzles

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class  MainActivity2 : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var button0: Button

    lateinit var submit: Button
    lateinit var textVi: TextView
    lateinit var deletB: ImageView
    lateinit var skipButton: ImageView

    val intArray = intArrayOf(
        R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5,
        R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10,

        R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15,
        R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19, R.drawable.p20,

        R.drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24, R.drawable.p25,
        R.drawable.p26, R.drawable.p27, R.drawable.p28, R.drawable.p29, R.drawable.p30,

        R.drawable.p31, R.drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35,
        R.drawable.p36, R.drawable.p37, R.drawable.p38, R.drawable.p39, R.drawable.p40,

        R.drawable.p41, R.drawable.p42, R.drawable.p43, R.drawable.p44, R.drawable.p45,
        R.drawable.p46, R.drawable.p47, R.drawable.p48, R.drawable.p49, R.drawable.p50,

        R.drawable.p51, R.drawable.p52, R.drawable.p53, R.drawable.p54, R.drawable.p55,
        R.drawable.p56, R.drawable.p57, R.drawable.p58, R.drawable.p59, R.drawable.p60,

        R.drawable.p61, R.drawable.p62, R.drawable.p63, R.drawable.p64, R.drawable.p65,
        R.drawable.p66, R.drawable.p67, R.drawable.p68, R.drawable.p69, R.drawable.p70,

        R.drawable.p71, R.drawable.p72, R.drawable.p73, R.drawable.p74, R.drawable.p75,
    )

    var ansPzz = arrayOf(
        "10", "25", "6", "14", "128", "7", "50", "1025", "100", "3",    // 1-10
        "212", "3011", "14", "16", "1", "2", "44", "45", "625", "1",            // 11-20
        "13", "47", "50", "34", "6", "41", "16", "126", "82", "14",              // 21-30
        "7", "132", "34", "48", "42", "288", "45", "4", "111", "47",             // 31-40
        "27", "87", "22", "253", "12", "48", "`178", "1", "6", "10",             // 41-50
        "2", "20", "7", "511", "143547", "84", "11", "27", "3", "5",             // 51-60
        "39", "31", "10", "130", "22", "3", "14", "42", "164045", "11",          // 61-70
        "481", "86", "84", "13", "8"                                        // 71-75
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        var position = intent.getIntExtra("position", 0)

        var textBoard = findViewById<TextView>(R.id.textBoard)
        textBoard.text = "Puzzle ${position + 1}"

        var levelIm = findViewById<ImageView>(R.id.levelImage)
        levelIm.setImageResource(intArray[position])


        textVi = findViewById(R.id.textAC2)

        button1 = findViewById(R.id.button1)
        button1.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "1")
        }

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "2")
        }

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "3")
        }

        button4 = findViewById(R.id.button4)
        button4.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "4")
        }

        button5 = findViewById(R.id.button5)
        button5.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "5")
        }

        button6 = findViewById(R.id.button6)
        button6.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "6")
        }

        button7 = findViewById(R.id.button7)
        button7.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "7")
        }

        button8 = findViewById(R.id.button8)
        button8.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "8")
        }

        button9 = findViewById(R.id.button9)
        button9.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "9")
        }

        button0 = findViewById(R.id.button00)
        button0.setOnClickListener {
            var s: String = textVi.text.toString()
            textVi.setText(s + "0")
        }


        deletB = findViewById(R.id.delet_bT)

        deletB.setOnClickListener {
            var s: String = textVi.text.toString()     //delete Button
            if (s.length > 0) {
                s = s.substring(0, s.length - 1)
                textVi.setText(s)
            }
        }

        submit = findViewById(R.id.submit)
        submit.setOnClickListener {


            var arrayy: String =
                textVi.text.toString()                                              //submit Button

            if (arrayy == ansPzz[position]) {


                MainActivity.editor.putString("status" + position, "clear")
                MainActivity.editor.apply()

                var lastLevel = MainActivity.sharedPreferences.getInt("lastLevel", 0)
                if (lastLevel <= position + 1) {
                    MainActivity.editor.putInt("lastLevel", position + 1)
                    MainActivity.editor.apply()

                }
                var intent = Intent(this@MainActivity2, MainActivity3::class.java)
                intent.putExtra("position", position + 1)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this@MainActivity2, "wrong ", Toast.LENGTH_SHORT).show()
                textVi.text = ""
            }

        }

        skipButton = findViewById(R.id.skip)
        skipButton.setOnClickListener {

            var levStatus = MainActivity.sharedPreferences.getString("status" + position, "lock")

            if (levStatus != "clear") {
                MainActivity.editor.putString("status" + position, "skip")
                MainActivity.editor.apply()
            }

            var lastLevel = MainActivity.sharedPreferences.getInt("lastLevel", 0)
            if (lastLevel <= position + 1) {
                MainActivity.editor.putInt("lastLevel", position + 1)
                MainActivity.editor.apply()
            }

            var intent =
                Intent(this@MainActivity2, MainActivity2::class.java)             //skip button
            intent.putExtra("position", position + 1)
            startActivity(intent)
            finish()
        }


    }


}
