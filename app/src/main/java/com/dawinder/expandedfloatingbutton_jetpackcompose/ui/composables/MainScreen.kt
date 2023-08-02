package com.dawinder.expandedfloatingbutton_jetpackcompose.ui.composables

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddAlert
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ListAlt
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dawinder.expandedfloatingbutton_jetpackcompose.R
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.fab.FabButtonItem
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.fab.FabButtonMain
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.fab.FabButtonSub
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.fab.MultiFloatingActionButton

/**
 * Composable function to display the main screen of the application.
 * The main screen contains a Scaffold with a Multi-Floating Action Button (Multi-FAB) and a Text component.
 * When the Multi-FAB is expanded, it shows sub-items as individual Floating Action Buttons (FABs).
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val context = LocalContext.current

    // Scaffold with a Multi-Floating Action Button (Multi-FAB)
    Scaffold(floatingActionButton = {
        MultiFloatingActionButton(
            items = listOf(
                FabButtonItem(
                    iconRes = Icons.Filled.Home,
                    label = stringResource(id = R.string.home)
                ),
                FabButtonItem(
                    iconRes = Icons.Filled.ListAlt,
                    label = stringResource(id = R.string.list)
                ),
                FabButtonItem(
                    iconRes = Icons.Filled.AddAlert,
                    label = stringResource(id = R.string.notifications)
                )
            ),
            onFabItemClicked = {
                Toast.makeText(context, it.label, Toast.LENGTH_SHORT).show()
            },
            fabIcon = FabButtonMain(),
            fabOption = FabButtonSub()
        )
    }) {
        // Main content of the screen inside a Column
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(id = R.string.app_name))
        }
    }
}