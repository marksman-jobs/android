package com.marksman.frontend.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.marksman.frontend.R
import com.marksman.frontend.ui.login.LoginActivity

class UserType : AppCompatActivity() {

    private var user_type = "candidate"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_type)

        val candidate_button = findViewById<Button>(R.id.candidate_button)
        val recruiter_button = findViewById<Button>(R.id.recruiter_button)

        candidate_button?.setOnClickListener() {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("UserType", user_type)
            startActivity(intent)
        }

        recruiter_button?.setOnClickListener() {
            user_type = "recruiter"
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("UserType", user_type)
            startActivity(intent)
        }
    }
}