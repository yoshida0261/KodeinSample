// Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.

package com.stah.kodeinsample

import android.app.Application
import android.support.test.runner.AndroidJUnitRunner


class AppTestRunner: AndroidJUnitRunner() {
    override fun callApplicationOnCreate(app: Application) {
        //app.kodein.mutable = true
        super.callApplicationOnCreate(app)
    }
}

/*
class MyTestRunner : ExternalResource() {
    override fun before() {
        val app = InstrumentationRegistry.getInstrumentation().targetContext.asApp()
        app.kodein.clear()
        app.kodein.addImport(appDependencies(app))
    }
}
 */