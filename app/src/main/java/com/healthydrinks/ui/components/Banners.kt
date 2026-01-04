package com.healthydrinks.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.healthydrinks.ui.theme.*

@Composable
fun PromoBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(PrimaryGreen, SecondaryGreen)
                )
            )
            .padding(vertical = 32.dp, horizontal = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "\"HEALTHY & HYGIENIC JUICES\nDELIVERED WITH CARE!\"",
            color = Color.Yellow,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun EventBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(130.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(YellowBanner)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "02ND SEPTEMBER",
                    fontSize = 10.sp,
                    color = TextBrown,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "WORLD\nCOCONUT\nDAY!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = TextBrown,
                    lineHeight = 26.sp
                )
            }
            Icon(
                Icons.Default.Star,
                contentDescription = null,
                tint = PrimaryGreen,
                modifier = Modifier.size(80.dp)
            )
        }
    }
}
