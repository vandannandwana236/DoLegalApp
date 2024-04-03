package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
//            Firebase.auth.createUserWithEmailAndPassword(binding.email.editText?.text.toString(),binding.password.editText?.text.toString())
//                .addOnCompleteListener {
//                    if(it.isSuccessful){
//                        Toast.makeText(this,"Logon Successful",Toast.LENGTH_SHORT).show()
                        intent = Intent(this,StoryActivity::class.java)
                        startActivity(intent)
                        finish()
//                    }
//                    else{
//                        Toast.makeText(this,"Logon Not Successful",Toast.LENGTH_SHORT).show()
//                    }
//                }
        }
    }
}