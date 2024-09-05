package com.example.questotcnica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.questotcnica1.databinding.ActivityMainBinding
import com.example.questotcnica1.databinding.ActivityQuestao1Binding

class Questao1Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityQuestao1Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.voltar.setOnClickListener {
            finish()
        }

        binding.btnCalcular.setOnClickListener {
            val numeroInserido = binding.editNumero.text.toString() //DÚVIDA: pq converter para string e depois pra int?

            if (numeroInserido != "") {

                val sequenciaFibonacci = calcularSequenciaFibonacci(numeroInserido.toInt())
                binding.textResultadoFibonacci.text = sequenciaFibonacci.joinToString(", ")

                val pertenceSequencia = sequenciaFibonacci.contains(numeroInserido.toInt())
                if (pertenceSequencia) {
                    binding.textResultadoPertence.text = "Sim"
                } else {
                    binding.textResultadoPertence.text = "Não"
                }

            } else {
                binding.textResultadoFibonacci.text = "x"
                binding.textResultadoPertence.text = "Insira um número válido"
            }
        }

    }

    private fun calcularSequenciaFibonacci(numeroLimite: Int): List<Int> {

        val sequenciaFibonacci = mutableListOf<Int>()

        var a = 0
        var b = 1

        while (a <= numeroLimite) {
            sequenciaFibonacci.add(a)
            val soma = a + b
            a = b
            b = soma
        }
        return sequenciaFibonacci
    }
}