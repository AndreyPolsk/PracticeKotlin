package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            button -> changeText()
        }
    }

    private fun changeText() {
        if (button.text == getText(R.string.new_text)) button.text = getText(R.string.text)
        else button.text = getText(R.string.new_text)
    }
}
