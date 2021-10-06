package com.eeearl.noteapp.feature.domain.usecase

import com.eeearl.noteapp.feature.domain.model.Note
import com.eeearl.noteapp.feature.domain.repo.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
