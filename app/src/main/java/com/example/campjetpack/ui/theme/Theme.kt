package com.example.campjetpack.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Orange100,
    primaryVariant = Orange100,
    secondary = Orange100
)

private val LightColorPalette = lightColors(
    primary = Orange100,
    primaryVariant = Orange100,
    secondary = Orange100

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.Orange100,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun CampJetpackTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}