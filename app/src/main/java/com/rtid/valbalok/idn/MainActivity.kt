package com.rtid.valbalok.idn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rtid.valbalok.idn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Binding
        setContentView(binding.root)
    }
}