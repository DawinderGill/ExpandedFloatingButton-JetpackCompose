package com.dawinder.expandedfloatingbutton_jetpackcompose

import androidx.compose.ui.graphics.vector.ImageVector

interface FabButtonMain {
    val iconRes: ImageVector
    val iconRotate: Float?
}

private class FabButtonMainImpl(
    override val iconRes: ImageVector,
    override val iconRotate: Float?
) : FabButtonMain

fun FabButtonMain(iconRes: ImageVector, iconRotate: Float? = null): FabButtonMain =
    FabButtonMainImpl(iconRes, iconRotate)