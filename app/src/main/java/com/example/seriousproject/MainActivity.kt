package com.example.seriousproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.seriousproject.components.ItemCard
import com.example.seriousproject.components.pages.ItemDetailsPage
import com.example.seriousproject.components.pages.ItemListPage
import com.example.seriousproject.components.pages.MainPage
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
            SeriousProjectTheme {
                ModalNavigationDrawer(drawerContent = {
                    ModalDrawerSheet {
                        Spacer(modifier = Modifier.height(16.dp))
                        NavigationDrawerItem(
                            label = { Text(text = "strona główna") },
                            selected = navBackStackEntry?.destination?.route == ScreenPage.Main.route,
                            onClick = {
                                navController.navigate(ScreenPage.Main.route) {
                                    popUpTo(ScreenPage.Main.route) {
                                        inclusive = true
                                    }
                                }
                                scope.launch { drawerState.close() }
                            },
                            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                        )
                        NavigationDrawerItem(
                            label = { Text(text = "produkty") },
                            selected = navBackStackEntry?.destination?.route == ScreenPage.ItemList.route,
                            onClick = {
                                navController.navigate(ScreenPage.ItemList.route)
                                scope.launch { drawerState.close() }
                            },
                            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                        )
                    }
                }, drawerState = drawerState) {
                    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
                        TopAppBar(title = {
//                                Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "logo", modifier = Modifier.width(40.dp))
                            Text(text = "Poważna firma")
                        }, navigationIcon = {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = "Otwórz menu"
                                )
                            }
                        })
                    }) { innerPadding ->
//                        Column(modifier = Modifier.padding(innerPadding)) {
//                            ItemCard()
//                        }
//                        NavHost(
//                            navController = navController,
//                            startDestination = "",
//                            modifier = Modifier.padding(innerPadding)
//                        )
                        NavHost(
                            navController = navController,
                            startDestination = ScreenPage.Main.route,
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable(route = ScreenPage.Main.route) {
                                MainPage()
                            }
                            composable(route = ScreenPage.ItemList.route) {
                                ItemListPage(navController)
                            }
                            composable(route = ScreenPage.ItemDetails.route) {
                                ItemDetailsPage()
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