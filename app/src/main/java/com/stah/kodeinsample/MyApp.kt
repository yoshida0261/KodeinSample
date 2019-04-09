package com.stah.kodeinsample

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton


class MyApp() : Application(), KodeinAware {


    override val kodein = Kodein.lazy {
        bind<DiLog>() with singleton { DiLogImp() }
    }


}