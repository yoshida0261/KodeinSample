package com.stah.kodeinsample

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware


open class MyApp() : Application(), KodeinAware {
    override val kodein: Kodein
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.


    interface Creator {
        fun myActivity(): MainActivity.LogImpl
    }


    open val creator: Creator = KodeinCreator()


}

