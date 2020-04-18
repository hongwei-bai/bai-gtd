package com.hongwei.baigtd.injection.modules

import android.app.Application
import android.content.Context
import com.hongwei.baigtd.injection.annotations.AppContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    @AppContext
    fun provideContext(): Context = application
}