package com.example.seriousproject.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemCard(modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(),
        modifier = Modifier.size(width = 240.dp, height = 100.dp)
    ) {
        Text(text = "Dupa")
    }
}