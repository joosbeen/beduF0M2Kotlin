package com.example.app.beduf0m2kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ParametrosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parametros)

        val intent = intent
        val nombre = intent.getStringExtra("nombre")
        val apellidos = intent.getStringExtra("apellidos")

        val txtParametroNombre = findViewById<TextView>(R.id.txtParametroNombre)
        val txtParametroApellidos = findViewById<TextView>(R.id.txtParametroApellidos)

        txtParametroApellidos.text = nombre
        txtParametroNombre.text = apellidos
        //val textView: TextView = findViewById(R.id.txtParanetroNombre) as TextView

    }

}
