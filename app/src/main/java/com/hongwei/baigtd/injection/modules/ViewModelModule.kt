package com.hongwei.baigtd.injection.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hongwei.baigtd.injection.utils.ViewModelFactory
import com.hongwei.baigtd.injection.utils.ViewModelKey
import com.hongwei.baigtd.presentation.main.ApiConfigViewModel
import com.hongwei.baigtd.presentation.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ApiConfigViewModel::class)
    internal abstract fun bindApiConfigViewModel(apiConfigViewModel: ApiConfigViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
