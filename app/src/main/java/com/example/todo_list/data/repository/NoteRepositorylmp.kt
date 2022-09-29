package com.example.todo_list.data.repository

import com.example.todo_list.App
import com.example.todo_list.data.mapper.noteToNoteEntity
import com.example.todo_list.domain.model.Note
import com.example.todo_list.domain.repository.NoteRepository

class NoteRepositorylmp: NoteRepository {

    private val noteDao = App.roomDatabase.noteDao()

    override fun createNote(note: Note) {
        noteDao.createNote(note.noteToNoteEntity())
    }

    override fun editNote(note: Note) {
        noteDao.edit(note.noteToNoteEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.noteToNoteEntity())
    }

    override fun getAll() {
        noteDao.getAllNotes()
    }
}