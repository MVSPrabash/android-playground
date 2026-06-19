package com.prabash.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import com.prabash.playground.ui.theme.PlaygroundTheme
import com.prabash.playground.composables.ProfileCard

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaygroundTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar({ Text("Profile") })
                    }
                ) { innerPadding ->
                    ProfileCard(
                        "Prabash",
                        "Student",
                        "India",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

