package com.example.flowcvdemo.repository;

import com.example.flowcvdemo.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NoteRepository extends JpaRepository<Notes, Integer> {

    List<Notes> findByPictures(Integer pictureId);
}
