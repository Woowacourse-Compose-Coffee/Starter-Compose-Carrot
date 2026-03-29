package com.example.composecarrot.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecarrot.R
import com.example.composecarrot.ui.AppColors
import com.example.composecarrot.ui.AppTypography

@Composable
fun ProductItem(
    title: String,
    location: String,
    time: String,
    price: String,
    modifier: Modifier = Modifier,
    likeCount: Int = 0,
    distance: String = "",
) {
    Row(modifier = modifier.fillMaxWidth()) {
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
                tint = AppColors.Gray
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
                        tint = AppColors.Gray
                    )
                    Text(
                        text = likeCount.toString(),
                        style = AppTypography.Caption14Medium,
                        color = AppColors.Gray
                    )
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
