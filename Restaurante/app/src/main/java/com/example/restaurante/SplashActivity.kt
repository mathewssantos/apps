package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Cria um Handler para executar uma ação com atraso
        Handler(Looper.getMainLooper()).postDelayed({
            // Cria um Intent para iniciar a atividade de pedido
            val i = intent
            val j = Intent(this, PedidoActivity::class.java)
            // Passa os extras do Intent atual para o Intent da atividade de pedido
            j.putExtras(i)
            // Inicia a atividade de pedido
            startActivity(j)
        }, 2000) // Define um atraso de 2000 milissegundos (2 segundos) antes de iniciar a próxima atividade
    }
}
