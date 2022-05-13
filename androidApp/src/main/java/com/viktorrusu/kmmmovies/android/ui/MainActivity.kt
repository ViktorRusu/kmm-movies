package com.viktorrusu.kmmmovies.android.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.viktorrusu.kmmmovies.android.ui.navigation.MoviesNavigation
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
		setContent {
			MainContent()
		}
    }

	@Composable
	fun MainContent() {
		MoviesTheme {
			Surface(
				modifier = Modifier.fillMaxSize(),
				color = MoviesTheme.colors.background
			) {
				SetStatusBarColor()
				MoviesNavigation()
			}
		}
	}
}

@Composable
fun SetStatusBarColor() {
	val systemUiController = rememberSystemUiController()

	val statusBarColor = MoviesTheme.colors.background

	SideEffect {
		systemUiController.setStatusBarColor(
			color = statusBarColor,
			darkIcons = false
		)
	}
}
