package com.example.lizaicompose.security

import android.util.Base64
import android.util.Log
import java.security.spec.KeySpec
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESedeKeySpec

class TripleDES {
    private var mySecretKeyFactory: SecretKeyFactory? = null
    private var cipher: Cipher? = null
    private var keyAsBytes: ByteArray? = null
    private var myEncryptionKey: String? = null
    private var myEncryptionScheme: String? = null
    private var key: SecretKey? = null

    fun createDes() {
        try {
            myEncryptionKey = LizAiKeys.LIZAI_KEY_TRIPLE_DES
            myEncryptionScheme = Algorithm.SCHEME_DES
            keyAsBytes = myEncryptionKey?.toByteArray(charset(Algorithm.UTF_FORMAT))
            val myKeySpec: KeySpec = DESedeKeySpec(keyAsBytes)
            mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme)
            cipher = Cipher.getInstance(myEncryptionScheme)
            key = mySecretKeyFactory?.generateSecret(myKeySpec)
        } catch (e: Exception) {
            Log.d("error:", "${e.message}")
        }
    }

    fun encrypt(unencryptedString: String): String? {
        var encryptedString: String? = null
        try {
            cipher!!.init(Cipher.ENCRYPT_MODE, key)
            val plainText = unencryptedString.toByteArray(charset(Algorithm.UTF_FORMAT))
            val encryptedText = cipher!!.doFinal(plainText)
            encryptedString = Base64.encodeToString(encryptedText, Base64.NO_WRAP)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return encryptedString
    }

    fun decrypt(encryptedString: String?): String? {
        var decryptedText: String? = null
        try {
            cipher?.init(Cipher.DECRYPT_MODE, key)
            val encryptedText = Base64.decode(encryptedString, Base64.NO_WRAP)
            val plainText = cipher?.doFinal(encryptedText)
            decryptedText = plainText.toString()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        Log.d("deviceID:", decryptedText.toString())
        return decryptedText
    }
}