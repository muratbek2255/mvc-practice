package com.example.flowcvdemo.service.impl;

import com.example.flowcvdemo.dto.PictureDto;
import com.example.flowcvdemo.entity.Picture;
import com.example.flowcvdemo.repository.PictureRepository;
import com.example.flowcvdemo.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.flowcvdemo.mapper.PictureMapper.mapToPictureDto;


@Service
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;

    @Autowired
    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @Override
    public void createPicture(PictureDto pictureDto) {
        Picture picture = new Picture();

        picture.setImage(pictureDto.getImage());

        pictureRepository.save(picture);
    }

    @Override
    public List<PictureDto> findAllPicture() {

        List<Picture> pictures = pictureRepository.findAll();

        return pictures.stream().map((picture) -> mapToPictureDto(picture)).collect(Collectors.toList());
    }

    @Override
    public PictureDto findByPictureId(int id) {
        Picture picture = pictureRepository.findById(id).get();

        return mapToPictureDto(picture);
    }

    @Override
    public void updatePicture(int id, PictureDto pictureDto) {
        Picture picture = pictureRepository.findById(id).get();

        picture.setImage(pictureDto.getImage());

        pictureRepository.save(picture);
    }

    @Override
    public void deletePicture(int id) {

        pictureRepository.deleteById(id);
    }
}
