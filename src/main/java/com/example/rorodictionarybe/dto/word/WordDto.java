package com.example.rorodictionarybe.dto.word;

import com.example.rorodictionarybe.dto.type.TypeDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface WordDto {
    public Long getId();
    public String getWord();
    public String getWordScraping();
    public String getMeaningScraping();
    public String getMeaningTranslate();
    public String getPronoun();
    public String getCreatedAt();
    List<String> getNameType();
}
