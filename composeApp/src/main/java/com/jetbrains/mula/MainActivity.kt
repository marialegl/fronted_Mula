package com.jetbrains.mula

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import com.jetbrains.mula.ui.screens.HomeScreen
import com.jetbrains.screens.repositories.DataRepository


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_App)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            // Obtener datos desde el repositorio
            val lastOrders = DataRepository.getOrders()
            val stories = DataRepository.getStories()
            val products = DataRepository.getProducts()

            // Mostrar la pantalla
            HomeScreen(
                lastOrders = lastOrders,
                stories = stories,
                products = products
            )
        }
    }
}


