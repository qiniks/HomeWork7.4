package com.example.homework71.domain.usecases

import com.example.homework71.domain.model.Note
import com.example.homework71.domain.repository.NoteRepository

class CreateNotesUseCase(private val noteRepository: NoteRepository) {

    fun createNotes(note: Note) = noteRepository.createNote(note)
}