package com.selem.myapplicationreact

import android.app.Application
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage

class MyApplication : Application(), ReactApplication {


    private val reactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getPackages(): List<ReactPackage> {
            return listOf<ReactPackage>(MainReactPackage())
        }
    }

    override fun getReactNativeHost(): ReactNativeHost? {
        return reactNativeHost
    }
}