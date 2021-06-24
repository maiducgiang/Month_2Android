package com.example.appmonth2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appmonth2.databinding.ActivityMainBinding
import com.example.appmonth2.fragment.GmailFragment

class MainActivity : AppCompatActivity() {
    private  lateinit var mainActivityBinding: ActivityMainBinding
    private val gmailFragment = GmailFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}