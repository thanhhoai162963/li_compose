package com.example.lizaicompose.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import com.example.lizaicompose.ui.theme.LizAiTheme
import com.example.lizaicompose.ui.theme.LizAiTheme123
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LizAiTheme {
                Text(text = "thanhssss", color = LizAiTheme123.colors.contentColor)
            }

        }
    }
}

