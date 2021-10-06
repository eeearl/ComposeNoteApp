package com.eeearl.noteapp.feature.presentation.addeditnote

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
