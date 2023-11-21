package com.example.lizaicompose.ui.main


import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.base.BaseActivity
import com.example.lizaicompose.ui.theme.LizAiTheme


class MainActivity : BaseActivity() {

    override fun contentCompose() {
        setContent {
            LizAiTheme {
                Text(
                    text = "thanh",
                    color = LizAiTheme.colors.contentColor,
                    style = LizAiTheme.typography.bodyBoldMedium
                )
            }
        }
    }

}

