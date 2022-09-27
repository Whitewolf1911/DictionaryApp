package com.whitewolf1911.dictionaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.whitewolf1911.dictionaryapp.ui.theme.DictionaryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DictionaryAppTheme {

            }
        }
    }
}
