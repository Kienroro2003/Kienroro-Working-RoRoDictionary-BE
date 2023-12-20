package com.example.rorodictionarybe.services;

import com.example.rorodictionarybe.entities.Word;

import java.util.List;

public interface WordService extends CrudService<Word, Long>{
    List<Word> fetchAllWordType();
}
