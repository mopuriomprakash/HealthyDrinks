package com.healthydrinks.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.healthydrinks.ui.theme.PrimaryGreen
import com.healthydrinks.ui.theme.TextBrown

@Composable
fun ExploreSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            HorizontalDivider(modifier = Modifier.weight(1f), color = Color.LightGray)
            Text(
                " EXPLORE FRESH JUICE'S ",
                color = TextBrown,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
            HorizontalDivider(modifier = Modifier.weight(1f), color = Color.LightGray)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            ProductItem("Tender Coconut", Modifier.weight(1f))
            ProductItem("Sugarcane Juice", Modifier.weight(1f))
        }
    }
}

@Composable
fun ProductItem(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFEFEFEF)),
            contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Default.Favorite, null, tint = Color.LightGray, modifier = Modifier.size(40.dp))
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(name, fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color.DarkGray)
    }
}

@Composable
fun CategoryProductItem(name: String, subtitle: String, price: String, oldPrice: String) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF5F5F5))
        ) {
            Icon(
                Icons.Default.ShoppingCart,
                null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(60.dp),
                tint = Color.LightGray
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .height(32.dp),
                contentPadding = PaddingValues(horizontal = 12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                shape = RoundedCornerShape(4.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreen)
            ) {
                Text("ADD", color = PrimaryGreen, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(name, fontWeight = FontWeight.Bold, fontSize = 15.sp)
        Text(subtitle, color = Color.Gray, fontSize = 12.sp)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("₹$price", fontWeight = FontWeight.Bold, fontSize = 15.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                "₹$oldPrice",
                color = Color.Gray,
                fontSize = 12.sp,
                textDecoration = TextDecoration.LineThrough
            )
        }
    }
}
