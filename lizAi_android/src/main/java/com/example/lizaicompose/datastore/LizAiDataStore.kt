package com.example.lizaicompose.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.lizaicompose.LizAiApplication
import com.example.lizaicompose.security.LizAiKeys
import com.example.lizaicompose.security.TripleDES
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

val Context.dataStoreLizAi: DataStore<Preferences> by preferencesDataStore("LizAi")

class LizAiDataStore {
    companion object {
        var instance: LizAiDataStore = LizAiDataStore()
    }

    suspend fun getEncryptedDeviceId(): String {
        return LizAiApplication.instance.dataStoreLizAi.data.map {
            it[KeyDataStore.SORT_ORDER].toString()
        }.first()
    }

    suspend fun setEncryptedDeviceId(deviceId: String?) {
        val key = TripleDES().encrypt(LizAiKeys.LIZAI_KEY_DEVIDE_ID + deviceId)
        LizAiApplication.instance.dataStoreLizAi.edit {
            if (key != null) {
                it[KeyDataStore.SORT_ORDER] = key
            }
        }
    }

}