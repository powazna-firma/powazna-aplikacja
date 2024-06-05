package com.example.seriousproject.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun DrawerNavLink(
    name: String,
    route: String,
    onClick: (String) -> Unit,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    NavigationDrawerItem(
        label = { Text(text = name) },
        selected = navBackStackEntry?.destination?.route == route,
        onClick = { onClick(route) },
        modifier = modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )
}