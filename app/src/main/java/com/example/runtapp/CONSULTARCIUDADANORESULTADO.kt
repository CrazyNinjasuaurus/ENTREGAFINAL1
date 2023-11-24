package com.example.runtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CONSULTARCIUDADANORESULTADO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultarciudadanoresultado)

        val buttonAtras = findViewById<Button>(R.id.btnIntentToActivityAtras)

        buttonAtras.setOnClickListener {

            startActivity(Intent(this, CONSULTARCIUDADANO::class.java))
            finish()
        }

        val buttonMeno = findViewById<Button>(R.id.btnIntentToActivityMenu)

        buttonMeno.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }
    }
}