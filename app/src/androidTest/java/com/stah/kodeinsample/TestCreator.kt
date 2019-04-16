// Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.

package com.stah.kodeinsample

import org.kodein.di.Kodein
import org.kodein.di.android.support.BuildConfig
import org.kodein.di.direct
import org.kodein.di.newInstance


class TestCreator : MyApp.Creator {
    private val kodein = Kodein {

    }.direct

    override fun myActivity() = kodein.newInstance {

        DiMock()
    }
}