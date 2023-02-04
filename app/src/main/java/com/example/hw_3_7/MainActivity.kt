package com.example.hw_3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_7.databinding.ActivityMainBinding

private  lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}