package com.example.lizaicompose

import android.app.Application
import android.provider.Settings
import com.example.lizaicompose.datastore.LizAiDataStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.UUID

class LizAiApplication : Application() {

    companion object {
        lateinit var instance: LizAiApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        configurationApplication()
    }

    private fun configurationApplication() {
        encryptedDeviceId()
    }

    private fun encryptedDeviceId() {
        val secureAndroidId = Settings.Secure.getString(contentResolver, UUID.randomUUID().toString())
        CoroutineScope(Dispatchers.IO).launch {
            LizAiDataStore.instance.setEncryptedDeviceId(secureAndroidId)
        }
    }
}

