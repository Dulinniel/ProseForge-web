package com.social.proseforge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class HomeFragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val drawerLayout: DrawerLayout = view.findViewById(R.id.drawerLayout)
        val buttonMenu: Button = view.findViewById(R.id.buttonPanel)

        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        val textView : TextView = view.findViewById(R.id.title)

        buttonMenu.setOnClickListener{
            drawerLayout.openDrawer(GravityCompat.START, true)
        }

        val args = this.arguments
        val inputData: String? = args?.getString("data")
        textView.text = inputData.toString()
        return view
    }
}