package com.example.todo_list.domain.usecase

import com.example.todo_list.domain.repository.NoteRepository

class GetNoteAllUseCase(
    private val noteRepository: NoteRepository
) {
    fun getAllNote()=noteRepository.getAll()

}