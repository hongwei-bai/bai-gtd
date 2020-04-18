package com.hongwei.baigtd.domain.usecase

import com.hongwei.baigtd.ApiConfig
import javax.inject.Inject

class RegisterUseCase @Inject constructor() {
    fun getRegisterUrl(): String {
        return ApiConfig.Urls.NON_COMMERCIAL_KEY_APPLY
    }
}