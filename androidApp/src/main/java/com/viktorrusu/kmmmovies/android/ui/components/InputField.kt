package com.viktorrusu.kmmmovies.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme

/**
 * Custom input field.
 *
 * @param value The current input value.
 * @param onValueChanged Handler when the value changes as user types.
 * @param modifier Modifier for styling.
 * @param maxLines The number of lines that are allowed in the input.
 * @param innerPadding The padding inside the input field.
 * @param decorationBox Composable function that represents the input field decoration as it's filled with content.
 */
@Composable
fun InputField(
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    innerPadding: Dp = 8.dp,
    decorationBox: @Composable (innerTextField: @Composable () -> Unit) -> Unit
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(value)) }

    BasicTextField(
        modifier = modifier
            .height(48.dp)
            .clip(shape = MoviesTheme.shapes.inputField)
            .background(color = MoviesTheme.colors.inputBackground)
            .padding(innerPadding),
        value = textFieldValueState,
        onValueChange = {
            textFieldValueState = it
            if (value != it.text) {
                onValueChanged(it.text)
            }
        },
        textStyle = MoviesTheme.typography.body.copy(
            color = MoviesTheme.colors.primaryTextColor,
            textDirection = TextDirection.Content
        ),
        cursorBrush = SolidColor(value = MoviesTheme.colors.primaryAccent),
        decorationBox = { decorationBox(it) },
        maxLines = maxLines,
        singleLine = maxLines == 1
    )
}
