package com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as.databinding.ActivityProblema3Binding
import com.example.pmm_39expresioneslambdaaccesoavariablesexternas_serranocanoruben_as.databinding.ActivityProblema4Propuesto1Binding

class Problema4Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema4_propuesto1)

        val binding = ActivityProblema4Propuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaDados = arrayOf(
            Dado(),
            Dado(),
            Dado(),
            Dado(),
            Dado()
        )

        for (dado in listaDados){
            dado.tirar()
        }

        var valor1 = 0
        var valor2 = 0
        var valor3 = 0
        var valor4 = 0
        var valor5 = 0
        var valor6 = 0

        listaDados.forEach {
            when(it.valor){
                1 -> valor1++
                2 -> valor2++
                3 -> valor3++
                4 -> valor4++
                5 -> valor5++
                6 -> valor6++
            }
        }

        val valores1 = "Dados con valor 1: $valor1 \n"
        val valores2 = "Dados con valor 2: $valor2 \n"
        val valores3 = "Dados con valor 3: $valor3 \n"
        val valores4 = "Dados con valor 4: $valor4 \n"
        val valores5 = "Dados con valor 5: $valor5 \n"
        val valores6 = "Dados con valor 6: $valor6 \n"

        binding.tvResultado40.text = valores1
            .plus(valores2)
            .plus(valores3)
            .plus(valores4)
            .plus(valores5)
            .plus(valores6)

    }
}
class Dado(){
    var valor:Int = 0
    init {
        tirar()
    }
    fun tirar(){
        valor = (1..6).random()
    }

    override fun toString(): String {
        return "Dado: valor $valor"
    }

}