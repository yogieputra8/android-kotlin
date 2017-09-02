package com.example.yogieputra.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.textview_result) as TextView
        val button_add = findViewById(R.id.button_add) as Button
        val button_minus = findViewById(R.id.button_minus) as Button
        val button_multiply = findViewById(R.id.button_multiple) as Button
        val button_divide = findViewById(R.id.button_divide) as Button

        button_add.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() + getNum2()).toString()
        })

        button_minus.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() - getNum2()).toString()
        })

        button_multiply.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() * getNum2()).toString()
        })

        button_divide.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() / getNum2()).toString()
        })
    }

    fun getNum1(): Int {
        val input_num1 = findViewById(R.id.num1) as EditText
        return Integer.parseInt(input_num1.text.toString())
    }

    fun getNum2(): Int {
        val input_num2 = findViewById(R.id.num2) as EditText
        return Integer.parseInt(input_num2.text.toString())
    }
}
