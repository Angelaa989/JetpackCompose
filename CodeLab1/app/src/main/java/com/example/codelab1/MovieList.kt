package com.example.codelab1

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
fun MovieList(movies: List<Movie>) {
    LazyColumn {
        items(movies) { movie ->
            var expanded by rememberSaveable { mutableStateOf(false) }

            MovieItem(
                movie = movie,
                expanded = expanded,
                onClick = { expanded = !expanded }
            )
        }
    }
}