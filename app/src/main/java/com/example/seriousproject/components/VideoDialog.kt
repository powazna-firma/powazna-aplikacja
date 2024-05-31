package com.example.seriousproject.components

import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog

@Composable
fun VideoDialog(onDismissRequest: () -> Unit, videoID: Int, modifier: Modifier = Modifier) {
    val videoUri = Uri.parse("android.resource://com.example.seriousproject/raw/" + videoID)
    Dialog(onDismissRequest = onDismissRequest) {
        AndroidView(factory = { context ->
            VideoView(context).apply {
                setVideoURI(videoUri)
                val mediaController = MediaController(context)
                mediaController.setAnchorView(this)
                setMediaController(mediaController)

                setOnPreparedListener {
                    start()
                }

                setOnCompletionListener {
                    start()
                }
            }
        })
    }
}