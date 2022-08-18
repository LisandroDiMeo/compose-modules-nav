package com.example.authmodule.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.authmodule.views.HomeAuth

@Composable
fun AuthNavGraph(navHostController: NavHostController){
    val authNavController = rememberNavController()
    NavHost(authNavController, startDestination = "auth_home"){
        composable("auth_home"){
            HomeAuth { navHostController.navigate("home") }
        }
    }
}