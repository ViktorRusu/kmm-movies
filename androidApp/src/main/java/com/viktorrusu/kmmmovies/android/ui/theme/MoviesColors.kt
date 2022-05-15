package com.viktorrusu.kmmmovies.android.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class MoviesColors(
    val background: Color,
    val primaryAccent: Color,
    val inputBackground: Color,
    val primaryTextColor: Color,
    val secondaryTextColor: Color
) {
    companion object {
        @Composable
        fun defaultColors(): MoviesColors = MoviesColors(
            background = Color(color = 0xFF15141F),
            primaryAccent = Color(color = 0xFFF9684F),
            inputBackground = Color(color = 0xFF211F30),
            primaryTextColor = Color.White,
            secondaryTextColor = Color(color = 0xFFBBBBBB)
        )

        @Composable
        fun defaultDarkColors(): MoviesColors = MoviesColors(
            background = Color(color = 0xFF15141F),
            primaryAccent = Color(color = 0xFFF9684F),
            inputBackground = Color(color = 0xFF211F30),
            primaryTextColor = Color.White,
            secondaryTextColor = Color(color = 0xFFBBBBBB)
        )
    }
}
