package com.example.lizaicompose.ui.main


import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.referentialEqualityPolicy
import com.example.base.BaseActivity
import com.example.lizaicompose.ui.theme.LizAiTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
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

