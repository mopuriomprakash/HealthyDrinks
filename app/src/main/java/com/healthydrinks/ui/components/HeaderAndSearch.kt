package com.healthydrinks.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.healthydrinks.ui.theme.HeaderYellow
import com.healthydrinks.ui.theme.PrimaryGreen
import com.healthydrinks.ui.theme.SecondaryGreen

@Composable
fun HeaderAndSearchSection(bgColor: Color? = null) {
    val modifier = if (bgColor != null) {
        Modifier.background(bgColor)
    } else {
        Modifier.background(
            brush = Brush.verticalGradient(
                colors = listOf(PrimaryGreen, SecondaryGreen)
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
            .padding(bottom = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Default.Person,
                    contentDescription = "Profile",
                    tint = if (bgColor == HeaderYellow) Color.Black else Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Gachibowli",
                    color = if (bgColor == HeaderYellow) Color.Black else Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Madhura Nagar Colony...",
                    color = (if (bgColor == HeaderYellow) Color.Black else Color.White).copy(alpha = 0.8f),
                    fontSize = 13.sp
                )
            }
            Icon(
                Icons.Outlined.Notifications,
                contentDescription = "Notifications",
                tint = if (bgColor == HeaderYellow) Color.Black else Color.White,
                modifier = Modifier.size(28.dp)
            )
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            color = Color.White
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 12.dp)
            ) {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Search for \"products\"",
                    color = Color.LightGray,
                    fontSize = 14.sp
                )
            }
        }
    }
}
