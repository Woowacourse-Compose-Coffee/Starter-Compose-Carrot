package com.example.composecarrot.ui.home.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeFilterSection(modifier: Modifier = Modifier) {
    val filterItems = listOf("가락 2동 외 59", "가격", "카테고리", "정확도순")

    Row(modifier = modifier) {
        OutlinedIconButton(
            onClick = {},
            border = BorderStroke(width = 1.dp, color = Color(0xFFEAEBEF))
        ) {
            Icon(
                imageVector = Icons.Outlined.Refresh,
                contentDescription = "새로고침",
            )
        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(filterItems.count()) { index ->
                FilterButton(text = filterItems[index])
            }
        }
    }
}

@Composable
private fun FilterButton(text: String, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = {},
        border = BorderStroke(width = 1.dp, color = Color(0xFFEAEBEF)),
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp,
            letterSpacing = (-0.3).sp,
            color = Color(0xFF212123)
        )
        Icon(
            imageVector = Icons.Default.KeyboardArrowDown,
            contentDescription = "더보기",
            modifier = Modifier.size(18.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeFilterSectionPreview() {
    HomeFilterSection()
}

@Preview(showBackground = true)
@Composable
private fun FilterButtonPreview() {
    FilterButton("필터")
}
