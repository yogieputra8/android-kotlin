package com.example.yogieputra.simplelistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NewList = arrayOf("Yogie", "Nia", "Kevin")
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, NewList)
        list.adapter = listAdapter
    }
}
