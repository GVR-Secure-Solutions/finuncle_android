package com.finuncle.components.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun FinuncleTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalFinuncleTypography provides finuncleTypography,
        LocalFinuncleColor provides finuncleColor
    ) {
        MaterialTheme(
            colors = defaultColors,
            typography = Fontgraphy,
            shapes = Shapes,
            content = content
        )
    }
}

private val LocalFinuncleTypography = staticCompositionLocalOf { finuncleTypography }
private val LocalFinuncleColor = staticCompositionLocalOf { finuncleColor }

object FinuncleTheme {
    val typography: FinuncleTypography
        @Composable
        get() = LocalFinuncleTypography.current

    val color: FinuncleColor
        @Composable
        get() = LocalFinuncleColor.current
}