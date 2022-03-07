package com.example.campjetpack.navigation

sealed class Screen(val route:String){
    object Splash : Screen("splash_screen")
    object OnBoard : Screen("onboard_screen")
    object Map : Screen("map_screen")

}
