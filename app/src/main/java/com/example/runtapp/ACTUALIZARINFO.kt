package com.example.runtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ACTUALIZARINFO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizarinfo)

        val buttonAtras = findViewById<Button>(R.id.btnIntentToActivityAtras)

        buttonAtras.setOnClickListener {

            startActivity(Intent(this, ACTUALIZAR::class.java))
            finish()
        }

        val buttonMeno = findViewById<Button>(R.id.btnIntentToActivityMenu)

        buttonMeno.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }

        val buttonSiguiente = findViewById<Button>(R.id.buttonSiguiente)

        buttonSiguiente.setOnClickListener {
            startActivity(Intent(this, ACTUALIZARRESULTADO::class.java))
        }

    }
}
