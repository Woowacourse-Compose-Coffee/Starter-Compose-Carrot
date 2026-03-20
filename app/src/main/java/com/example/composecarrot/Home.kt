package com.example.composecarrot

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    HomeContent(modifier = Modifier.fillMaxSize())
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
private fun HomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        HomeHeaderSection(Modifier.padding(start = 10.dp, top = 43.dp, end = 23.dp))

        Spacer(modifier = Modifier.height(27.dp))

        HomeFilterSection(Modifier.padding(start = 10.dp))

        Spacer(modifier = Modifier.height(33.dp))

        ProductList(modifier = Modifier.padding(horizontal = 10.dp))
    }
}

@Composable
private fun HomeHeaderSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
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

@Composable
private fun HomeFilterSection(modifier: Modifier = Modifier) {
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

@Preview(showBackground = true)
@Composable
private fun HomeFilterSectionPreview() {
    HomeFilterSection()
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

@Composable
private fun ProductList(modifier: Modifier = Modifier) {
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

@Composable
private fun ProductItem(
    title: String,
    location: String,
    time: String,
    price: String,
    likeCount: Int = 0,
    distance: String = "",
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.img_list_home_1),
            contentDescription = "상품이미지",
            modifier = Modifier
                .size(108.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        Spacer(modifier = Modifier.width(17.dp))

        ProductInfo(
            title = title,
            location = location,
            time = time,
            price = price,
            distance = distance
        )

        Spacer(modifier = Modifier.width(11.dp))

        Column(
            modifier = Modifier.height(108.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "세부사항 보기",
                modifier = Modifier.size(18.dp),
                tint = Color(0xFF868C93)
            )

            Spacer(modifier = Modifier.weight(1f))

            if (likeCount > 0) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "좋아요",
                        modifier = Modifier.size(18.dp),
                        tint = Color(0xFF868C93)
                    )
                    GrayMediumText(likeCount.toString())
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        title = "산산기어 스웻직업(마지막가격)",
        location = "위례동",
        time = "15분 전",
        price = "70,000원",
        likeCount = 8,
        distance = "3.4km"
    )
}

@Composable
private fun ProductInfo(
    title: String,
    location: String,
    time: String,
    price: String,
    distance: String = ""
) {
    Column(verticalArrangement = Arrangement.spacedBy(7.dp)) {
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
                GrayMediumText(distance)
                GrayMediumText("·")
            }
            GrayMediumText(location)
            GrayMediumText("·")
            GrayMediumText(time)
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
private fun GrayMediumText(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        letterSpacing = (-0.3).sp,
        color = Color(0xFF868C93)
    )
}
