package com.example.campjetpack

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@ExperimentalAnimationApi
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "splash_screen"
    ) {
        composable(
            route = "splash_screen"
        ){
            SplashScreen(navController)
        }
        composable(
            route = "on_board_screen"
        ){
           OnBoardingScreen(navController)
        }
    }
}