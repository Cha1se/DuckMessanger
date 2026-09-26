package com.cha1se.duckmessenger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.cha1se.duckmessenger.ui.naviagtion.NavigationScreen
import com.cha1se.ui.theme.DuckMessengerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DuckMessengerTheme {
                NavigationScreen()
            }
        }
    }
}