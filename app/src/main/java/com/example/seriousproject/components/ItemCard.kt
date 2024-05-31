package com.example.seriousproject.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.seriousproject.R
import com.example.seriousproject.ScreenPage
import com.example.seriousproject.interfaces.Item

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemCard(item: Item, navController: NavController, modifier: Modifier = Modifier) {
//    Card(
//        elevation = CardDefaults.cardElevation(),
//        onClick = {
//                  navController.navigate(ScreenPage.ItemDetails.route)
//        },
//        modifier = Modifier.padding(16.dp).fillMaxWidth()
//    ) {
//        Text(text = "Dupa")
//    }
    Row(
        horizontalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(height = 140.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color.White)
            .padding(all = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 117.dp)
                .requiredHeight(height = 116.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.Black)
        ) {
            Image(
                painter = painterResource(id = R.drawable.skaner),
                contentDescription = "image 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (-10).dp,
                        y = 0.dp)
                    .requiredWidth(width = 137.dp)
                    .requiredHeight(height = 116.dp))
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Drukarka z interfejsem w kodzie morsa",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = (-1).dp)
                    .requiredWidth(width = 179.dp)
                    .requiredHeight(height = 42.dp))
            Text(
                text = "Wśród drukarek jak combi - gra i trąbi",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 13.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 4.dp,
                        y = 57.dp)
                    .requiredWidth(width = 170.dp)
                    .requiredHeight(height = 36.dp))
            Text(
                text = "niecałe 300zł",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 95.dp,
                        y = 105.dp)
                    .requiredWidth(width = 96.dp)
                    .requiredHeight(height = 21.dp))
        }
    }
}