package com.example.composecarrot.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecarrot.ui.home.component.HomeFilterSection
import com.example.composecarrot.ui.home.component.HomeHeaderSection
import com.example.composecarrot.ui.home.component.ProductList

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    HomeContent(modifier = modifier.fillMaxSize())
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
private fun HomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        HomeHeaderSection(modifier = Modifier.padding(start = 10.dp, top = 43.dp, end = 23.dp))

        Spacer(modifier = Modifier.height(27.dp))

        HomeFilterSection(modifier = Modifier.padding(start = 10.dp))

        Spacer(modifier = Modifier.height(33.dp))

        ProductList(modifier = Modifier.padding(horizontal = 10.dp))
    }
}
