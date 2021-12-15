package com.example.kadai3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kadai3.databinding.ActivityResult2Binding

class ResultActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResult2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val id1 = intent.getStringExtra("my_gender")
        val id2 = intent.getStringExtra("my_weight")
        val id3 = intent.getStringExtra("my_age")
        val id4 = intent.getStringExtra("my_level")

        var weight: Float = id2!!.toFloat()
        var age: Int = Integer.parseInt(id3)
        var a = 0.0f
        var b = 0.0f
        var c = 0.0f

        if(id1=="男性"){
            if(age in 1..2){
                a = 61.0f
            }
            else if(age in 3..5){
                a = 54.8f
            }
            else if(age in 6..7){
                a = 44.3f
            }
            else if(age in 8..9){
                a = 40.8f
            }
            else if(age in 10..11){
                a = 37.4f
            }
            else if(age in 12..14){
                a = 31.0f
            }
            else if(age in 15..17){
                a = 27.0f
            }
            else if(age in 18..29){
                a = 24.0f
            }
            else if(age in 30..49){
                a = 22.3f
            }
            else if(age in 50..69){
                a = 21.5f
            }
            else{
                a = 21.5f
            }
        }

        else if(id1=="女性"){
            if(age in 1..2){
                a = 59.7f
            }
            else if(age in 3..5){
                a = 52.2f
            }
            else if(age in 6..7){
                a = 41.9f
            }
            else if(age in 8..9){
                a = 38.3f
            }
            else if(age in 10..11){
                a = 34.8f
            }
            else if(age in 12..14){
                a = 29.6f
            }
            else if(age in 15..17){
                a = 25.3f
            }
            else if(age in 18..29){
                a = 22.1f
            }
            else if(age in 30..49){
                a = 21.7f
            }
            else if(age in 50..69){
                a = 20.7f
            }
            else{
                a = 20.7f
            }
        }

        if(id4=="低"){
            if(age in 1..2){
                b = 0.0f
            }
            else if(age in 3..5){
                b= 0.0f
            }
            else if(age in 6..7){
                b = 1.35f
            }
            else if(age in 8..9){
                b = 1.40f
            }
            else if(age in 10..11){
                b = 1.45f
            }
            else if(age in 12..14){
                b = 1.45f
            }
            else if(age in 15..17){
                b = 1.55f
            }
            else if(age in 18..29){
                b = 1.50f
            }
            else if(age in 30..49){
                b = 1.50f
            }
            else if(age in 50..69){
                b = 1.50f
            }
            else{
                b = 1.45f
            }
        }

        else if(id4=="中"){
            if(age in 1..2){
                b = 1.35f
            }
            else if(age in 3..5){
                b= 1.45f
            }
            else if(age in 6..7){
                b = 1.55f
            }
            else if(age in 8..9){
                b = 1.60f
            }
            else if(age in 10..11){
                b = 1.65f
            }
            else if(age in 12..14){
                b = 1.65f
            }
            else if(age in 15..17){
                b = 1.75f
            }
            else if(age in 18..29){
                b = 1.75f
            }
            else if(age in 30..49){
                b = 1.75f
            }
            else if(age in 50..69){
                b = 1.75f
            }
            else{
                b = 1.70f
            }
        }

        else if(id4=="高"){
            if(age in 1..2){
                b = 0.0f
            }
            else if(age in 3..5){
                b= 0.0f
            }
            else if(age in 6..7){
                b = 1.75f
            }
            else if(age in 8..9){
                b = 1.80f
            }
            else if(age in 10..11){
                b = 1.85f
            }
            else if(age in 12..14){
                b = 1.85f
            }
            else if(age in 15..17){
                b = 1.95f
            }
            else if(age in 18..29){
                b = 2.00f
            }
            else if(age in 30..49){
                b = 2.00f
            }
            else if(age in 50..69){
                b = 2.00f
            }
            else{
                b = 1.95f
            }
        }

        c = a * weight * b
        val f : Int = c.toInt()
        val s : String = f.toString()
        if(f == 0){
            binding.textView15.setText("計算できません")
        }
        else{
            binding.textView15.setText(s + "kcal/日です！")
        }

        binding.button4.setOnClickListener{onButtonTapped(it)}
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}