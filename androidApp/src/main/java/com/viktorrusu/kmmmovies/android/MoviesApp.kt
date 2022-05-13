package com.viktorrusu.kmmmovies.android

import android.app.Application
import com.viktorrusu.kmmmovies.android.di.appModule
import com.viktorrusu.kmmmovies.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MoviesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        initKoin {
            androidLogger()
            androidContext(this@MoviesApp)
            modules(appModule)
        }
    }
}
