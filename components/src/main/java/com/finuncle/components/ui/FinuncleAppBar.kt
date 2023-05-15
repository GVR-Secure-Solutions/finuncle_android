package com.finuncle.components.ui

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.AppBarDefaults.TopAppBarElevation
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.finuncle.components.ui.theme.FinuncleTheme


@Composable
fun FinuncleAppBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit = {},
    backgroundColor: Color = FinuncleTheme.color.primaryLime500,
    elevation: Dp = TopAppBarElevation,
){
    TopAppBar(
        modifier = modifier,
        backgroundColor = backgroundColor,
        content = content,
        elevation = elevation
    )
}






