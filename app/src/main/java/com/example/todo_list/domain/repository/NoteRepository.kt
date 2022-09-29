package com.example.todo_list.domain.repository

import com.example.todo_list.domain.model.Note

interface NoteRepository {
    fun createNote(note: Note)
    fun editNote(note:Note)
    fun deleteNote(note:Note)
    fun getAll()
}