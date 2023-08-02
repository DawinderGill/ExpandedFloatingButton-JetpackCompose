package com.dawinder.expandedfloatingbutton_jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable

sealed class FabButtonState {
    object Collapsed : FabButtonState()
    object Expand : FabButtonState()

    fun isExpanded() = this == Expand

    fun toggleValue() = if (isExpanded()) {
        Collapsed
    } else {
        Expand
    }
}

@Composable
fun rememberMultiFabState() =
    remember { mutableStateOf<FabButtonState>(FabButtonState.Collapsed) }