package com.lx.km.utils

import android.util.Log

/**
 * Created on 17-10-24 下午5:30
 */
class LogUtils {
    companion object {
        private var TAG = "KM Log"

        fun d(str: String) {
            Log.d(TAG, str)
        }
    }

}