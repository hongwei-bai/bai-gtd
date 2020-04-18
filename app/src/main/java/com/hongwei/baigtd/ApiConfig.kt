package com.hongwei.baigtd

object ApiConfig {
    const val IS_LOGGING_ENABLED = true

    object Urls {
        const val API_APPLY_URL = "https://www.rememberthemilk.com/services/api/keys.rtm"

        const val DOMAIN = "www.rememberthemilk.com"
        const val BASE = "https://" + DOMAIN

        const val USER_HOME = BASE + "/app"
        const val API_HOME = BASE + "/services/api/"
        const val NON_COMMERCIAL_KEY_APPLY = BASE + "/services/api/requestkey.rtm"
    }

    object Constants {
        const val REQUEST_CODE_AUTH = 442
        const val REQUEST_CODE_APICONFIG = 443

        const val RESULT_CODE_FAILURE = 0
        const val RESULT_CODE_SUCCESS = 944
    }

    object Validation {
        const val LENGTH_API_KEY = 32
        const val LENGTH_SHARED_SECRET = 16
    }

    object DataStoreKey {
        const val KEY_TOKEN = "token"
        const val KEY_API_KEY = "apikey"
        const val KEY_SHARED_SECRET = "sharedsecret"
    }

    object AppString {
        const val LIST_ALL_TASKS = "所有任务"
        const val TAG_DOC = "doc"
    }

    object Timing {
        const val WAKE_UP_HOUR = 7
    }

    enum class AlarmType(val id: String, val requestCode: Int) {
        WAKE_UP("wakeup", 440),
        SUMMARY("summary", 441),
        TODO("todo", 442)
    }

    object Alarm {
        const val KEY_TYPE = "alarm.type"
        const val KEY_NAME = "alarm.name"
    }
}