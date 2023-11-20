package com.example.lizaicompose.ui.theme.typography

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle



@Immutable
class LizAiTypography(
    val bodyMedium: TextStyle = LizAiTextStyle.robotoMedium_sizeMedium,
    val bodySemiBoldMedium: TextStyle = LizAiTextStyle.robotoSemiBold_sizeMedium,
    val bodyBoldMedium: TextStyle = LizAiTextStyle.robotoBold_sizeMedium,
    val bodyRegularMedium: TextStyle = LizAiTextStyle.robotoRegular_sizeMedium,
    val bodyRegularNormal: TextStyle = LizAiTextStyle.robotoRegular_sizeNormal,
    val bodyRegularLarge: TextStyle = LizAiTextStyle.robotoRegular_sizeLarge,
    val bodySlaRegularLarge: TextStyle = LizAiTextStyle.robotoSlaRegular_sizeLarge,
    val bodySlaBoldLarge: TextStyle = LizAiTextStyle.robotoSlaBold_sizeLarge,
)

internal val LocalLizAiTypography = staticCompositionLocalOf {
    LizAiTypography()
}

