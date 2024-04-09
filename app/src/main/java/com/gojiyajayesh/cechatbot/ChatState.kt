package com.gojiyajayesh.cechatbot

import android.graphics.Bitmap
import com.gojiyajayesh.cechatbot.data.Chat

/**
 * @author Jayesh Ahir
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)