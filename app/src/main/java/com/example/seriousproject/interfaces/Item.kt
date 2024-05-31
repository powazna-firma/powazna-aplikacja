package com.example.seriousproject.interfaces

import androidx.compose.ui.graphics.painter.Painter

data class Item(
    val title: String,
    val image: Painter,
    val description: String,
    val price: Float,
)
