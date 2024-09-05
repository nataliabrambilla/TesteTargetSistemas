package com.example.questotcnica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.questotcnica1.databinding.ActivityMainBinding
import com.example.questotcnica1.databinding.ActivityQuestao1Binding
import com.example.questotcnica1.databinding.ActivityQuestao2Binding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnQuestao1.setOnClickListener {
            val intent = Intent(this, Questao1Activity::class.java)
            startActivity(intent)
        }

        binding.btnQuestao2.setOnClickListener {
            val intent = Intent(this, Questao2Activity::class.java)
            startActivity(intent)
        }

    }

    //1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
// informado um número, ele calcule a sequência de Fibonacci e
// retorne uma mensagem avisando se o número informado pertence ou não a sequência


}