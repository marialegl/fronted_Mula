package com.jetbrains.mula

import android.app.Application
import com.jetbrains.screens.di.initKoin
import com.jetbrains.screens.screens.DetailViewModel
import com.jetbrains.screens.screens.ListViewModel
import org.koin.dsl.module

class MuseumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(
            listOf(
                module {
                    factory { ListViewModel(get()) }
                    factory { DetailViewModel(get()) }
                }
            )
        )
    }
}
