package com.eeearl.noteapp.feature.domain.usecase

import com.eeearl.noteapp.feature.domain.model.Note
import com.eeearl.noteapp.feature.domain.repo.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
