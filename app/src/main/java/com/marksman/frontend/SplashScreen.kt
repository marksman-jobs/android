package com.marksman.frontend

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marksman.frontend.ui.HomeScreen
import com.marksman.frontend.ui.UserType

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val sharedPref = this.getSharedPreferences(
            getString(R.string.preference_file_key), Context.MODE_PRIVATE)

        if (sharedPref.getBoolean(getString(R.string.user_logged_in), false)) {
            startActivity(Intent(this, HomeScreen::class.java))
        } else {
            startActivity(Intent(this, UserType::class.java))
        }
    }
}