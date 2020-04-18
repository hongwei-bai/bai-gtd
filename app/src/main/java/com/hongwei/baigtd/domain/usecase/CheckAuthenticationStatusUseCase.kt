package com.hongwei.baigtd.domain.usecase

import com.hongwei.baigtd.data.DataSource
import javax.inject.Inject

class CheckAuthenticationStatusUseCase @Inject constructor(val dataSource: DataSource) {
    companion object {
        const val TAG = "rtm.check-auth.usecase"
    }

    fun execute(): Boolean {
        return dataSource.retriveToken() != null
    }
}