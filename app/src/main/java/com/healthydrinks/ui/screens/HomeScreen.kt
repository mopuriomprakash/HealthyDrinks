package com.healthydrinks.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.healthydrinks.ui.components.EventBanner
import com.healthydrinks.ui.components.ExploreSection
import com.healthydrinks.ui.components.HeaderAndSearchSection
import com.healthydrinks.ui.components.PromoBanner

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {
        HeaderAndSearchSection(bgColor = null)
        PromoBanner()
        EventBanner()
        ExploreSection()
    }
}
