package com.gojiyajayesh.cechatbot.data

import android.graphics.Bitmap

/**
 * @author Jayesh Ahir
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)