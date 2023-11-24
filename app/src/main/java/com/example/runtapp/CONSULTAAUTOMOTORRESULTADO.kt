package com.example.runtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CONSULTAAUTOMOTORRESULTADO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultaautomotorresultado)

        val buttonAtras = findViewById<Button>(R.id.btnIntentToActivityAtras)

        buttonAtras.setOnClickListener {

            startActivity(Intent(this, ConsultaAutomotor::class.java))
            finish()
        }

        val buttonMeno = findViewById<Button>(R.id.btnIntentToActivityMenu)

        buttonMeno.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }
    }
}