object Versions {
	const val koin = "3.2.0"
	const val coroutines = "1.6.1-native-mt"
}

object Dependencies {
	object Koin {
		const val core = "io.insert-koin:koin-core:${Versions.koin}"
		const val android = "io.insert-koin:koin-android:${Versions.koin}"
	}

	object Coroutines {
		const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
		const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
	}
}