package com.hongwei.baigtd.domain.model

import com.hongwei.baigtd.util.toddMMyyyy_HHmmss
import java.util.*

class DueTask(
        val name: String,
        val due: Date
) {
    override fun toString(): String {
        val calendar = Calendar.getInstance()
        calendar.time = due

        return "$name due: ${calendar.toddMMyyyy_HHmmss()}"
    }
}