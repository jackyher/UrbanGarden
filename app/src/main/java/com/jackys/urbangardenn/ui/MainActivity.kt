package com.jackys.urbangardenn.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.jackys.urbangardenn.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para ir de una actividad a otra
        val irRegistro = findViewById<Button>(R.id.btnRegistrate)
        val irHome = findViewById<Button>(R.id.btnVamos)

        irRegistro.setOnClickListener { goToRegister() }
        irHome.setOnClickListener { goToHome() }
    }

    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }

    private fun goToHome() {
        val i = Intent(this, HomeActivity::class.java)
        startActivity(i)
    }
}