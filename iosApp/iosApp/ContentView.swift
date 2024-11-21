//
//  ContentView.swift
//  iosApp
//
//  Created by Julio Luque on 21/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//


struct ContentView: View {
    // Variables para almacenar los datos
    @State var lastOrders = [Order]() // Ajusta el tipo según tu modelo de datos
    @State var stories = [Story]() // Ajusta el tipo según tu modelo de datos
    @State var products = [Product]() // Ajusta el tipo según tu modelo de datos

    var body: some View {
        // Inicializa los datos al crear la vista
        onAppear {
            lastOrders = DataRepository().getOrders()
            stories = DataRepository().getStories()
            products = DataRepository().getProducts()
        }

        // Resto de tu vista
        // ...
    }
}
