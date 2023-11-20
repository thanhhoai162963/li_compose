package com.example.lizaicompose.ui.theme.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.lizaicompose.R
import com.example.lizaicompose.ui.theme.font_large
import com.example.lizaicompose.ui.theme.font_medium
import com.example.lizaicompose.ui.theme.font_normal

internal object LizAiTextStyle {
    // Size-Medium
    val robotoMedium_sizeMedium = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_medium)), fontSize = font_medium)

    val robotoSemiBold_sizeMedium = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_bold)), fontSize = font_medium)

    val robotoBold_sizeMedium = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_bold)), fontSize = font_medium, fontWeight = FontWeight.Bold)

    val robotoRegular_sizeMedium = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_regular)), fontSize = font_medium)

    // Size-Normal
    val robotoRegular_sizeNormal = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_regular)), fontSize = font_normal)

    // Size-Large
    val robotoRegular_sizeLarge = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_regular)), fontSize = font_large)

    val robotoSlaRegular_sizeLarge = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_sla_regular)), fontSize = font_large)

    val robotoSlaBold_sizeLarge = TextStyle(fontFamily = FontFamily(Font(R.font.roboto_sla_bold)), fontSize = font_large)
}