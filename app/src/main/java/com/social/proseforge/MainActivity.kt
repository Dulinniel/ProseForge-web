package com.social.proseforge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.social.proseforge.LoginFragment

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val loginFragment = LoginFragment()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.main_layout, loginFragment).commit()
    }
}