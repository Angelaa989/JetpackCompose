package com.example.codelab2

import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize

@Composable
fun MyApp() {
    var showOnboarding by rememberSaveable { mutableStateOf(true) }

    Surface(modifier = Modifier.fillMaxSize()) {
        if (showOnboarding) {
            OnboardingScreen {
                showOnboarding = false
            }
        } else {
            HomeScreen()
        }
    }
}