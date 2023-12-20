package com.example.rorodictionarybe.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
public class Word {
    @Id
    private Long id;
    private String word;
    @Column(name = "word_scraping")
    private String wordScraping;
    @Column(name = "meaning_scraping")
    private String meaningScraping;
    @Column(name = "meaning_Translate")
    private String meaningTranslate;
    @Column(name = "pronoun")
    private String pronoun;
    @Column(name = "flag_used")
    private boolean flagUsed;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "word_type",
            joinColumns = @JoinColumn(name = "word_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private Set<Type> types = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(id, word.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
