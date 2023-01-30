package com.example.homework71.domain.usecases

import com.example.homework71.domain.model.Note
import com.example.homework71.domain.repository.NoteRepository

class EditNotesUseCase(private val noteRepository: NoteRepository) {

    fun editNotes(note: Note) = noteRepository.editNote(note)
}