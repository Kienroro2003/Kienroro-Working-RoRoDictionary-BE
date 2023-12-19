package com.example.rorodictionarybe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Word {
    @Id
    private Long id;
}
