package com.healthydrinks.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Home : Screen("home")
    object Categories : Screen("categories")
    object Cart : Screen("cart")
}
