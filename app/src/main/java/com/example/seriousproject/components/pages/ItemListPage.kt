package com.example.seriousproject.components.pages

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.seriousproject.components.ItemCard

@Composable
fun ItemListPage(modifier: Modifier = Modifier) {
    ItemCard()
    Text(text = "dupsko list")
}