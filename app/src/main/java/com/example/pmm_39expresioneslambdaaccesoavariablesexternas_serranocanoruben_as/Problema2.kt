package com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as.databinding.ActivityMainBinding
import com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = IntArray(10){(0..99).random()}

        var cantidadMultiplos3 = 0
        listaEnteros.forEach{
            if (it % 3 == 0)
                cantidadMultiplos3++
        }
        var suma = 0
        listaEnteros.forEach{
            if (it > 50)
                suma += it
        }

        var enteros = ""
        for (integer in listaEnteros)
            enteros += " $integer"

        binding.tvResultado20.text = enteros
            .plus("\n Multiplos de 3: $cantidadMultiplos3")
            .plus("\n Suma de enteros mayores a 50: $suma")
    }
}