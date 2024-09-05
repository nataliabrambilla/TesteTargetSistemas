package com.example.questotcnica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.questotcnica1.databinding.ActivityMainBinding
import com.example.questotcnica1.databinding.ActivityQuestao2Binding

class Questao2Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityQuestao2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.voltar.setOnClickListener {
            finish()
        }

        binding.btnVerificar.setOnClickListener {
            val textoInserido = binding.editTextoVerificar.text.toString()

            var contagem = 0
            for (char in textoInserido) {
                if (char == 'a' || char == 'A') ++contagem
            }

            binding.textResultado.text = if (contagem > 0) {
                "A letra 'a' (maiúscula ou minúscula) aparece $contagem vezes."
            } else {
                "A letra 'a' (maiúscula ou minúscula) não aparece."
            }
        }

    }
}