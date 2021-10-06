package com.eeearl.noteapp.feature.data.repo

import com.eeearl.noteapp.feature.data.source.NoteDao
import com.eeearl.noteapp.feature.domain.model.Note
import com.eeearl.noteapp.feature.domain.repo.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}
