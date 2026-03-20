package com.example.codelab1

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.codelab1.ui.theme.CodeLab1Theme

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    CodeLab1Theme {
        MyApp()
    }
}