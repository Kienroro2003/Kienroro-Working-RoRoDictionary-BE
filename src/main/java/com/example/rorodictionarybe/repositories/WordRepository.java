package com.example.rorodictionarybe.repositories;

import com.example.rorodictionarybe.dto.word.WordDto;
import com.example.rorodictionarybe.entities.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
//    List<Word> getWordsOverview();

    @Query("SELECT w FROM Word w LEFT JOIN FETCH w.types")
    List<Word> fetchAllWordType();

    @Query("""
            SELECT 
            w.wordScraping as wordScraping,
            w.createdAt as createdAt,
            w.meaningTranslate as meaningTranslate,
            w.pronoun as pronoun,
            t.nameType as nameType
            FROM Word w 
            JOIN w.types as t
            WHERE w.flagUsed = true
            """)
    List<WordDto> getListWordOverview();

}
