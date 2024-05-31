package com.example.seriousproject.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.seriousproject.ScreenPage


data class Category(
    val title: String,
    val image: Painter,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryCard(category: Category, navController: NavController, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(), onClick = {
            navController.navigate(ScreenPage.ItemList.route)
        }, modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(0.4f)
    ) {
        Image(
            painter = category.image,
            contentDescription = category.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        )
        Text(
            text = category.title,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.fillMaxWidth().padding(4.dp)
        )

    }
}