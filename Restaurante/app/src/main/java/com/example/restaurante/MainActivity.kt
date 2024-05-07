package com.example.restaurante

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Infla o layout da atividade principal usando o vinculador gerado pelo View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Obtém o nome de usuário passado da atividade de login através do Intent
        val username = intent.extras?.getString("username")

        // Se o nome de usuário não estiver vazio, exibe uma saudação personalizada
        if (!username.isNullOrEmpty()) {
            binding.textOla.text = "Olá $username"
        }

        // Configura o clique do botão para fechar a atividade
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }

        // Configura o comportamento do checkbox da pizza
        binding.checkPizza.setOnClickListener {
            if (binding.checkPizza.isChecked()) {
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            } else {
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        // Configura o comportamento do checkbox da salada
        binding.checkSalada.setOnClickListener {
            if (binding.checkSalada.isChecked()) {
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        // Configura o comportamento do checkbox do hambúrguer
        binding.checkHamburger.setOnClickListener {
            if (binding.checkHamburger.isChecked()) {
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }
    }
}
