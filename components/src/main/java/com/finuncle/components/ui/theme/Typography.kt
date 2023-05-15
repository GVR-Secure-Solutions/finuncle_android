@file:Suppress("DEPRECATION") // Issue with PlatformTextStyle - it is wrongly marked as deprecated

package com.finuncle.components.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.finuncle.components.R

val FontRegular = FontFamily(
    Font(R.font.figtree_regular)
)

val FontSemiBold = FontFamily(
    Font(R.font.figtree_semi_bold)
)

data class FinuncleTypography(
    val headingExtraLargeRegular: TextStyle,
    val headingExtraLargeSemibold: TextStyle,
    val headingLargeSemibold: TextStyle,
    val headingLargeRegular: TextStyle,
    val headingMediumSemibold: TextStyle,
    val headingMediumRegular: TextStyle,
    val headingSmallSemibold: TextStyle,
    val headingSmallRegular: TextStyle,
    val largeSemibold: TextStyle,
    val largeRegular: TextStyle,
    val largeLink: TextStyle,
    val bodySemibold: TextStyle,
    val bodyRegular: TextStyle,
    val bodyLink: TextStyle,
    val smallSemibold: TextStyle,
    val smallRegular: TextStyle,
    val smallLink: TextStyle,
    val xSmallSemibold: TextStyle,
    val xSmallRegular: TextStyle,
    val caption: TextStyle
)

internal val finuncleTypography = FinuncleTypography(
    // HEADING - EXTRA LARGE
    headingExtraLargeRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 48.sp,
        lineHeight = 56.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    headingExtraLargeSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 48.sp,
        lineHeight = 56.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),

    // HEADING - LARGE
    headingLargeRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 40.sp,
        lineHeight = 48.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    headingLargeSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 40.sp,
        lineHeight = 48.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),

    // HEADING - MEDIUM
    headingMediumRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    headingMediumSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),

    // HEADING - SMALL
    headingSmallRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    headingSmallSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),

    // LARGE
    largeRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    largeSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    largeLink = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
        textDecoration = TextDecoration.Underline
    ),

    // BODY
    bodyRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    bodySemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    bodyLink = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),

    // SMALL
    smallRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    smallSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    smallLink = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 13.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.W700,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
        textDecoration = TextDecoration.Underline
    ),

    // X-SMALL
    xSmallRegular = TextStyle(
        fontFamily = FontRegular,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),
    xSmallSemibold = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.W600,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    ),

    // CAPTION
    caption = TextStyle(
        fontFamily = FontRegular,
        fontSize = 14.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.W400,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )
)

internal val Fontgraphy = Typography(
    h1 = finuncleTypography.headingLargeRegular,
    h2 = finuncleTypography.headingMediumRegular,
    h3 = finuncleTypography.headingSmallRegular,
    body1 = finuncleTypography.bodyRegular,
    subtitle1 = finuncleTypography.smallRegular,
    button = finuncleTypography.largeRegular,
    caption = finuncleTypography.caption,
    defaultFontFamily = FontSemiBold
)
