package com.hongwei.baigtd.injection.component

import com.hongwei.baigtd.injection.annotations.PerFragment
import com.hongwei.baigtd.injection.modules.FragmentModule
import dagger.Component

@PerFragment
@Component(dependencies = [ActivityComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

}