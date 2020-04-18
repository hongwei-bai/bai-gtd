package com.hongwei.baigtd.presentation.main

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import com.hongwei.baigtd.ApiConfig
import com.hongwei.baigtd.ApiConfig.Validation.LENGTH_API_KEY
import com.hongwei.baigtd.ApiConfig.Validation.LENGTH_SHARED_SECRET
import com.hongwei.baigtd.domain.usecase.SaveApiConfigUseCase
import com.hongwei.baigtd.presentation.base.BaseViewModel
import javax.inject.Inject

class ApiConfigViewModel @Inject constructor() : BaseViewModel() {
    companion object {
        const val TAG = "rtm.api-config"
    }

    @Inject
    lateinit var saveApiCondigUseCase: SaveApiConfigUseCase

    val buttonEnableState: MutableLiveData<Boolean> = MutableLiveData()

    fun validate(apiKey: String, secret: String) {
        buttonEnableState.value = LENGTH_API_KEY == apiKey.trim().length && LENGTH_SHARED_SECRET == secret.trim().length
    }

    fun submit(activity: ApiConfigActivity, apiKey: String, secret: String) {
        saveApiCondigUseCase.execute(apiKey.trim(), secret.trim())

        activity.finish()
    }

    fun openApiApplicationLink(context: Context) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(ApiConfig.Urls.API_APPLY_URL))
        context.startActivity(browserIntent)
    }
}