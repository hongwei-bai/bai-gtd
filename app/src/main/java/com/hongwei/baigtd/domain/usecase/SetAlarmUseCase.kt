package com.hongwei.baigtd.domain.usecase

import android.content.Context
import com.hongwei.baigtd.ApiConfig
import com.hongwei.baigtd.domain.model.DueTask
import com.hongwei.baigtd.injection.annotations.AppContext
import com.hongwei.baigtd.presentation.alarm.AlarmLauncher
import javax.inject.Inject

class SetAlarmUseCase @Inject constructor(@AppContext val context: Context) {
    fun execute(dueTasks: List<DueTask>) {
        for (task in dueTasks) {
            AlarmLauncher.addAlarm(context, task.due, ApiConfig.AlarmType.TODO, task.name)
        }
    }
}