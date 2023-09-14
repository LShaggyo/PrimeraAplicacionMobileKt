package com.example.pruebalogin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AccountDetailActivity : AppCompatActivity() {

    private lateinit var tvTotalBalance: TextView
    private lateinit var etAmount: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_detail)

        val tvAccountHolder = findViewById<TextView>(R.id.tvAccountHolder)
        val tvAccountNumber = findViewById<TextView>(R.id.tvAccountNumber)
        tvTotalBalance = findViewById(R.id.tvTotalBalance)
        etAmount = findViewById(R.id.etAmount)

        val btnAddMoney = findViewById<Button>(R.id.btnAddMoney)
        val btnWithdrawMoney = findViewById<Button>(R.id.btnWithdrawMoney)

        // Suponiendo que tienes alguna forma de obtener esta información, por ejemplo, desde SharedPreferences o una base de datos.
        tvAccountHolder.text = "Titular: [nombre_usuario]"
        tvAccountNumber.text = "Número de cuenta: [numero_cuenta]"
        tvTotalBalance.text = "Saldo total: $[cantidad]"

        btnAddMoney.setOnClickListener {
            val amountToAdd = etAmount.text.toString().toDoubleOrNull()
            amountToAdd?.let {
                // Aquí deberías actualizar el saldo en tu base de datos o donde sea que lo guardes
                // Supongamos que tienes una función updateBalance que hace esto
                updateBalance(it)
                tvTotalBalance.text = "Saldo total: $[nuevo_saldo]"
            }
        }

        btnWithdrawMoney.setOnClickListener {
            val amountToWithdraw = etAmount.text.toString().toDoubleOrNull()
            amountToWithdraw?.let {
                // Aquí, nuevamente, actualizas el saldo
                updateBalance(-it)
                tvTotalBalance.text = "Saldo total: $[nuevo_saldo]"
            }
        }
    }

    private fun updateBalance(amount: Double) {
        // Actualiza el saldo en la base de datos o SharedPreferences
        // Retorna el nuevo saldo para actualizar la interfaz
    }
}
