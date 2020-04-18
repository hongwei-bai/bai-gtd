package com.hongwei.baigtd.domain.usecase

import com.hongwei.baigtd.data.DataSource
import javax.inject.Inject

class CheckApiConfigUseCase @Inject constructor(val dataSource: DataSource) {
    fun execute(): Boolean {
        return dataSource.retriveApiKey() != null && dataSource.retriveSharedSecret() != null
    }
}