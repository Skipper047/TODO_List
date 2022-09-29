package com.example.todo_list.domain.usecase

import com.example.todo_list.domain.model.Note
import com.example.todo_list.domain.repository.NoteRepository

class CreateNoteUseCase(
    private val noteRepository: NoteRepository
) {
    fun createNote(note: Note)=noteRepository.createNote(note)

}