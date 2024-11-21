//
//  HomeScreen.swift
//  iosApp
//
//  Created by Julio Luque on 21/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct HomeScreen: View {
    let lastOrders: [Order]
    let stories: [Story]
    let products: [Product]

    var body: some View {
        ScrollView {
            VStack(alignment: .leading, spacing: 16) {
                Text("Last orders")
                    .font(.headline)
                ScrollView(.horizontal, showsIndicators: false) {
                    HStack {
                        ForEach(lastOrders, id: \.deliveryDate) { order in
                            VStack {
                                Text("DELIVERY DATE:")
                                    .font(.caption)
                                Text(order.deliveryDate)
                                    .font(.body)
                                Button(order.status) {
                                    // Acción
                                }
                                .buttonStyle(.bordered)
                            }
                            .frame(width: 150, height: 80)
                            .background(Color.gray.opacity(0.2))
                            .cornerRadius(8)
                        }
                    }
                }

                Text("Stories about producers")
                    .font(.headline)
                ScrollView(.horizontal, showsIndicators: false) {
                    HStack {
                        ForEach(stories, id: \.title) { story in
                            VStack {
                                Text(story.title)
                                    .font(.body)
                                Text(story.description)
                                    .font(.caption)
                            }
                            .frame(width: 300, height: 200)
                            .background(Color.gray.opacity(0.2))
                            .cornerRadius(8)
                        }
                    }
                }

                Text("New products")
                    .font(.headline)
                ScrollView(.horizontal, showsIndicators: false) {
                    HStack {
                        ForEach(products, id: \.name) { product in
                            VStack {
                                Text(product.name)
                                    .font(.body)
                                Text(product.description)
                                    .font(.caption)
                            }
                            .frame(width: 150, height: 200)
                            .background(Color.gray.opacity(0.2))
                            .cornerRadius(8)
                        }
                    }
                }
            }
            .padding()
        }
    }
}
