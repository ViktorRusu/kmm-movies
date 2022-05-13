package com.viktorrusu.kmmmovies.android.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp


@Immutable
data class MoviesShapes(
	val inputField: Shape
) {
	companion object {
		@Composable
		fun defaultShapes(): MoviesShapes = MoviesShapes(
			inputField = RoundedCornerShape(8.dp)
		)
	}
}