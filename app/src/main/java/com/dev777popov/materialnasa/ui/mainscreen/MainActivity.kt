package com.dev777popov.materialnasa.ui.mainscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev777popov.materialnasa.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainScreenFragment.newInstance())
                .commitNow()
        }
    }
}