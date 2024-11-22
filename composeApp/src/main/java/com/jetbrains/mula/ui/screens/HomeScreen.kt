package com.jetbrains.mula.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jetbrains.screens.models.Order
import com.jetbrains.screens.models.Story
import com.jetbrains.screens.models.Product

@Composable
fun HomeScreen(
    lastOrders: List<Order>,
    stories: List<Story>,
    products: List<Product>
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // Sección "Last Orders"
        Text("Last orders", style = MaterialTheme.typography.titleLarge)
        LazyRow {
            items(lastOrders.size) { index ->
                val order = lastOrders[index]
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp)
                        .height(80.dp),
                    elevation = CardDefaults.cardElevation(4.dp) // Corregido
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text("DELIVERY DATE:", style = MaterialTheme.typography.labelSmall)
                        Text(order.deliveryDate.toString(), style = MaterialTheme.typography.bodyMedium)
                        Button(onClick = { /* Acción de reordenar */ }) {
                            Text(order.status)
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sección "Stories"
        Text("Stories about producers", style = MaterialTheme.typography.titleLarge)
        LazyRow {
            items(stories.size) { index ->
                val story = stories[index]
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(300.dp)
                        .height(200.dp),
                    elevation = CardDefaults.cardElevation(4.dp) // Corregido
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(story.title, style = MaterialTheme.typography.bodyLarge)
                        Text(story.description, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sección "New Products"
        Text("New products", style = MaterialTheme.typography.titleLarge)
        LazyRow {
            items(products.size) { index ->
                val product = products[index]
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp)
                        .height(200.dp),
                    elevation = CardDefaults.cardElevation(4.dp) // Corregido
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(product.name, style = MaterialTheme.typography.bodyLarge)
                        Text(product.description, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
