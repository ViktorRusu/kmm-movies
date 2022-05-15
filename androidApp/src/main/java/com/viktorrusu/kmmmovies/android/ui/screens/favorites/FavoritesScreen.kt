package com.viktorrusu.kmmmovies.android.ui.screens.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.viktorrusu.kmmmovies.android.R
import com.viktorrusu.kmmmovies.android.ui.components.Header
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

@Composable
fun FavoritesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MoviesTheme.colors.background)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
    ) {
        Header(title = stringResource(id = R.string.favorites_title))
    }
}
