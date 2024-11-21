package com.jetbrains.kmpapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Lógica para mostrar el splash (opcional)
        // ...

        startSplash {
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Cierra la pantalla del Splash
        }
    }

    private fun startSplash(onSplashFinished: () -> Unit) {
        GlobalScope.launch {
            delay(3000) // Simular un retraso de 3 segundos
            onSplashFinished()
        }
    }
}