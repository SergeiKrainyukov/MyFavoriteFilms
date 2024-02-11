package com.sergeikrainyukov.myfavoritefilms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFilmsFragment()
    }

    private fun openFilmsFragment() {
        Navigator.navigateReplace(FilmsListFragment(), supportFragmentManager)
    }
}