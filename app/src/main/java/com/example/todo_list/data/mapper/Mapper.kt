package com.example.todo_list.data.mapper

import com.example.todo_list.data.model.NoteEntity
import com.example.todo_list.domain.model.Note

fun Note.noteToNoteEntity()= NoteEntity(
    id=id,
    text=text,
    title = title
)


fun NoteEntity.noteEntityToNote()=Note(
    id=id,
    text=text,
    title = title
)