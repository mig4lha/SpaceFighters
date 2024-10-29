package com.example.spaceinvaders

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun GameScreenView () {
    AndroidView(factory = { context ->
        GameView(context = context)
    })
}