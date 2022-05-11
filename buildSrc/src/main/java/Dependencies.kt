object Versions {
	const val koin = "3.2.0"
	const val coroutines = "1.6.1-native-mt"
	const val compose = "1.1.1"
	const val composeActivity = "1.4.0"
	const val composeNavigation = "2.4.1"
}

object Dependencies {
	object AndroidX {
		object Compose {
			const val ui = "androidx.compose.ui:ui:${Versions.compose}"
			const val material = "androidx.compose.material:material:${Versions.compose}"
			const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
			const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
			const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
			const val navigation = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"
		}
	}

	object Koin {
		const val core = "io.insert-koin:koin-core:${Versions.koin}"
		const val android = "io.insert-koin:koin-android:${Versions.koin}"
	}

	object Coroutines {
		const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
		const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
	}
}