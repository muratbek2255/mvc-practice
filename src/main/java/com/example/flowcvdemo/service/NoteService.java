package com.example.flowcvdemo.service;


import com.example.flowcvdemo.dto.NoteDto;

import java.util.List;

public interface NoteService {

    void createNote(NoteDto noteDto);
    List<NoteDto> findAllNote();
    NoteDto findByNoteId(int id);
    void updateNote(int id, NoteDto noteDto);
    void deleteNote(int id);
}
