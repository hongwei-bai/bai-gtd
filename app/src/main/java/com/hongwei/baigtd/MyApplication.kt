package com.hongwei.baigtd

import android.app.Application
import com.hongwei.baigtd.injection.component.ApplicationComponent
import com.hongwei.baigtd.injection.component.DaggerApplicationComponent
import com.hongwei.baigtd.injection.modules.ApplicationModule
import com.hongwei.baigtd.util.Logger
import javax.inject.Inject

class MyApplication : Application() {
    @Inject
    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var logger: Logger

    private val TAG = javaClass.simpleName

    override fun onCreate() {
        super.onCreate()
        inject()
    }

    fun inject() {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build().inject(this)
    }
}