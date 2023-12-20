package com.example.rorodictionarybe.controllers;

import com.example.rorodictionarybe.entities.Word;
import com.example.rorodictionarybe.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/word")
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping("/list-all")
    public List<Word> getAllWords(){
        return wordService.fetchAllWordType();
    }
}
