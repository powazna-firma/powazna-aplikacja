package com.example.seriousproject.interfaces

import androidx.compose.ui.graphics.ImageBitmap

data class Item(
    val title: String,
    val image: ImageBitmap,
    val description: String,
    val price: Float,
)
