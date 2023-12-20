package com.example.rorodictionarybe.controller;

import com.example.rorodictionarybe.entities.Type;
import com.example.rorodictionarybe.entities.Word;
import com.example.rorodictionarybe.repositories.TypeRepository;
import com.example.rorodictionarybe.repositories.WordRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class WordControllerTest {
    private List<Word> words;
    private List<Type> types;

    @MockBean
    private WordRepository repoWord;
    @MockBean
    private TypeRepository repoType;

//    @BeforeEach
//    public void setup(){
//        types = Arrays.asList(
//                new Type(1L, "Adj"),
//                new Type(2L, "Noun"),
//                new Type(3L, "Verb")
//        );
//        words = Arrays.asList(
//                new Word( "hello", "hello", "xin chao", "xin chao", "helou", true).setTypes(Arrays.asList(types.get(0)));,
//                new Word("bye", "bye", "tam biet", "tam biet", "bei", true)
//        )
//    }
}
