package com.example.rorodictionarybe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Type {
    @Id
    private Long id;
    @Column(name = "name_type")
    private String nameType;

    @ManyToMany
    private Set<Word> words;

}
