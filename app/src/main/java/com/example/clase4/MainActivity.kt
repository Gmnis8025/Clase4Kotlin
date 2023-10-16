package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rodolfo=Adulto("Rodolfo", 29,"Estudiante", estadoCivil =EstadoCivil.SOLTERO )
        Toast.makeText(this, rodolfo.obtenerNombre(),Toast.LENGTH_LONG).show()











    }
}