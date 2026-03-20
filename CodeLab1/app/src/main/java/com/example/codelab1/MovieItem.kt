package com.example.codelab1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MovieItem(
    movie: Movie,
    expanded: Boolean,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.padding(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Text(
                text = movie.title,
                style = MaterialTheme.typography.titleLarge
            )


            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = onClick) {
                Text(if (expanded) "Show less" else "Show more")
            }

            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(movie.description)
            }
        }
    }
}