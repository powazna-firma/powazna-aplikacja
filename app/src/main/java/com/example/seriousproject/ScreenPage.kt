package com.example.seriousproject

sealed class ScreenPage(val route: String) {
    object Main : ScreenPage("home")
    object PeryferiaList : ScreenPage("item_list_1")
    object KableList : ScreenPage("item_list_2")
    object GadzetyList : ScreenPage("item_list_3")
    object ItemDetails : ScreenPage("item_details")
}