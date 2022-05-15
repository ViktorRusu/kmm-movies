package com.viktorrusu.kmmmovies.android.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

/**
 * Component used to show the screen title.
 *
 * @param title Text to be shown.
 * @param modifier Modifier used for styling.
 */
@Composable
fun Header(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        modifier = modifier
            .fillMaxWidth(),
        style = MoviesTheme.typography.title1,
        color = MoviesTheme.colors.primaryTextColor
    )
}

@Preview
@Composable
fun HeaderPreview() {
    MoviesTheme {
        Header(
            title = "Hi there"
        )
    }
}
