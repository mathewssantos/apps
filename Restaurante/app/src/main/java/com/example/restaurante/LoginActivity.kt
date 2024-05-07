package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Infla o layout da atividade de login usando o vinculador gerado pelo View Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura o ouvinte de clique para o botão de entrada
        binding.buttonEntrar.setOnClickListener {
            // Obtém o nome de usuário e senha dos campos de edição e remove espaços em branco
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            // Verifica se o nome de usuário e a senha correspondem aos valores esperados
            if (username == "abc" && password == "123") {
                // Se as credenciais forem corretas, cria um Intent para iniciar a atividade principal
                val i = Intent(this, MainActivity::class.java)
                // Adiciona o nome de usuário ao Intent para ser usado na atividade principal
                i.putExtra("username", username)
                startActivity(i)
                // Finaliza a atividade de login para evitar que o usuário volte pressionando "Voltar"
                finish()
            } else {
                // Se as credenciais estiverem incorretas, exibe um Toast informando o erro
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }
    }
}

    }
}
