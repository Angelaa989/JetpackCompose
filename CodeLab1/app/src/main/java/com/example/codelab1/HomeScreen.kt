package com.example.codelab1

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {

    val genres = listOf(
        Genre(
            "Action", "🎬",
            listOf(
                Movie("John Wick", "Hitman revenge story"),
                Movie("Mad Max", "Post-apocalyptic action")
            )
        ),
        Genre(
            "Comedy", "😂",
            listOf(
                Movie("The Hangover", "Crazy trip"),
                Movie("Superbad", "Teen comedy")
            )
        ),
        Genre(
            "Horror", "😱",
            listOf(
                Movie("The Conjuring", "Paranormal horror"),
                Movie("IT", "Scary clown")
            )
        ),
        Genre(
            "Romance", "❤️",
            listOf(
                Movie("Titanic", "Love story"),
                Movie("The Notebook", "Emotional romance")
            )
        )
    )

    LazyColumn(
        modifier = Modifier.padding(8.dp)
    ) {
        item {
            TopBar()
        }

        items(genres) { genre ->
            GenreItem(genre)
        }
    }
}