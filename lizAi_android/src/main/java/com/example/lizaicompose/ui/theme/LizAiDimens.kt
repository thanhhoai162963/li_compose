package com.example.lizaicompose.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//font-size
val font_small = 10.sp
val font_normal = 12.sp
val font_medium = 15.sp
val font_large = 20.sp
val font_big = 25.sp

//Spacing
val spacing_small = 5.dp
val spacing_medium = 10.dp
val spacing_large = 15.dp

@Immutable
data class LizAiDimens(val spacing: Dp = spacing_medium)

internal val LocalLizAiDimens = staticCompositionLocalOf {
    LizAiDimens()
}