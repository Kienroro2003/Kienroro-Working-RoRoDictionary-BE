package com.example.rorodictionarybe.services.imple;

import com.example.rorodictionarybe.entities.Word;
import com.example.rorodictionarybe.repositories.WordRepository;
import com.example.rorodictionarybe.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordRepository repoWord;

    @Override
    public Word add(Word entity) {
        return repoWord.save(entity);
    }

    @Override
    public Word remove(Long id) {
        Optional<Word> wordOptional = repoWord.findById(id);
        if(wordOptional.isPresent()){
            Word wordPresent = wordOptional.get();
            wordPresent.setFlagUsed(false);
            return repoWord.save(wordPresent);
        }
        return null;
    }

    private boolean checkFieldNotNullOrBlank(String field){
        if(field == null || field.isBlank())return false;
        return true;
    }

    @Override
    public Word update(Long id, Word patch) {
        Optional<Word> wordOptional = repoWord.findById(id);
        if(wordOptional.isPresent()){
            Word wordPresent = wordOptional.get();
            if(checkFieldNotNullOrBlank(patch.getWord())){
                wordPresent.setWord(patch.getWord());
            }
            if(checkFieldNotNullOrBlank(patch.getWordScraping())){
                wordPresent.setWordScraping(patch.getWordScraping());
            }
            if(checkFieldNotNullOrBlank(patch.getMeaningScraping())){
                wordPresent.setMeaningScraping(patch.getMeaningScraping());
            }
            if(checkFieldNotNullOrBlank(patch.getMeaningTranslate())){
                wordPresent.setMeaningTranslate(patch.getMeaningTranslate());
            }
            if(checkFieldNotNullOrBlank(patch.getPronoun())){
                wordPresent.setPronoun((patch.getPronoun()));
            }
            if(patch.getTypes() != null){
                wordPresent.setTypes(patch.getTypes());
            }
            return repoWord.save(wordPresent);
        }
        return null;
    }

    @Override
    public List<Word> getAll() {
        return repoWord.findAll();
    }

    @Override
    public List<Word> fetchAllWordType() {
        return repoWord.fetchAllWordType();
    }
}
