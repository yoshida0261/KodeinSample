// Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.

package com.stah.kodeinsample

import android.app.Application
import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnitRunner
import org.junit.rules.ExternalResource

/*
class MyTestRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application =
            super.newApplication(cl, MyTestApplication::class.java.name, context)
}
 */

class MyTestRunner: AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application =
        super.newApplication(cl, MyTestApp::class.java.name, context)


}