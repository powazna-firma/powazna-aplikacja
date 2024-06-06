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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.seriousproject.components.DrawerNavLink
import com.example.seriousproject.components.pages.ItemDetailsPage
import com.example.seriousproject.components.pages.ItemListPage
import com.example.seriousproject.components.pages.MainPage
import com.example.seriousproject.components.pages.UlotkaPage
import com.example.seriousproject.data.GadzetyList
import com.example.seriousproject.data.KableList
import com.example.seriousproject.data.PeryferiaList
import com.example.seriousproject.interfaces.Item
import com.example.seriousproject.ui.theme.Montserrat
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
                ScreenPage.PeryferiaList.route -> stringResource(id = R.string.peripherals)
                ScreenPage.KableList.route -> stringResource(id = R.string.cables)
                ScreenPage.GadzetyList.route -> stringResource(id = R.string.gadgets)
                else -> stringResource(id = R.string.serious_company)
            }

            SeriousProjectTheme {
                ModalNavigationDrawer(drawerContent = {
                    ModalDrawerSheet {
                        Spacer(modifier = Modifier.height(16.dp))
                        DrawerNavLink(
                            name = stringResource(id = R.string.main_page),
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
                            name = stringResource(id = R.string.peripherals),
                            route = ScreenPage.PeryferiaList.route,
                            onClick = onDrawerSelected,
                            navController = navController
                        )
                        DrawerNavLink(
                            name = stringResource(id = R.string.cables),
                            route = ScreenPage.KableList.route,
                            onClick = onDrawerSelected,
                            navController = navController
                        )
                        DrawerNavLink(
                            name = stringResource(id = R.string.gadgets),
                            route = ScreenPage.GadzetyList.route,
                            onClick = onDrawerSelected,
                            navController = navController
                        )
                    }
                }, drawerState = drawerState) {
                    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
                        TopAppBar(title = {
                            Text(text = title, fontFamily = Montserrat)
                        }, navigationIcon = {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = stringResource(id = R.string.open_menu)
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
                                ItemListPage(navController, PeryferiaList)
                            }
                            composable(route = ScreenPage.KableList.route) {
                                ItemListPage(navController, KableList)
                            }
                            composable(route = ScreenPage.GadzetyList.route) {
                                ItemListPage(navController, GadzetyList)
                            }
                            composable(route = ScreenPage.Ulotka.route) {
                                UlotkaPage()
                            }
                            composable(route = ScreenPage.ItemDetails.route) {

                                navController.previousBackStackEntry?.savedStateHandle?.get<Item>("item")
                                    ?.let { it1 -> ItemDetailsPage(it1) }
                            }
                        }
                    }
                }
            }
        }
    }
}
