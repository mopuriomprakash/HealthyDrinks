package com.healthydrinks.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.healthydrinks.ui.theme.PrimaryGreen

@Composable
fun CartScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        // Cart Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(PrimaryGreen)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Final Cart",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Icon(Icons.Default.Notifications, contentDescription = null, tint = Color.White)
        }

        Column(modifier = Modifier.weight(1f).verticalScroll(rememberScrollState())) {
            // Delivery Address
            Column(modifier = Modifier.padding(16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Delivery Address", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
                    Text("Change", color = Color.Red, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.height(12.dp))
                Row(verticalAlignment = Alignment.Top) {
                    Icon(Icons.Default.LocationOn, contentDescription = null, tint = PrimaryGreen)
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .background(PrimaryGreen, RoundedCornerShape(4.dp))
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text("HOME", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                        Text(
                            "Property Type\nApartment Name\nFlat No. 102, Block: C\nArea, City, State",
                            fontSize = 13.sp,
                            color = Color.DarkGray,
                            lineHeight = 18.sp
                        )
                    }
                }
            }
            
            HorizontalDivider(thickness = 8.dp, color = Color(0xFFF5F5F5))

            // Cart Items
            CartItem("Tender Coconut", "42")
            HorizontalDivider(color = Color(0xFFEEEEEE))
            CartItem("Sugarcane Juice", "42")
            
            HorizontalDivider(thickness = 8.dp, color = Color(0xFFF5F5F5))

            // Bill Summary
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFFDE7))
                    .padding(16.dp)
            ) {
                Text("Bill Summary", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(12.dp))
                SummaryRow("Item Total", "₹189")
                SummaryRow("Delivery Fee", "₹25")
                SummaryRow("GST(18%)", "₹05")
                Spacer(modifier = Modifier.height(12.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("To Pay", fontWeight = FontWeight.Bold, fontSize = 18.sp, modifier = Modifier.weight(1f))
                    Text("₹115", fontWeight = FontWeight.Black, fontSize = 18.sp)
                }
            }
        }

        // Confirm Button
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Confirm", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }
    }
}

@Composable
fun CartItem(name: String, price: String) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFFF5F5F5)),
            contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Default.ShoppingCart, contentDescription = null, tint = Color.LightGray)
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(name, fontWeight = FontWeight.Bold)
            Text("₹$price", fontWeight = FontWeight.Bold)
        }
        Column(horizontalAlignment = Alignment.End) {
            Icon(Icons.Default.Delete, contentDescription = null, tint = Color.DarkGray, modifier = Modifier.size(20.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text("-", modifier = Modifier.padding(horizontal = 8.dp), fontWeight = FontWeight.Bold)
                Text("1", fontWeight = FontWeight.Bold)
                Text("+", modifier = Modifier.padding(horizontal = 8.dp), fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun SummaryRow(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(label, color = Color.DarkGray, modifier = Modifier.weight(1f))
        Text(value, fontWeight = FontWeight.Medium)
    }
}
