package com.hongwei.baigtd.injection.component

import android.content.Context
import com.hongwei.baigtd.data.DataSource
import com.hongwei.baigtd.injection.annotations.AppContext
import com.hongwei.baigtd.util.Logger

interface Singletons {
    @AppContext
    fun provideContext(): Context

    fun provideLogger(): Logger
    
    fun provideDataSource(): DataSource
}