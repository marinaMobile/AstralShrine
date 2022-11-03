package com.nintendo.zak.white

import android.animation.ObjectAnimator
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nintendo.zak.R
import kotlinx.android.synthetic.main.activity_game.*

class Game : AppCompatActivity() {

    var currentProgress: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        progress_bar.progressTintList = ColorStateList.valueOf(Color.WHITE);

        progress_bar.max = 200
        cat.setOnClickListener{
            currentProgress++
            ObjectAnimator.ofInt(progress_bar, "progress", currentProgress)
                .start()
            if (currentProgress==200) {
                progress_bar.visibility = View.INVISIBLE
                cat.visibility = View.INVISIBLE
                hatcat.visibility = View.VISIBLE
                txt.text = "Cat is happy! Keep on clicking!"

            }
        }
    }
}