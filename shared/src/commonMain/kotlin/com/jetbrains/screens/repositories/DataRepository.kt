package com.jetbrains.screens.repositories

import com.jetbrains.screens.models.Order
import com.jetbrains.screens.models.Story
import com.jetbrains.screens.models.Product

object DataRepository {
    fun getOrders(): List<Order> = listOf(
        Order("Mon 21 Oct", "Ordered again"),
        Order("Mon 10 Oct", "Ordered again"),
        Order("Mon 1 Oct", "Ordered again")
    )

    fun getStories(): List<Story> = listOf(
        Story("Adipiscing aliquam scelerisque", "Sit tempor in egestas eget risus fames massa."),
        Story("Lorem ipsum dolor", "Morbi vitae ante tortor.")
    )

    fun getProducts(): List<Product> = listOf(
        Product("Product 1", "Description for product 1"),
        Product("Product 2", "Description for product 2")
    )
}
