// Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.

package com.stah.kodeinsample

import org.kodein.di.Kodein
import org.kodein.di.android.support.BuildConfig
import org.kodein.di.direct
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton
import org.kodein.di.newInstance

class KodeinCreator : MyApp.Creator {

    private val kodein = Kodein {
        when (BuildConfig.FLAVOR) {
            "release" -> bind<DiLog>() with singleton { DiLogImp() }
            "debug" -> bind<DiLog>() with singleton { DiLogTestImpl() }
        }
    }.direct

    override fun myActivity() = kodein.newInstance {

        DiLogImp()

    }


}