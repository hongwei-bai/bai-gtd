package com.hongwei.baigtd.util

import android.util.Log
import com.hongwei.baigtd.ApiConfig
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Logger @Inject constructor() {

    fun debug(tag: String, message: String?) {
        if (ApiConfig.IS_LOGGING_ENABLED) {
            Log.d(tag, message ?: "")
        }
    }

    fun error(tag: String, message: String?) {
        if (ApiConfig.IS_LOGGING_ENABLED) {
            Log.e(tag, message ?: "")
        }
    }

    fun error(tag: String, message: String?, throwable: Throwable) {
        if (ApiConfig.IS_LOGGING_ENABLED) {
            Log.e(tag, message ?: "", throwable)
        }
    }

    fun verbose(tag: String, message: String?) {
        if (ApiConfig.IS_LOGGING_ENABLED) {
            Log.v(tag, message ?: "")
        }
    }
}