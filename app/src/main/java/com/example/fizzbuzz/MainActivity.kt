package com.example.fizzbuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (number in 1..30) {
            when {
                number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
                number % 3 == 0 -> println("Fizz")
                number % 5 == 0 -> println("Buzz")
                else -> println(number)
            }
        }
    }
}