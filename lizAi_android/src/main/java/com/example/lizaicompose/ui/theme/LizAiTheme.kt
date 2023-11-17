package com.example.lizaicompose.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

/*private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)*/


@Composable
fun LizAiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val customColors = LizAiColors(
        contentColor = Purple40,
    )
    val customTypography = LizAiTypography(
        textStyle = TextStyle(fontSize = 16.sp),
    )
    CompositionLocalProvider(
        LocalLizAiColors provides customColors,
        LocalLizAiTypography provides customTypography,
        content = content
    )
}

object LizAiTheme123 {
    val colors: LizAiColors
        @Composable
        get() = LocalLizAiColors.current
    val typography: LizAiTypography
        @Composable
        get() = LocalLizAiTypography.current

}