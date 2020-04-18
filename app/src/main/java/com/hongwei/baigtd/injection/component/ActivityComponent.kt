package com.hongwei.baigtd.injection.component

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.hongwei.baigtd.injection.annotations.ActivityContext
import com.hongwei.baigtd.injection.annotations.PerScreen
import com.hongwei.baigtd.injection.modules.ActivityModule
import com.hongwei.baigtd.injection.modules.ViewModelModule
import com.hongwei.baigtd.presentation.main.ApiConfigActivity
import com.hongwei.baigtd.presentation.main.MainActivity
import com.hongwei.baigtd.presentation.webview.AuthenticationWebViewActivity
import com.hongwei.baigtd.presentation.webview.RegisterWebViewActivity
import dagger.Component

@PerScreen
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class, ViewModelModule::class])
interface ActivityComponent : Singletons {

    fun provideAppCompatActivity(): AppCompatActivity

    @ActivityContext
    fun provideActivityContext(): Context

    fun inject(mainActivity: MainActivity)

    fun inject(registerWebViewActivity: RegisterWebViewActivity)

    fun inject(authenticationWebViewActivity: AuthenticationWebViewActivity)

    fun inject(apiConfigActivity: ApiConfigActivity)
}