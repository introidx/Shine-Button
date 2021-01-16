package com.geeksforgeeks.shinebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {

    lateinit var shine : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shine = findViewById(R.id.shine)
        shineAnimation()
    }

    private fun shineAnimation() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.left_right)
        shine.startAnimation(anim)
        anim.setAnimationListener(object : Animation.AnimationListener  {
            override fun onAnimationStart(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {
                shine.startAnimation(anim)
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }


        })
    }
}