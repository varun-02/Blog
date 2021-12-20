package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val splashScreen=4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val topAnim:Animation = AnimationUtils.loadAnimation(this,R.anim.top_anim)
        val bottomAnim:Animation = AnimationUtils.loadAnimation(this,R.anim.bottom_anim)
        val appName:TextView = findViewById(R.id.textView2)
        val appLogo:ImageView = findViewById(R.id.imageView2)
        val slogan:TextView = findViewById(R.id.textView3)

        appLogo.animation = topAnim
        appName.animation = bottomAnim
        slogan.animation = bottomAnim

        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@SplashActivity,Main::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())
    }
}