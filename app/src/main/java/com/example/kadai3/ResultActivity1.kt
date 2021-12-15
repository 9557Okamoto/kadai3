package com.example.kadai3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kadai3.databinding.ActivityResult1Binding

class ResultActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityResult1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResult1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val id1 = intent.getStringExtra("MY_GENDER")
        val id2 = intent.getStringExtra("MY_WEIGHT")
        val id3 = intent.getStringExtra("MY_AGE")
        val id4 = intent.getStringExtra("MY_LEVEL")

        binding.textView9.setText(id1)
        binding.textView10.setText(id2)
        binding.textView11.setText(id3)
        binding.textView12.setText(id4)

        binding.button2.setOnClickListener { finish() }
        binding.button3.setOnClickListener{onButtonTapped(it)}
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this,ResultActivity2::class.java)
        intent.putExtra("my_gender",binding.textView9.text.toString())
        intent.putExtra("my_weight",binding.textView10.text.toString())
        intent.putExtra("my_age",binding.textView11.text.toString())
        intent.putExtra("my_level",binding.textView12.text.toString())
        startActivity(intent)
    }
}