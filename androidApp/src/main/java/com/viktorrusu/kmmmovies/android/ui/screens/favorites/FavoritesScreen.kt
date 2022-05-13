package com.viktorrusu.kmmmovies.android.ui.screens.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

@Composable
fun FavoritesScreen() {
	Box(
		modifier = Modifier
			.fillMaxSize()
			.background(MoviesTheme.colors.background),
		contentAlignment = Alignment.Center
	) {
		Text(text = "Favorites", color = Color.White)
	}
}