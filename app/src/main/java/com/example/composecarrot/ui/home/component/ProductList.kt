package com.example.composecarrot.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProductList(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(17.dp)
    ) {
        item {
            ProductItem(
                title = "산산기어 스웻직업(마지막가격)",
                location = "위례동",
                time = "15분 전",
                price = "70,000원",
                likeCount = 8,
                distance = "3.4km"
            )
        }

        item {
            HorizontalDivider(
                thickness = 1.dp,
                color = Color(0xFFF4F5F7)
            )
        }

        item {
            ProductItem(
                title = "브라운야드 니트 브라운 2사이즈",
                location = "가락본동",
                time = "6시간 전",
                price = "40,000원",
            )
        }
    }
}
