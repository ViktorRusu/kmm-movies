package com.viktorrusu.kmmmovies.android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.viktorrusu.kmmmovies.android.ui.screens.details.DetailsScreen
import com.viktorrusu.kmmmovies.android.ui.screens.home.HomeScreen
import com.viktorrusu.kmmmovies.android.ui.screens.splash.SplashScreen

@Composable
fun MoviesNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MoviesRoute.Splash.route
    ) {
        composable(MoviesRoute.Splash.route) {
            SplashScreen {
                navController.popBackStack()
                navController.navigate(MoviesRoute.Home.route)
            }
        }

        composable(MoviesRoute.Home.route) {
            HomeScreen()
        }

        composable(MoviesRoute.Details.route) {
            DetailsScreen()
        }
    }
}

sealed class MoviesRoute(val route: String) {
    object Splash : MoviesRoute("Splash")
    object Home : MoviesRoute("Home")
    object Details : MoviesRoute("Details")
}
