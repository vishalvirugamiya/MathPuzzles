package com.example.mathpuzzles

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Myadapter(var selectPuzzle: select_puzzle) : BaseAdapter() {
    override fun getCount(): Int {
        return 75
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var leyouttInflater: LayoutInflater = LayoutInflater.from(selectPuzzle)

        var view: View = leyouttInflater.inflate(R.layout.sel_puz_item, null)

        var button: Button = view.findViewById(R.id.view_button)
        var image: ImageView = view.findViewById(R.id.image_view)

        var status = MainActivity.sharedPreferences.getString("status" + position, "lock")
        var lastLevel = MainActivity.sharedPreferences.getInt("lastLevel", 0)

        if (status == "clear") {
            image.setImageResource(R.drawable.tick)
            button.setText("${position + 1}")

        } else if (status == "skip" || lastLevel == position) {
            button.setText("${position + 1}")
        } else {

            image.setImageResource(R.drawable.lock)
        }

        //   button.setText("${position+1}")
        if (status != "lock" || lastLevel == position) {
            button.setOnClickListener {

                var intent = Intent(selectPuzzle, MainActivity2::class.java)
                intent.putExtra("position", position)
                selectPuzzle.startActivity(intent)
                selectPuzzle.finish()
            }
        }
        return view
    }

}