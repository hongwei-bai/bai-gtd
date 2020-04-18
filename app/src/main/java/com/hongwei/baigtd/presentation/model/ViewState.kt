package com.hongwei.baigtd.presentation.model

/**
 * Base class to represent common UI States
 */
sealed class ViewState

object Default: ViewState()

object Loading : ViewState()

class Error(val exception: Throwable) : ViewState()

class Success<T>(val data: T) : ViewState()

object Completed : ViewState()

