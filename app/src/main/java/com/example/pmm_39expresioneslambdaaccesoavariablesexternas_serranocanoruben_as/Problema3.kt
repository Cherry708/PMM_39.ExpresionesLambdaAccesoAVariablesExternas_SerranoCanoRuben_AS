package com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as.databinding.ActivityProblema3Binding

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val binding = ActivityProblema3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaPersonas = arrayOf(
            Persona("Juan",20),
            Persona("Luis",17),
            Persona("Antonio",18),
            Persona("Alberto",19),
        )

        var mayoresDeEdad = 0
        listaPersonas.forEach {
            if (it.esMayorDeEdad())
                mayoresDeEdad++
        }

        var personas = ""
        for (persona in listaPersonas){
            personas += " [$persona]\n"
        }
        var mensajeEdades = "El total de personas mayores de edad es: $mayoresDeEdad"
        binding.tvResultado30.text = personas
            .plus("\n $mensajeEdades")

    }
}

class Persona(val nombre: String, val edad: Int){
    fun esMayorDeEdad():Boolean{
        return edad >= 18
    }

    override fun toString(): String {
        return "$nombre, edad: $edad años"
    }
}