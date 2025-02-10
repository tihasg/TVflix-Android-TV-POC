package com.tihasg.br.tvflix

import android.app.Application
import com.tihasg.br.tvflix.di.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(coreModule)
        }
    }
}
