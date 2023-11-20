package com.example.lizaicompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.lizaicompose.ui.theme.typography.LizAiTypography
import com.example.lizaicompose.ui.theme.typography.LocalLizAiTypography

@Composable
fun LizAiTheme(
    content: @Composable () -> Unit
) {

    val lizAiColors = LizAiColors()
    val lizAiTypography = LizAiTypography()
    val localLizAiDimens = LizAiDimens()
    CompositionLocalProvider(
        LocalLizAiColors provides lizAiColors,
        LocalLizAiTypography provides lizAiTypography,
        LocalLizAiDimens provides localLizAiDimens,
        content = content
    )
}

object LizAiTheme {
    val colors: LizAiColors
        @Composable
        get() = LocalLizAiColors.current
    val typography: LizAiTypography
        @Composable
        get() = LocalLizAiTypography.current

}