package com.example.rorodictionarybe.repositories;

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

}
