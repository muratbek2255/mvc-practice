package com.example.flowcvdemo.repository;

import com.example.flowcvdemo.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PictureRepository extends JpaRepository<Picture, Integer> {

    List<Picture> findByNotes(Integer notesId);
}
