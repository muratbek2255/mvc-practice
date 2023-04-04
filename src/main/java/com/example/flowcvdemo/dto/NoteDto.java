package com.example.flowcvdemo.dto;


import com.example.flowcvdemo.entity.Picture;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class NoteDto {

    String title;

    String content;

    List<Picture> pictureDtoList;
}
