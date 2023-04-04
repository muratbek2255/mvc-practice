package com.example.flowcvdemo.mapper;


import com.example.flowcvdemo.dto.NoteDto;
import com.example.flowcvdemo.entity.Notes;


public class NoteMapper {
    public static Notes mapToNote(NoteDto NoteDto) {

        Notes notes = new Notes();

        notes.setTitle(NoteDto.getTitle());
        notes.setContent(NoteDto.getContent());
        notes.setPictures(NoteDto.getPictureDtoList());

        return notes;
    }

    public static NoteDto mapToNoteDto(Notes Note) {

        NoteDto notes = new NoteDto();

        notes.setTitle(Note.getTitle());
        notes.setContent(Note.getContent());
        notes.setPictureDtoList(Note.getPictures());

        return notes;
    }
}
