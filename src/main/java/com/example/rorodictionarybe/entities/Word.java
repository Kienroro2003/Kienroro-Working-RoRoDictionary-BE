package com.example.rorodictionarybe.entities;

import com.example.rorodictionarybe.converters.BooleanConverter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
public class Word implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "word")
    @NonNull
    private String word;
    @Column(name = "word_scraping")
    @NonNull
    private String wordScraping;
    @Column(name = "meaning_scraping")
    @NonNull
    private String meaningScraping;
    @Column(name = "meaning_Translate")
    @NonNull
    private String meaningTranslate;

    @Column(name = "pronoun")
    @NonNull
    private String pronoun;

    @Column(name = "flag_used", length = 3)
    @Convert(converter = BooleanConverter.class)
    @NotNull
    private Boolean flagUsed;

    @Column(name = "created_at")
    private Date createdAt;

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

    @PrePersist
    void createAt() {
        this.createdAt = new Date();
        this.flagUsed = true;
    }
}
