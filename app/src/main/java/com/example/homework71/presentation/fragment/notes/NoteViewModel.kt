package com.example.homework71.presentation.fragment.notes

import androidx.lifecycle.viewModelScope
import com.example.homework71.domain.model.Note
import com.example.homework71.domain.usecases.DeleteNotesUseCase
import com.example.homework71.domain.usecases.GetNotesUseCase
import com.example.homework71.domain.utils.Resource
import com.example.homework71.presentation.base.BaseViewModel
import com.example.homework71.presentation.fragment.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val getNotesUseCase: GetNotesUseCase,
    private val deleteNotesUseCase: DeleteNotesUseCase
) : BaseViewModel() {

    private val _getNotesState = MutableStateFlow<UIState<List<Note>>>(UIState.Empty())
    val getNoteState = _getNotesState.asStateFlow()

    private val _deleteNotesState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val deleteNoteState = _deleteNotesState.asStateFlow()

    fun getNotes() {
        getNotesUseCase.getNotes().collectFlow(_getNotesState)
    }

    fun deleteNotes(note: Note) {
        deleteNotesUseCase.deleteNotes(note).collectFlow(_deleteNotesState)
    }
}