package com.compare.io.compario.controller;

import com.compare.io.compario.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @Autowired
    private QuestionRepository questionRepository;

    @RequestMapping(method = RequestMethod.GET)
    public void init(){
        System.out.println(questionRepository.findById(2));
    }
}