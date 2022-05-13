package com.viktorrusu.kmmmovies.android.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.viktorrusu.kmmmovies.android.R

private val LatoFontFamily = FontFamily(
	Font(R.font.lato_regular),
	Font(R.font.lato_bold, FontWeight.Bold)
)

@Immutable
data class MoviesTypography(
	val body: TextStyle
) {
	companion object {
		@Composable
		fun defaultTypography(fontFamily: FontFamily? = LatoFontFamily): MoviesTypography = MoviesTypography(
			body = TextStyle(
				fontSize = 14.sp,
				fontFamily = fontFamily,
				fontWeight = FontWeight.W400
			)
		)
	}
}