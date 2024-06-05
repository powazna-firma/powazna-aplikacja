package com.example.seriousproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.seriousproject.components.DrawerNavLink
import com.example.seriousproject.components.pages.ItemDetailsPage
import com.example.seriousproject.components.pages.ItemListPage
import com.example.seriousproject.components.pages.MainPage
import com.example.seriousproject.interfaces.Item
import com.example.seriousproject.ui.theme.SeriousProjectTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            val scope = rememberCoroutineScope()
            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val onDrawerSelected: (String) -> Unit = { route ->
                navController.navigate(route)
                scope.launch { drawerState.close() }
            }
            val title = when (navBackStackEntry?.destination?.route) {
                ScreenPage.PeryferiaList.route -> "Kategoria 1"
                ScreenPage.KableList.route -> "Kategoria 2"
                ScreenPage.GadzetyList.route -> "Kategoria 3"
                else -> "Poważna firma"
            }

            val exampleItem = Item(
                title = "Jamnik z fletem w dupie",
                image = painterResource(id = R.drawable.skaner),
                description = "Proszę nie grać na flecie, jamnik bardzo tego nie lubi",
                price = 20.45f
            )
            SeriousProjectTheme {
                ModalNavigationDrawer(drawerContent = {
                    ModalDrawerSheet {
                        Spacer(modifier = Modifier.height(16.dp))
                        DrawerNavLink(
                            name = "strong główna",
                            route = ScreenPage.Main.route,
                            onClick = {
                                navController.navigate(ScreenPage.Main.route) {
                                    popUpTo(ScreenPage.Main.route) {
                                        inclusive = true
                                    }
                                }
                                scope.launch { drawerState.close() }
                            },
                            navController = navController
                        )
                        DrawerNavLink(
                            name = "Peryferia",
                            route = ScreenPage.PeryferiaList.route,
                            onClick = onDrawerSelected,
                            navController = navController
                        )
                        DrawerNavLink(
                            name = "Kable",
                            route = ScreenPage.KableList.route,
                            onClick = onDrawerSelected,
                            navController = navController
                        )
                        DrawerNavLink(
                            name = "Gadżety",
                            route = ScreenPage.GadzetyList.route,
                            onClick = onDrawerSelected,
                            navController = navController
                        )
                    }
                }, drawerState = drawerState) {
                    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
                        TopAppBar(title = {
//                                Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "logo", modifier = Modifier.width(40.dp))
                            Text(text = title)
                        }, navigationIcon = {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = "Otwórz menu"
                                )
                            }
                        })
                    }) { innerPadding ->
                        NavHost(
                            navController = navController,
                            startDestination = ScreenPage.Main.route,
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable(route = ScreenPage.Main.route) {
                                MainPage(navController, modifier = Modifier.padding(16.dp))
                            }
                            composable(route = ScreenPage.PeryferiaList.route) {
                                ItemListPage(navController, listOf(exampleItem, exampleItem, exampleItem))
                            }
                            composable(route = ScreenPage.KableList.route) {
                                ItemListPage(navController, items = listOf(exampleItem))
                            }
                            composable(route = ScreenPage.GadzetyList.route) {
                                ItemListPage(navController, items = listOf(exampleItem))
                            }
                            composable(route = ScreenPage.ItemDetails.route) {
                                ItemDetailsPage(item = Item(
                                    price = 299.99f,
                                    description = "Gra i trąbi",
                                    title = "Drukarka",
                                    image = painterResource(id = R.drawable.skaner)
                                ))
                            }
                        }
                    }
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!", modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SeriousProjectTheme {
//        Greeting("Android")
//    }
//}