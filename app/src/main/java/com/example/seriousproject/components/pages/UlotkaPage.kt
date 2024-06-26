package com.example.seriousproject.components.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.seriousproject.R

@Composable
fun UlotkaPage(modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.ulotka), contentDescription = "leaflet",
        modifier = modifier.fillMaxSize())
}