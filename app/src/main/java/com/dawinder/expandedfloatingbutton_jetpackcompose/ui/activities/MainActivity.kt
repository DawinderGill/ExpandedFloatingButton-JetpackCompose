package com.dawinder.expandedfloatingbutton_jetpackcompose.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.composables.MainScreen
import com.dawinder.expandedfloatingbutton_jetpackcompose.ui.theme.ExpandedFloatingButtonJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandedFloatingButtonJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    MainScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExpandedFloatingButtonJetpackComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface {
            MainScreen()
        }
    }
}