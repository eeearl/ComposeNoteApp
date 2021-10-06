package com.eeearl.noteapp.feature.presentation.notes

import com.eeearl.noteapp.feature.domain.model.Note
import com.eeearl.noteapp.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
