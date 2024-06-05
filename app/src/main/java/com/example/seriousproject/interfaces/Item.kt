package com.example.seriousproject.interfaces

import androidx.compose.ui.graphics.painter.Painter
import java.io.Serializable

data class Item(
    val title: Int,
    val image: Int,
    val description: Int,
    val price: Float,
) : Serializable
