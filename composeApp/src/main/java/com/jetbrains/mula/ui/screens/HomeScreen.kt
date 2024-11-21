package com.jetbrains.mula.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import models.Order
import models.Product
import models.Story

@Composable
fun HomeScreen(
    lastOrders: List<Order>,
    stories: List<Story>,
    products: List<Product>
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // Sección "Last Orders"
        Text("Last orders", style = MaterialTheme.typography.h6)
        LazyRow {
            items(lastOrders.size) { index ->
                val order = lastOrders[index]
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp)
                        .height(80.dp),
                    elevation = 4.dp
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text("DELIVERY DATE:", style = MaterialTheme.typography.caption)
                        Text(order.deliveryDate, style = MaterialTheme.typography.body1)
                        Button(onClick = { /* Acción de reordenar */ }) {
                            Text(order.status)
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sección "Stories"
        Text("Stories about producers", style = MaterialTheme.typography.h6)
        LazyRow {
            items(stories.size) { index ->
                val story = stories[index]
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(300.dp)
                        .height(200.dp),
                    elevation = 4.dp
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(story.title, style = MaterialTheme.typography.body1)
                        Text(story.description, style = MaterialTheme.typography.caption)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sección "New Products"
        Text("New products", style = MaterialTheme.typography.h6)
        LazyRow {
            items(products.size) { index ->
                val product = products[index]
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp)
                        .height(200.dp),
                    elevation = 4.dp
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(product.name, style = MaterialTheme.typography.body1)
                        Text(product.description, style = MaterialTheme.typography.caption)
                    }
                }
            }
        }
    }
}
