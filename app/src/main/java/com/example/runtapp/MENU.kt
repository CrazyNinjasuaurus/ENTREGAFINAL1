package com.example.runtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MENU : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonAtras = findViewById<Button>(R.id.btnIntentToActivityAtras)

        buttonAtras.setOnClickListener {

            startActivity(Intent(this, INICIO::class.java))
            finish()
        }

        val buttonMeno = findViewById<Button>(R.id.btnIntentToActivityMenu)

        buttonMeno.setOnClickListener {

            startActivity(Intent(this, MENU::class.java))
            finish()
        }

        val buttonVehiculo = findViewById<Button>(R.id.btnIntentToActivityConsultaAuto)

        buttonVehiculo.setOnClickListener {

            startActivity(Intent(this, ConsultaAutomotor::class.java))
            finish()
        }


        val buttonConsultaCiudadano = findViewById<Button>(R.id.btnIntentToActivityConsultaCiud)

        buttonConsultaCiudadano.setOnClickListener {

            startActivity(Intent(this, CONSULTARCIUDADANO::class.java))
            finish()
        }

        val buttonActualizar = findViewById<Button>(R.id.btnIntentToActivityActualizar)

        buttonActualizar.setOnClickListener {

            startActivity(Intent(this, ACTUALIZAR::class.java))
            finish()
        }

        val buttonContacto = findViewById<Button>(R.id.btnIntentToActivityContacto)

        buttonContacto.setOnClickListener {

            startActivity(Intent(this, CONTACTENOS::class.java))
            finish()
        }
    }
}