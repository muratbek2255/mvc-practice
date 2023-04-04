package com.example.flowcvdemo.service.impl;

import com.example.flowcvdemo.dto.NoteDto;
import com.example.flowcvdemo.entity.Notes;
import com.example.flowcvdemo.repository.NoteRepository;
import com.example.flowcvdemo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.flowcvdemo.mapper.NoteMapper.mapToNoteDto;


@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void createNote(NoteDto noteDto) {

        Notes notes = new Notes();

        notes.setTitle(noteDto.getTitle());
        notes.setContent(noteDto.getContent());
        notes.setPictures(noteDto.getPictureDtoList());

        noteRepository.save(notes);
    }

    @Override
    public List<NoteDto> findAllNote() {

        List<Notes> notes = noteRepository.findAll();

        return notes.stream().map((note) -> mapToNoteDto(note)).collect(Collectors.toList());
    }

    @Override
    public NoteDto findByNoteId(int id) {

        Notes notes = noteRepository.findById(id).get();

        return mapToNoteDto(notes);
    }

    @Override
    public void updateNote(int id, NoteDto noteDto) {
        Notes notes = noteRepository.findById(id).get();

        notes.setTitle(noteDto.getTitle());
        notes.setContent(noteDto.getContent());
        notes.setPictures(noteDto.getPictureDtoList());

        noteRepository.save(notes);
    }

    @Override
    public void deleteNote(int id) {

        noteRepository.deleteById(id);
    }
}
