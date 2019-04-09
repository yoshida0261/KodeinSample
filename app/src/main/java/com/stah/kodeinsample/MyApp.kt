package com.stah.kodeinsample

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.direct
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import org.kodein.di.newInstance


class MyApp() : Application(){

    /*

    override val kodein = Kodein.lazy {
        bind<DiLog>() with singleton { DiLogImp() }
    }
    */
    interface Creator {
        fun myActivity(): DiLogImp
    }

    val creator: Creator = KodeinCreator()



}

class KodeinCreator : MyApp.Creator {

    private val kodein = Kodein {
        /* bindings */
        bind<DiLog>() with singleton { DiLogImp() }
    }.direct

    override fun myActivity() = kodein.newInstance {  DiLogImp() }
}