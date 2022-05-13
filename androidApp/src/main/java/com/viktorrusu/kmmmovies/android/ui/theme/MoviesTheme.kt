package com.viktorrusu.kmmmovies.android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf

private val LocalColors = compositionLocalOf<MoviesColors> {
	error("No colors provided!")
}

private val LocalShapes = compositionLocalOf<MoviesShapes> {
	error("No shapes provided!")
}

private val LocalTypography = compositionLocalOf<MoviesTypography> {
	error("No typography provided!")
}

@Composable
fun MoviesTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val colors = if (darkTheme) MoviesColors.defaultColors() else MoviesColors.defaultDarkColors()
	val shapes = MoviesShapes.defaultShapes()
	val typography = MoviesTypography.defaultTypography()

	CompositionLocalProvider(
		LocalColors provides colors,
		LocalShapes provides shapes,
		LocalTypography provides typography
	) {
		content()
	}
}

/**
 * Contains accessors for different properties used to style and customize the app look and feel.
 */
object MoviesTheme {
	/**
	 * Retrieves current [MoviesColors] at the call site's position in the hierarchy.
	 */
	val colors: MoviesColors
		@Composable
		@ReadOnlyComposable
		get() = LocalColors.current

	/**
	 * Retrieves current [MoviesShapes] at the call site's position in the hierarchy.
	 */
	val shapes: MoviesShapes
		@Composable
		@ReadOnlyComposable
		get() = LocalShapes.current

	/**
	 * Retrieves current [MoviesTypography] at the call site's position in the hierarchy.
	 */
	val typography: MoviesTypography
		@Composable
		@ReadOnlyComposable
		get() = LocalTypography.current
}