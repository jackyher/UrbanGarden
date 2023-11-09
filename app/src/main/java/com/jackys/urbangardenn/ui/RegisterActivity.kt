package com.jackys.urbangardenn.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jackys.urbangardenn.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Para ir de una actividad a otra
        val registrarseLogin = findViewById<Button>(R.id.buttonRegistrar) //Boton Registrarse
        val volverLogin = findViewById<TextView>(R.id.textViewVolver) //Boton volver

        registrarseLogin.setOnClickListener { goToLogin() }
        volverLogin.setOnClickListener { goToLogin() }
    }

    private fun goToLogin(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}