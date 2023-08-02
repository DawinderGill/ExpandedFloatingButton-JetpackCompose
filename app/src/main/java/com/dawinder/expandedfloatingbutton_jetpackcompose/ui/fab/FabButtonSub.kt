package com.dawinder.expandedfloatingbutton_jetpackcompose.ui.fab

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.theme.md_theme_light_onSecondary
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.theme.md_theme_light_primary

interface FabButtonSub {
    val iconTint: Color
    val backgroundTint: Color
    val showLabel: Boolean
}

private class FabButtonSubImpl(
    override val iconTint: Color,
    override val backgroundTint: Color,
    override val showLabel: Boolean
) : FabButtonSub

@Composable
fun fabButtonSub(
    backgroundTint: Color = md_theme_light_primary,
    iconTint: Color = md_theme_light_onSecondary,
    showLabel: Boolean = false
): FabButtonSub = FabButtonSubImpl(iconTint, backgroundTint, showLabel)