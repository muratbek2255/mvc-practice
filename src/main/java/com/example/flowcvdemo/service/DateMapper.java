package com.example.flowcvdemo.service;


import com.example.flowcvdemo.entity.Notes;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class DateMapper {

    public Context setData(List<Notes> noteList) {

        Context context = new Context();

        Map<String, Object> data = new HashMap<>();

        data.put("notes", noteList);

        context.setVariables(data);

        return context;
    }
}
