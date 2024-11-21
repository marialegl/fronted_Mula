package com.jetbrains.screens

import com.jetbrains.screens.data.MuseumRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KoinDependencies : KoinComponent {
    val museumRepository: MuseumRepository by inject()
}
