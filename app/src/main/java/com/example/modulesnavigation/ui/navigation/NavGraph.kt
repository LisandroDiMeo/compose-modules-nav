package com.example.modulesnavigation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.authmodule.navigation.AuthNavGraph
import com.example.modulesnavigation.ui.Home

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController, "home"){
        composable("home"){
            Home { nextScreen ->
                navController.navigate(nextScreen)
            }
        }
        composable("screen_1"){
            AuthNavGraph(navHostController = navController)
        }
    }
}