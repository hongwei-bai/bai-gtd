package com.hongwei.baigtd.injection.component

import com.hongwei.baigtd.MyApplication
import com.hongwei.baigtd.injection.modules.ApplicationModule
import com.hongwei.baigtd.injection.modules.SingletonModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, SingletonModule::class])
interface ApplicationComponent: Singletons {

    fun inject(application: MyApplication)
}