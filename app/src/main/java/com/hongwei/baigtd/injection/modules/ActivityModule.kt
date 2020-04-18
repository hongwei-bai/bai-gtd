package com.hongwei.baigtd.injection.modules

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.hongwei.baigtd.injection.annotations.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideAppCompatActivity(): AppCompatActivity = activity

    @Provides
    fun provideActivity(): Activity = activity

    @Provides
    @ActivityContext
    fun provideContext(): Context = activity
}
