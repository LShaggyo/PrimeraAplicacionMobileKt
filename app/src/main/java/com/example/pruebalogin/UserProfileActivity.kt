package com.example.pruebalogin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val saveProfileButton = findViewById<Button>(R.id.saveProfileButton)
        saveProfileButton.setOnClickListener {
            // Aquí puedes añadir el código para guardar la información del usuario editada.
            // Por ejemplo, guardar en una base de datos local o enviar a un servidor.
            finish() // Cierra la actividad después de guardar, volviendo al menú personal.
        }
    }
}
