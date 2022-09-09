package com.example.randomizer

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.randomizer.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress)

            resultsTextView.text = rand.toString()
        }


    }
}