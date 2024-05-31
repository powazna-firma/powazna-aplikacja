package com.example.seriousproject.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.seriousproject.ScreenPage
import com.example.seriousproject.interfaces.Item

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemCard(item: Item, navController: NavController, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(),
        onClick = {
                  navController.navigate(ScreenPage.ItemDetails.route)
        },
        modifier = Modifier.padding(16.dp).fillMaxWidth()
    ) {
        Text(text = "Dupa")
    }
}