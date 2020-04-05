package com.example.core

import android.app.Application
import android.content.Context

/**
 * @author  chy
 * @date    2020-04-04
 */
class BaseApplication:Application() {
    companion object{
        lateinit var currentApplication:Context

        private set
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        currentApplication = this
    }
}