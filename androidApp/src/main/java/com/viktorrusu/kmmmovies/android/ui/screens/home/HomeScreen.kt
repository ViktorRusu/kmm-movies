package com.viktorrusu.kmmmovies.android.ui.screens.home

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.viktorrusu.kmmmovies.android.R
import com.viktorrusu.kmmmovies.android.ui.screens.discover.DiscoverScreen
import com.viktorrusu.kmmmovies.android.ui.screens.favorites.FavoritesScreen
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

@Composable
fun HomeScreen() {
    val sections = HomeSection.values().toList()
    val (currentSection, setCurrentSection) = remember { mutableStateOf(HomeSection.Discover) }

    Scaffold(
        bottomBar = {
            BottomBar(
                sections = sections,
                currentSection = currentSection,
                onSectionSelected = setCurrentSection
            )
        }
    ) {
        Crossfade(
            targetState = currentSection
        ) { section ->
            when (section) {
                HomeSection.Discover -> DiscoverScreen()
                HomeSection.Favorites -> FavoritesScreen()
            }
        }
    }
}

@Composable
fun BottomBar(
    sections: List<HomeSection>,
    currentSection: HomeSection,
    onSectionSelected: (HomeSection) -> Unit
) {
    BottomAppBar(
        modifier = Modifier.height(56.dp),
        backgroundColor = MoviesTheme.colors.background
    ) {
        sections.forEach { section ->
            val selected = section == currentSection
            val icon = if (selected) section.iconSelected else section.icon

            BottomNavigationItem(
                selected = selected,
                alwaysShowLabel = false,
                icon = {
                    Icon(
                        painter = painterResource(id = icon),
                        modifier = Modifier.size(28.dp),
                        tint = Color.Unspecified,
                        contentDescription = null
                    )
                },
                onClick = { onSectionSelected(section) }
            )
        }
    }
}

enum class HomeSection(
    val icon: Int,
    val iconSelected: Int
) {
    Discover(
        icon = R.drawable.ic_menu_discover,
        iconSelected = R.drawable.ic_menu_discover_selected
    ),
    Favorites(
        icon = R.drawable.ic_menu_favorites,
        iconSelected = R.drawable.ic_menu_favorites_selected
    )
}
