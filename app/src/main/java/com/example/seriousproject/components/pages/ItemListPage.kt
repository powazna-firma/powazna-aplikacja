package com.example.seriousproject.components.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.seriousproject.R
import com.example.seriousproject.components.ItemCard
import com.example.seriousproject.interfaces.Item

@Composable
fun ItemListPage(navController: NavController, modifier: Modifier = Modifier) {
    val exampleItem = Item(
        title = "Jamnik z fletem w dupie",
        image = painterResource(id = R.drawable.skaner),
        description = "Proszę nie grać na flecie, jamnik bardzo tego nie lubi",
        price = 20.45f
    )
    Column(modifier = modifier) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().background(color = Color(0xffebebeb)).padding(
                horizontal = 10.dp, vertical = 15.dp
            )
        ) {
            items(listOf(exampleItem, exampleItem, exampleItem)) { item ->
                ItemCard(item = item, navController)
            }
        }
    }
}