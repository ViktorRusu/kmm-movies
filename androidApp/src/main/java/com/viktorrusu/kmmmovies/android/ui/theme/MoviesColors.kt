package com.viktorrusu.kmmmovies.android.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color


@Immutable
data class MoviesColors(
	val background: Color
) {
	companion object {
		@Composable
		fun defaultColors(): MoviesColors = MoviesColors(
			background = Color(0xFF15141F)
		)

		@Composable
		fun defaultDarkColors(): MoviesColors = MoviesColors(
			background = Color(0xFF15141F)
		)
	}
}