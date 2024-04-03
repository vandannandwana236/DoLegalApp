package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityStoryBinding
import com.example.quizapp.databinding.ActivityWinnerBinding

class WinnerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWinnerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val score: String? = intent.getStringExtra("score")
        binding.points.text = "Points : $score/3"
        binding.playAgainButton.setOnClickListener{
            Toast.makeText(this,"Next Story is coming soon...",Toast.LENGTH_LONG).show()
        }
        

    }
}