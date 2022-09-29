package com.example.todo_list.domain.usecase

import com.example.todo_list.domain.model.Note
import com.example.todo_list.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {
    fun deleteNote(note: Note)=noteRepository.deleteNote(note)

}