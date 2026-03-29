package com.example.composecarrot.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
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
import com.example.composecarrot.ui.AppColors
import com.example.composecarrot.ui.AppTypography

@Composable
fun ProductInfo(
    title: String,
    location: String,
    time: String,
    price: String,
    modifier: Modifier = Modifier,
    distance: String = ""
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.W500,
            fontSize = 17.sp,
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (distance.isNotBlank()) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "위치",
                    tint = Color(0xFF868C93)
                )
                InfoText(distance)
                InfoText("·")
            }
            InfoText(location)
            InfoText("·")
            InfoText(time)
        }

        Text(
            text = price,
            fontWeight = FontWeight.W600,
            fontSize = 17.sp,
            letterSpacing = (-0.8).sp
        )
    }
}

@Composable
private fun InfoText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = AppTypography.Caption14Medium,
        color = AppColors.Gray
    )
}

@Preview(showBackground = true)
@Composable
fun ProductInfoPreview() {
    ProductInfo(
        title = "쫀드기",
        location = "판교",
        time = "15분 전",
        price = "500원"
    )
}
