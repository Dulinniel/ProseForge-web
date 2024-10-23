package com.social.proseforge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.social.proseforge.LoginFragment

class RegisterFragment : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val btn = view.findViewById<Button>(R.id.btn_login)

        btn.setOnClickListener{
            val loginFragment = LoginFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.main_layout, loginFragment).commit()
        }
        return view
    }
}