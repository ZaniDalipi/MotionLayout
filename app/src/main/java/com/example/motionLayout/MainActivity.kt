package com.example.motionLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d(Companion.TAG, "onCreate() called with: savedInstanceState = [savedInstanceState]")
    }

    companion object {
        private const val TAG = "MainActivity"
    }

}
