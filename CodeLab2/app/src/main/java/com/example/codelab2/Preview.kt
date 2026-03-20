package com.example.codelab2

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.codelab2.ui.theme.CodeLab2Theme

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    CodeLab2Theme {
        MyApp()
    }
}