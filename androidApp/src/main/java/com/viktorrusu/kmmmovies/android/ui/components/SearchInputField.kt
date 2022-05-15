package com.viktorrusu.kmmmovies.android.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.viktorrusu.kmmmovies.android.R
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

/**
 * The search component that allows user to fill in a search query.
 *
 * @param query Current query value.
 * @param onValueChanged Handle when the value changes.
 * @param modifier Modifier for styling.
 * @param leadingIcon The icon at the start of the search component.
 * Shows [DefaultSearchInputLeadingIcon] by default.
 * @param label The label shown in the search component, when there is no input.
 * Show [DefaultSearchInputLabel] by default.
 */
@Composable
fun SearchInputField(
    query: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: @Composable RowScope.() -> Unit = { DefaultSearchInputLeadingIcon() },
    label: @Composable () -> Unit = { DefaultSearchInputLabel() }
) {
    var isFocused by remember { mutableStateOf(false) }

    val trailingIcon: (@Composable RowScope.() -> Unit)? = if (isFocused && query.isNotEmpty()) {
        @Composable {
            IconButton(
                modifier = Modifier
                    .weight(1f)
                    .size(24.dp),
                onClick = { onValueChanged("") },
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_clear),
                        tint = Color.White,
                        contentDescription = null
                    )
                }
            )
        }
    } else null

    InputField(
        value = query,
        onValueChanged = onValueChanged,
        modifier = modifier
            .onFocusEvent {
                isFocused = it.isFocused
            },
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon()

                Box(modifier = Modifier.weight(8f)) {
                    if (query.isEmpty()) {
                        label()
                    }

                    innerTextField()
                }

                trailingIcon?.invoke(this)
            }
        },
        maxLines = 1
    )
}

@Composable
fun RowScope.DefaultSearchInputLeadingIcon() {
    Icon(
        modifier = Modifier
            .weight(1f)
            .size(24.dp),
        painter = painterResource(id = R.drawable.ic_search),
        tint = Color.White,
        contentDescription = null
    )
}

@Composable
fun DefaultSearchInputLabel() {
    Text(
        text = stringResource(id = R.string.all_search_hint),
        style = MoviesTheme.typography.body,
        color = MoviesTheme.colors.secondaryTextColor
    )
}

@Preview
@Composable
fun SearchInputFieldPreview() {
    var searchQuery by remember { mutableStateOf("") }

    MoviesTheme {
        SearchInputField(
            query = searchQuery,
            onValueChanged = { searchQuery = it }
        )
    }
}
