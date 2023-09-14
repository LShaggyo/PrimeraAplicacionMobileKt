package com.example.pruebalogin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val confirmButton = findViewById<Button>(R.id.confirmRegisterButton)
        confirmButton.setOnClickListener {
            // Aquí puedes añadir el código para guardar la información del usuario
            // Por ahora, simplemente cerramos la actividad
            finish()
        }
    }
}
