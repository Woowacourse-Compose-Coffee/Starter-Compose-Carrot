package com.example.composecarrot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    HomeContent(modifier = Modifier.fillMaxSize())
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {

    }
}

@Composable
private fun HomeHeaderSection(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "가락2동",
                color = Color(0xFF212123),
                fontWeight = FontWeight.W800,
                fontSize = 24.sp,
                letterSpacing = (-1).sp,
            )

            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "더보기",
                modifier = Modifier.size(18.dp)
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "돋보기",
                modifier = Modifier.size(28.dp)
            )

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "메뉴",
                modifier = Modifier.size(28.dp)
            )

            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "알림",
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeHeaderSectionPreview() {
    HomeHeaderSection()
}
