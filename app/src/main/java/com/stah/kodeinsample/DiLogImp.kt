package com.stah.kodeinsample

import android.util.Log


class DiLogImp : DiLog {
    override fun log(tag: String, message: String) {
        Log.d(tag, message)
    }
}