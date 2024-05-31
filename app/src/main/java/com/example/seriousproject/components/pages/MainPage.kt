package com.example.seriousproject.components.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.seriousproject.R
import com.example.seriousproject.components.Category
import com.example.seriousproject.components.CategoryCard
import com.example.seriousproject.components.ItemCard
import com.example.seriousproject.interfaces.Item

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MainPage(navController: NavController, modifier: Modifier = Modifier) {
    val chipPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Jesteśmy poważną firmą.\nNasza firma jest poważna.",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { /*TODO*/ }, contentPadding = chipPadding) {
                Text(
                    text = "Jakość",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                )
            }
            Button(onClick = { /*TODO*/ }, contentPadding = chipPadding) {
                Text(
                    text = "Pewność",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                )
            }
            Button(onClick = { /*TODO*/ }, contentPadding = chipPadding) {
                Text(
                    text = "Gwarancja",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                )
            }
        }

        Text(
            text = "Kategorie",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically)
        )

        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
            modifier = Modifier.fillMaxWidth()
        ) {
            CategoryCard(category = Category(title = "Drukarki", image = painterResource(R.drawable.skaner)), navController)
            CategoryCard(category = Category(title = "Skanery", image = painterResource(R.drawable.skaner)), navController)
            CategoryCard(category = Category(title = "Tonery", image = painterResource(R.drawable.skaner)), navController)
            CategoryCard(category = Category(title = "Inne", image = painterResource(R.drawable.skaner)), navController)
        }

        Text(
            text = "Oferta dnia",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically)
        )

        ItemCard(
            item = Item(
                title = "Drukarka",
                description = "gra i trąbi",
                image = painterResource(id = R.drawable.skaner),
                price = 300f
            ), navController = navController
        )


    }
}