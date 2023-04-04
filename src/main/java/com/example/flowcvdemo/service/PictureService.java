package com.example.flowcvdemo.service;


import com.example.flowcvdemo.dto.PictureDto;

import java.util.List;

public interface PictureService {

    void createPicture(PictureDto pictureDto);
    List<PictureDto> findAllPicture();
    PictureDto findByPictureId(int id);
    void updatePicture(int id, PictureDto pictureDto);
    void deletePicture(int id);
}
