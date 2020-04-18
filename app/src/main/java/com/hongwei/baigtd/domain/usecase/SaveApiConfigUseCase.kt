package com.hongwei.baigtd.domain.usecase

import com.hongwei.baigtd.data.DataSource
import javax.inject.Inject

class SaveApiConfigUseCase @Inject constructor(val dataSource: DataSource) {
    fun execute(apiKey: String, sharedSecret: String) {
        dataSource.saveApiKey(apiKey)
        dataSource.saveSharedSecret(sharedSecret)
    }
}