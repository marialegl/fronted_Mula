package com.jetbrains.screens.models

class Models {

    // Modelo para los pedidos
    data class Order(
        val deliveryDate: String,
        val status: String
    )

    // Modelo para las historias
    data class Story(
        val title: String,
        val description: String
    )

    // Modelo para los productos
    data class Product(
        val name: String,
        val description: String
    )

}