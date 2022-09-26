package com.dacha.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dacha.hellokotlin.databinding.ActivityMain2Binding
import com.dacha.hellokotlin.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}