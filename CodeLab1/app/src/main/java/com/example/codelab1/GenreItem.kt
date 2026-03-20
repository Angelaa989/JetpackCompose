package com.example.codelab1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GenreItem(genre: Genre) {

    var expanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Text(
                text = "${genre.emoji} ${genre.name}",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = { expanded = !expanded },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(if (expanded) "Show less" else "Show more")
            }

            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))

                genre.movies.forEach { movie ->
                    Text("• ${movie.title} - ${movie.description}")
                }
            }
        }
    }
}