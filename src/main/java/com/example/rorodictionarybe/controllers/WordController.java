package com.example.rorodictionarybe.controllers;

import com.example.rorodictionarybe.dto.word.WordDto;
import com.example.rorodictionarybe.entities.Word;
import com.example.rorodictionarybe.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list-overview")
    public List<WordDto> getWordsOverview(){
        return wordService.getWordsOverview();
    }

    @GetMapping("/detail-word/{id}")
    public Word getDetailWord(@PathVariable("id")Long id){
        return wordService.getDetailEntity(id);
    }
}
