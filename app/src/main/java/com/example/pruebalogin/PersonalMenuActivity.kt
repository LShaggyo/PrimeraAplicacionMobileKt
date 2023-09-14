package com.example.pruebalogin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class PersonalMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_menu)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val balanceTextView = findViewById<TextView>(R.id.balanceTextView)

        // Supongamos que obtenemos el nombre y el saldo de alguna fuente (p.ej., una base de datos local o un servidor)
        val userName = "Usuario Ejemplo" // Deberías reemplazar esta línea con el código apropiado para obtener el nombre real del usuario.
        val userBalance = 100.00 // Deberías reemplazar esta línea con el código apropiado para obtener el saldo real del usuario.

        welcomeTextView.text = "Bienvenido, $userName"
        balanceTextView.text = "Saldo: $$userBalance"

        val profileButton = findViewById<Button>(R.id.profileButton)
        profileButton.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        val btnAccountDetails = findViewById<Button>(R.id.btnAccountDetails)
        btnAccountDetails.setOnClickListener {
            val intent = Intent(this, AccountDetailActivity::class.java)
            startActivity(intent)
        }


    }
}
