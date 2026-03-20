package com.example.codelab1

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp

@Composable
fun TopBar() {
    Surface(
        tonalElevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "🎬 Movie Genres",
            modifier = Modifier.padding(20.dp),
            style = MaterialTheme.typography.headlineMedium
        )
    }
}