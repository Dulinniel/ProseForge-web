package com.social.proseforge

import com.iut.studhelp.utils.ExtractUsernameFromEmailAdresse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.social.proseforge.RegisterFragment

class LoginFragment : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val registerButton: Button = view.findViewById(R.id.btn_register)
        val connexionButton: Button = view.findViewById(R.id.btn_login)
        val usernameTextField: TextView = view.findViewById(R.id.email)

        registerButton.setOnClickListener{
            val registerFragment = RegisterFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.main_layout, registerFragment).commit()
        }

        connexionButton.setOnClickListener{
            val mail = usernameTextField.findViewById<TextView>(R.id.email)
            //val password = editText.findViewById<EditText>(R.id.password)
            val username: String = ExtractUsernameFromEmailAdresse(mail.text.toString())
            val bundle = Bundle()
            bundle.putString("data", username)

            val fragment = HomeFragment()
            fragment.arguments = bundle
            parentFragmentManager.beginTransaction().replace(R.id.main_layout, fragment).commit()
        }

        return view
    }
}

