package com.example.flowcvdemo.controller;


import com.example.flowcvdemo.entity.Notes;
import com.example.flowcvdemo.service.DateMapper;
import com.example.flowcvdemo.service.DocumentGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.util.List;


@RestController
public class DocumentController {

    @Autowired
    private DocumentGenerator documentGenerator;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Autowired
    private DateMapper dateMapper;

    @PostMapping(value = "/saveNote")
    public String generateDocument(@RequestBody List<Notes> note) {

        String finalHtml = null;

        Context dataContext = dateMapper.setData(note);

        finalHtml = springTemplateEngine.process("template", dataContext);

        documentGenerator.htmlToPdf(finalHtml);

        return "Success";
    }
}
