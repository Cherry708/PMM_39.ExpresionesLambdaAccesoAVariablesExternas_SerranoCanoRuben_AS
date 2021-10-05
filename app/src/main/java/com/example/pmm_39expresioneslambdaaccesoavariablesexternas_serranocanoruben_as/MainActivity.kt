package com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = IntArray(10){(0..99).random()}
        var cantidadMultiplos3 = 0
        comprobarLista(listaEnteros){
            if (it % 3 == 0)
                cantidadMultiplos3++
        }
        var suma = 0
        comprobarLista(listaEnteros){
            if (it > 50)
                suma += it
        }

        var enteros = ""
        for (integer in listaEnteros)
            enteros += " $integer"


        binding.tvResultado10.text = enteros
            .plus("\n Multiplos de 3: $cantidadMultiplos3")
            .plus("\n Suma de enteros mayores a 50: $suma")


    }
    fun comprobarLista(listaEnteros: IntArray, funcion:(Int) -> Unit) {
        for(elemento in listaEnteros)
            (funcion(elemento))
    }
}