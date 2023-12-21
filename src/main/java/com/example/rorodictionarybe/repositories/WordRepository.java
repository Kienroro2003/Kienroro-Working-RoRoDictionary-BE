package com.example.rorodictionarybe.repositories;

import com.example.rorodictionarybe.dto.word.WordDto;
import com.example.rorodictionarybe.entities.Word;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
//    List<Word> getWordsOverview();

    @Query("SELECT w FROM Word w LEFT JOIN FETCH w.types")
    List<Word> fetchAllWordType();

    @Query("""
            SELECT 
            w.id as id,
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

    @Override
    @EntityGraph(attributePaths = {"types"},
            type = EntityGraph.EntityGraphType.FETCH)
    Optional<Word> findById(Long aLong);
}
