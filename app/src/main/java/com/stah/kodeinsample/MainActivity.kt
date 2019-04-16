package com.stah.kodeinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    class LogImpl(
        val logimp: DiLog
    )

    val log by lazy { (applicationContext as MyApp).creator.myActivity() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log.logimp.log("test", "bind ")
    }
}
