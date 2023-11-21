package com.example.network.interceptor

import com.example.lizaicompose.LizAiApplication
import com.example.lizaicompose.datastore.LizAiDataStore
import com.google.gson.Gson
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import okhttp3.Interceptor

class Auth : Interceptor {
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {

/*
        var request = chain.request().newBuilder()
            .header(Header.deviceId, LizAiDataStore.instance.getEncryptedDeviceId().collect())
            .header(
                Gson.keyAuthorization,
                if (LizApp.instance.getToken()
                        ?.getAuthorization() != null
                ) LizApp.instance.getToken()?.getAuthorization() else ""
            ).build()
        return chain.proceed(request)*/
    }
}