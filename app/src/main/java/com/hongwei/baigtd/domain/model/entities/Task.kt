package com.hongwei.baigtd.domain.model.entities

import java.util.*

class Task(
    val name: String,
    val priority: Priority,
    val tags: List<String>,
    val due: Date? = null,
    val created: Date? = null,
    val deleted: Date? = null,
    val completed: Date? = null
) {
    fun isDayDueTask(): Boolean = false
}