package com.example.flowcvdemo;


import com.example.flowcvdemo.entity.Notes;
import com.example.flowcvdemo.entity.Picture;
import com.example.flowcvdemo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

//    @Autowired
//    private NoteRepository noteRepository;
//
//    @GetMapping("/greeting")
//    public String greeting(
//            @RequestParam(name="name", required=false, defaultValue="World") String name,
//            Map<String, Object> model
//    ) {
//        model.put("name", name);
//        return "greeting";
//    }
//
//    @GetMapping("/all")
//    public String main(Map<String, Object> model) {
//        Iterable<Notes> notes = noteRepository.findAll();
//
//        model.put("notes", notes);
//
//        return "main";
//    }
//
//    @PostMapping("/all")
//    public String add(@RequestParam String title, @RequestParam String content, @RequestParam Integer pictureId,
//                      Map<String, Object> model) {
//        Notes note = new Notes(title, content, pictureId);
//
//        noteRepository.save(note);
//
//        Iterable<Notes> notes = noteRepository.findAll();
//
//        model.put("notes", notes);
//
//        return "main";
//    }
}