package com.eeearl.noteapp.feature.domain.usecase

import com.eeearl.noteapp.feature.domain.model.InvalidNoteException
import com.eeearl.noteapp.feature.domain.model.Note
import com.eeearl.noteapp.feature.domain.repo.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}
