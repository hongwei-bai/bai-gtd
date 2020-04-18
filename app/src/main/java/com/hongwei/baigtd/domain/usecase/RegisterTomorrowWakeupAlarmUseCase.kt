package com.hongwei.baigtd.domain.usecase

import android.content.Context
import com.hongwei.baigtd.ApiConfig
import com.hongwei.baigtd.injection.annotations.AppContext
import com.hongwei.baigtd.presentation.alarm.AlarmLauncher
import com.hongwei.baigtd.util.tomorrow
import javax.inject.Inject

class RegisterTomorrowWakeupAlarmUseCase @Inject constructor(@AppContext val context: Context) {
    fun execute() {
        val tomorrow7am = tomorrow(7)
        AlarmLauncher.addAlarm(context, tomorrow7am, ApiConfig.AlarmType.WAKE_UP, "Morning wake up")
    }
}