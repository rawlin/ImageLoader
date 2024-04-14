package com.rawlincrasto.imageloader

import android.content.Context
import android.graphics.Bitmap
import androidx.compose.ui.graphics.painter.Painter

class ImageLoader(private val context: Context) {

    @Composable
    fun load(url: String): Painter {
        val imageBitmap = remember(url) { loadImageBitmap(url) }
        return BitmapPainter(imageBitmap)
    }

    private fun loadImageBitmap(urlString: String): ImageBitmap? {
        var bitmap: Bitmap? = null
        try {
            val url = URL(urlString)
            val connection = url.openConnection() as HttpURLConnection
            connection.doInput = true
            connection.connect()
            val input = connection.inputStream
            bitmap = BitmapFactory.decodeStream(input)
        } catch (e: IOException) {
            Log.e("ImageLoader", "Error loading image from URL: $urlString", e)
        }
        return bitmap?.asImageBitmap()
    }
}