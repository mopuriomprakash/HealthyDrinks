package com.healthydrinks.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.healthydrinks.ui.components.CategoryProductItem
import com.healthydrinks.ui.components.HeaderAndSearchSection
import com.healthydrinks.ui.theme.HeaderYellow
import com.healthydrinks.ui.theme.PrimaryGreen

@Composable
fun CategoriesScreen() {
    var selectedCategory by remember { mutableStateOf("ALL JUICES") }
    val categories = listOf("ALL JUICES", "COCONUT", "SUGARCANE")

    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        HeaderAndSearchSection(bgColor = HeaderYellow)
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color(0xFFE0E0E0))
        ) {
            categories.forEach { category ->
                CategoryTab(
                    text = category,
                    isSelected = selectedCategory == category,
                    onClick = { selectedCategory = category },
                    modifier = Modifier.weight(1f)
                )
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(4) { index ->
                val name = if (index % 2 == 0) "Tender Coconut" else "Sugarcane Juice"
                val subtitle = if (index % 2 == 0) "1 pc (Approx.200 - 500ml)" else "500ml"
                val price = if (index % 2 == 0) "60" else "40"
                val oldPrice = if (index % 2 == 0) "75" else "55"
                CategoryProductItem(name, subtitle, price, oldPrice)
            }
        }
    }
}

@Composable
fun CategoryTab(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(25.dp))
            .background(if (isSelected) PrimaryGreen else Color.Transparent)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null, // Removes ripple for cleaner tab switching feel
                onClick = onClick
            )
            .padding(vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = if (isSelected) Color.White else Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        )
    }
}
