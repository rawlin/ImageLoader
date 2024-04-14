package com.rawlincrasto.imageloading.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun ImageScreen(
    modifier: Modifier
) {
    LazyColumn(modifier = modifier) {
    
    }
}

@Composable
fun ImageItem(
    imageUrl: String,
    contentDescription: String? = null,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(painter = , contentDescription = contentDescription)
    }
}