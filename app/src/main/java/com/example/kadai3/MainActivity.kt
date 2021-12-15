package com.example.kadai3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.kadai3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{onButtonTapped(it)}
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this,ResultActivity1::class.java)
        intent.putExtra("MY_GENDER",binding.et1.text.toString())
        intent.putExtra("MY_WEIGHT",binding.et2.text.toString())
        intent.putExtra("MY_AGE",binding.et3.text.toString())
        intent.putExtra("MY_LEVEL",binding.et4.text.toString())
        startActivity(intent)
    }
}