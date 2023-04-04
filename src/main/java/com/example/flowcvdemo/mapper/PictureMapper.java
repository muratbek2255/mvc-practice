package com.example.flowcvdemo.mapper;



import com.example.flowcvdemo.dto.PictureDto;
import com.example.flowcvdemo.entity.Picture;

import java.util.stream.Collectors;

import static com.example.flowcvdemo.mapper.NoteMapper.mapToNoteDto;


public class PictureMapper {
    public static Picture mapToPicture(PictureDto picture) {

        Picture pictures = new Picture();

        pictures.setImage(picture.getImage());

        return pictures;
    }

    public static PictureDto mapToPictureDto(Picture Picture) {

        PictureDto pictureDto = new PictureDto();

        pictureDto.setImage(Picture.getImage());
        pictureDto.setNotes(Picture.getNotes().stream().map((note) -> mapToNoteDto(note)).collect(Collectors.toList()));

        return pictureDto;
    }
}
