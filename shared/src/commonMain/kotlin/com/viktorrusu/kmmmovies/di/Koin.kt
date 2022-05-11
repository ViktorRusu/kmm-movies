package com.viktorrusu.kmmmovies.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration

expect val platformModule: Module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
	modules(
		platformModule
	)
	appDeclaration()
}

fun initKoin() = initKoin {  }