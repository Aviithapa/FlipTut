package com.example.fliptut.ui.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fliptut.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)


        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.setCustomAnimations(android.R.anim.bounce_interpolator, android.R.anim.bounce_interpolator);
        fragmentTransaction.replace(R.id.authLayout, LoginFragment()).commit()

    }
}