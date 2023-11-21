package com.example.base

import android.os.Bundle
import android.os.SystemClock
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.compose.ui.Modifier

abstract class BaseActivity : ComponentActivity() {
    private var windowInsertControllerCompat: WindowInsetsControllerCompat? = null
    private var mLastClickTime: Long = 0

    protected abstract fun contentCompose()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setEdgeToEdge()
        contentCompose()
    }

    private fun setEdgeToEdge() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        windowInsertControllerCompat = WindowInsetsControllerCompat(window, window.decorView)
        windowInsertControllerCompat?.isAppearanceLightStatusBars = true
        windowInsertControllerCompat?.isAppearanceLightNavigationBars = true
    }

    protected fun isLightSystemBar(isLight: Boolean) {
        if (isLight) {
            windowInsertControllerCompat?.isAppearanceLightStatusBars = true
            windowInsertControllerCompat?.isAppearanceLightNavigationBars = true
        } else {
            windowInsertControllerCompat?.isAppearanceLightStatusBars = false
            windowInsertControllerCompat?.isAppearanceLightNavigationBars = false
        }
    }

    protected fun Modifier.singleClick(onSingleClick: () -> Unit) {
        val currentClickTime = SystemClock.uptimeMillis()
        val elapsedTime = currentClickTime - mLastClickTime
        mLastClickTime = currentClickTime
        if (elapsedTime <= 350) {
            return
        }
        onSingleClick.invoke()
    }

}