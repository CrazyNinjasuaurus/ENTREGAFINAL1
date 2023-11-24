package com.example.runtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ACTUALIZAR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar)

        val buttonAtras = findViewById<Button>(R.id.btnIntentToActivityAtras)

        buttonAtras.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }

        val buttonMeno = findViewById<Button>(R.id.btnIntentToActivityMenu)

        buttonMeno.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }

        val buttonCancelar = findViewById<Button>(R.id.btnIntentToActivityCancelar)

        buttonCancelar.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }

        val buttonSiguiente = findViewById<Button>(R.id.buttonSiguiente)

        buttonSiguiente.setOnClickListener {
            startActivity(Intent(this, ACTUALIZARCODIGOSEG::class.java))
        }
    }
}