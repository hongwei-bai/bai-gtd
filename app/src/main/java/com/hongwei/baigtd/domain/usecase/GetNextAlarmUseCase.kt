package com.hongwei.baigtd.domain.usecase

import android.content.Context
import com.hongwei.baigtd.injection.annotations.AppContext
import com.hongwei.baigtd.presentation.alarm.AlarmLauncher
import java.util.*
import javax.inject.Inject

class GetNextAlarmUseCase @Inject constructor(@AppContext val context: Context) {
    fun execute(): Calendar? {
        return AlarmLauncher.getNextAlarm(context)
    }
}