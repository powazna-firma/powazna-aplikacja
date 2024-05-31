package com.example.seriousproject

sealed class ScreenPage(val route: String) {
    object Main: ScreenPage("home")
    object ItemList: ScreenPage("item_list")
    object ItemDetails: ScreenPage("item_details")
}