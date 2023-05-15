package com.finuncle.components.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

data class  FinuncleColor(
    val primaryStroke: Color,
    val primaryLime1000: Color,
    val primaryLime900: Color,
    val primaryLime800: Color,
    val primaryLime700: Color,
    val primaryLime500: Color,
    val primaryLime300: Color,
    val primaryLime100: Color,
    val primaryLime50: Color,
    val primaryCharcoal500: Color,
    val primaryCharcoal300: Color,
    val primaryCharcoal100: Color,
    val primaryCharcoal60: Color,
    val primaryCharcoal50: Color,
    val primaryCharcoal30: Color,
    val primaryCharcoal10: Color,
    val primaryOffWhite: Color,
    val primaryPureWhite: Color,

    val semanticCritical800: Color,
    val semanticCritical700: Color,
    val semanticCritical500: Color,
    val semanticCritical300: Color,
    val semanticCritical100: Color,

    val semanticWarning500: Color,
    val semanticWarning300: Color,
    val semanticWarning100: Color,

    val semanticSuccess500: Color,
    val semanticSuccess300: Color,
    val semanticSuccess100: Color,

    val semanticInformation500: Color,
    val semanticInformation300: Color,
    val semanticInformation100: Color,
)

internal val finuncleColor = FinuncleColor(
    primaryStroke = Color(0xFFD5CCFF),

    primaryLime1000 = Color(0xFF7A7A01),
    primaryLime900 = Color(0xFFA6A836),
    primaryLime800 = Color(0xFFc0c42d),
    primaryLime700 = Color(0xFFd4d72c),
    primaryLime500 = Color(0xFFDDE048),
    primaryLime300 = Color(0xFFE4E66D),
    primaryLime100 = Color(0xFFEBEC91),
    primaryLime50 = Color(0xFFF1F3B6),

    primaryCharcoal500 = Color(0xFF151515),
    primaryCharcoal300 = Color(0xFF333333),
    primaryCharcoal100 = Color(0xFF666666),
    primaryCharcoal60 = Color(0xFF878787),
    primaryCharcoal50 = Color(0xFF999999),
    primaryCharcoal30 = Color(0xFFD4D4D4),
    primaryCharcoal10 = Color(0xFFE6E6E6),

    primaryOffWhite = Color(0xF5F5F5F5),
    primaryPureWhite = Color(0xFFFFFFFF),

    semanticCritical800 = Color(0xFF971F09),
    semanticCritical700 = Color(0xFFB7250B),
    semanticCritical500 = Color(0xFFD72C0D),
    semanticCritical300 = Color(0xFFF7D5CF),
    semanticCritical100 = Color(0xFFFFEEEE),

    semanticWarning500 = Color(0xFF8A6116),
    semanticWarning300 = Color(0xFFE8DFD0),
    semanticWarning100 = Color(0xFFFFF7D1),

    semanticSuccess500 = Color(0xFF2B7C2F),
    semanticSuccess300 = Color(0xFFD5E5D5),
    semanticSuccess100 = Color(0xFFE9FBDD),

    semanticInformation500 = Color(0xFF00A0AC),
    semanticInformation300 = Color(0xFFCCECEE),
    semanticInformation100 = Color(0xFFC8F1F7),
)

internal val defaultColors = lightColors(
    primary = finuncleColor.primaryCharcoal500,
    primaryVariant = finuncleColor.primaryCharcoal500,
    secondary = finuncleColor.primaryCharcoal500,
    secondaryVariant = finuncleColor.primaryCharcoal500,
    background = finuncleColor.primaryPureWhite,
    surface = finuncleColor.primaryPureWhite,
    onPrimary = finuncleColor.primaryCharcoal500,
    onSecondary = finuncleColor.primaryCharcoal500,
    onBackground = finuncleColor.primaryCharcoal500,
    onSurface = finuncleColor.primaryCharcoal500,
)