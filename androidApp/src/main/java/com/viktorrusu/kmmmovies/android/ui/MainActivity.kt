package com.viktorrusu.kmmmovies.android.ui

import android.os.Bundle
import com.viktorrusu.kmmmovies.Greeting
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.viktorrusu.kmmmovies.android.ui.theme.MoviesTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
		setContent {
			MainContent()
		}
    }

	@Composable
	fun MainContent() {
		MoviesTheme {
			Surface(
				modifier = Modifier.fillMaxSize()
			) {
				Text(text = Greeting().greeting())
			}
		}
	}
}
