//
//  ContentView.swift
//  iosApp
//
//  Created by Julio Luque on 21/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        // Obtener datos desde el repositorio
        let lastOrders = DataRepository().getOrders()
        let stories = DataRepository().getStories()
        let products = DataRepository().getProducts()

        // Mostrar la pantalla
        HomeScreen(
            lastOrders: lastOrders,
            stories: stories,
            products: products
        )
    }
}
