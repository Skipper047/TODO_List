package com.example.todo_list.domain.usecase

import com.example.todo_list.domain.model.Note
import com.example.todo_list.domain.repository.NoteRepository

class EditNoteUseCase (
    private val noteRepository: NoteRepository
) {
    fun editNote(note: Note)=noteRepository.editNote(note)

}