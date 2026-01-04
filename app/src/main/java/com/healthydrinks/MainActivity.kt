package com.healthydrinks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.healthydrinks.navigation.AppNavHost
import com.healthydrinks.ui.theme.HealthyDrinksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HealthyDrinksTheme {
                AppNavHost()
            }
        }
    }
}
