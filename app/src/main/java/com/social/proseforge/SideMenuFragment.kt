package com.social.proseforge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.social.proseforge.BusFragment
import com.social.proseforge.CarPoolingFragment
import com.social.proseforge.HomeFragment
import com.social.proseforge.RecipesFragment

class SideMenuFragment : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_side_menu, container, false)

        val home: TextView = view.findViewById(R.id.home)
        val carpooling: TextView = view.findViewById(R.id.carpooling)
        val bus: TextView = view.findViewById(R.id.bus)
        val recipes: TextView = view.findViewById(R.id.recipes)

        home.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.main_layout, HomeFragment()).commit()
        }

        carpooling.setOnClickListener{
            childFragmentManager.beginTransaction().replace(R.id.home_layout, CarPoolingFragment()).commit()
        }

        bus.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.main_layout, BusFragment()).commit()
        }

        recipes.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.main_layout, RecipesFragment()).commit()
        }

        return view
    }
}