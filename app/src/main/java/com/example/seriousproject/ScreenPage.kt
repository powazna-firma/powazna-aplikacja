package com.example.seriousproject

sealed class ScreenPage(val route: String) {
    object Main: ScreenPage("home")
    object Category1List: ScreenPage("item_list_1")
    object Category2List: ScreenPage("item_list_2")
    object Category3List: ScreenPage("item_list_3")
    object ItemDetails: ScreenPage("item_details")
}