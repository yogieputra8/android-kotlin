package com.example.yogieputra.fizzbuzzapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..30){
            if (i % 15 == 0){
                Log.i("FizzBuzz", i.toString())
            } else if (i % 5 == 0){
                Log.i("Buzz", i.toString())
            } else if (i % 3 == 0){
                Log.i("Fizz", i.toString())
            }
        }
    }
}
