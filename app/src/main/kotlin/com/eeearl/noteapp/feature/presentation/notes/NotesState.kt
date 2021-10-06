package com.eeearl.noteapp.feature.presentation.notes

import com.eeearl.noteapp.feature.domain.model.Note
import com.eeearl.noteapp.feature.domain.util.NoteOrder
import com.eeearl.noteapp.feature.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
