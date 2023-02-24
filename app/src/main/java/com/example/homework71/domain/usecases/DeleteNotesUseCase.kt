package com.example.homework71.domain.usecases

import com.example.homework71.domain.model.Note
import com.example.homework71.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    
    fun deleteNotes(note: Note) = noteRepository.deleteNote(note)
}