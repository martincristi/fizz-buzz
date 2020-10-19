package com.example.fizzbuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number: Int = 1

        for (number in  1..100) {
            if (number % 3 == 0 && number % 5 == 0) {
                println("FizzBuzz")
                continue
            }
            if (number % 3 == 0) {
                println("Fizz")
                continue
            }
            if (number % 5 == 0) {
                println("Buzz")
                continue
            }

            println(number)
        }
    }
}