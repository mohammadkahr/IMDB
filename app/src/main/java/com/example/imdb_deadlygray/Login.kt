package com.example.imdb_deadlygray


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.imdb_deadlygray.data.signup
import kotlinx.android.synthetic.main.login.*


class Login : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        buttonSubmit.setOnClickListener{
            val parameterIntent = Intent(this,SignUp::class.java)
            startActivity(parameterIntent)
        }
    }

}