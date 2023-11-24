package com.example.runtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ACTUALIZARCODIGOSEG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizarcodigoseg)

        val buttonSiguiente = findViewById<Button>(R.id.buttonSiguiente)

        buttonSiguiente.setOnClickListener {
            startActivity(Intent(this, ACTUALIZARINFO::class.java))
        }
    }

}