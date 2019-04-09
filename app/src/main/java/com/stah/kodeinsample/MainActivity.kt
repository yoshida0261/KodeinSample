package com.stah.kodeinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class MainActivity : AppCompatActivity() {


    /*
    override val kodein by Kodein.lazy {
        bind<DiLog>() with singleton { DiLogImp() }
    }

    val log: DiLog by instance()
    */
    val log  by lazy { (applicationContext as MyApp).creator.myActivity() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log.log("test", "bind ")
    }
}
