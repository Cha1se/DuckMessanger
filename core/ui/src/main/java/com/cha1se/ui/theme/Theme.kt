package com.cha1se.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorScheme = darkColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    tertiary = TextColor,
    background = BGColor,
    onBackground = TextColor,
    surface = BGLightColor,
    onSurface = TextColor,
    surfaceVariant = BGDarkColor,
    onSurfaceVariant = TextVariantColor,
    error = ErrorColor,
    onError = TextColor,
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    tertiary = TextColor,
    background = BGColor,
    onBackground = TextColor,
    surface = BGLightColor,
    onSurface = TextColor,
    surfaceVariant = BGDarkColor,
    onSurfaceVariant = TextVariantColor,
    error = ErrorColor,
    onError = TextColor,
)

@Composable
fun DuckMessengerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}