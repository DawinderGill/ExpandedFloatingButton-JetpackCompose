package com.dawinder.expandedfloatingbutton_jetpackcompose

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.Air
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.PlusOne
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val context = LocalContext.current

    Scaffold(floatingActionButton = {
        MultiFloatingActionButton(
            items = listOf(
                FabButtonItem(
                    id = 1,
                    iconRes = Icons.Filled.AcUnit,
                    label = "Add User"
                ),
                FabButtonItem(
                    id = 2,
                    iconRes = Icons.Filled.AirplaneTicket,
                    label = "Create Group"
                ),
                FabButtonItem(
                    id = 3,
                    iconRes = Icons.Filled.Air,
                    label = "Video Call"
                )
            ),
            fabIcon = FabButtonMain(iconRes = Icons.Filled.PlusOne, iconRotate = 45f),
            onFabItemClicked = {
                Toast.makeText(context, it.label, Toast.LENGTH_SHORT).show()
            },
            fabOption = FabButtonSub(
                iconTint = Color.White,
                showLabel = true
            )
        )
    }) {
        Text(text = "Hello")
    }
}